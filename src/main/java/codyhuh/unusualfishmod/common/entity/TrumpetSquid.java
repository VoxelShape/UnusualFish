package codyhuh.unusualfishmod.common.entity;

import codyhuh.unusualfishmod.common.entity.util.BucketableWaterAnimal;
import codyhuh.unusualfishmod.core.registry.UFItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TrumpetSquid extends BucketableWaterAnimal {
	public float squidRotation;

	public TrumpetSquid(EntityType<? extends TrumpetSquid> entityType, Level level) {
		super(entityType, level);
		this.moveControl = new TrumpetSquid.MoveHelperController(this);
		this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
		this.lookControl = new SmoothSwimmingLookControl(this, 10);
	}

	@Override
	public ItemStack getBucketStack() {
		return new ItemStack(UFItems.TRUMPET_SQUID_BUCKET.get());
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 15.0D).add(Attributes.ATTACK_DAMAGE, 2.0D).add(Attributes.ARMOR, 10.0D);
	}

	@Override
	public void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 3.0D, true));
		this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, false));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 0.8D, 1) {
			@Override
			public boolean canUse() {
				return super.canUse() && isInWater();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.8D, 15) {
			@Override
			public boolean canUse() {
				return !this.mob.isInWater() && super.canUse();
			}
		});
	}

	public void aiStep() {
		if (!this.isInWater() && this.onGround && this.verticalCollision) {
			this.setDeltaMovement(this.getDeltaMovement().add(((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F), 0.4F, ((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F)));
			this.onGround = false;
			this.hasImpulse = true;
			this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getVoicePitch());
		}

		super.aiStep();
	}

	protected PathNavigation createNavigation(Level p_27480_) {
		return new WaterBoundPathNavigation(this, p_27480_);
	}

	public boolean hurt(DamageSource p_29963_, float p_29964_) {
		if (super.hurt(p_29963_, p_29964_) && this.getLastHurtByMob() != null) {
			if (!this.level.isClientSide) {
				this.spawnInk();
			}

			return true;
		} else {
			return false;
		}
	}

	private Vec3 rotateVector(Vec3 p_29986_) {
		Vec3 vec3 = p_29986_.xRot(getXRot() * ((float)Math.PI / 180F));
		return vec3.yRot(-this.yBodyRotO * ((float)Math.PI / 180F));
	}

	private void spawnInk() {
		this.playSound(SoundEvents.SQUID_SQUIRT, this.getSoundVolume(), this.getVoicePitch());
		Vec3 vec3 = this.rotateVector(new Vec3(0.0D, -0.5D, -1.0D)).add(this.getX(), this.getY(), this.getZ());

		for(int i = 0; i < 30; ++i) {
			Vec3 vec31 = this.rotateVector(new Vec3((double)this.random.nextFloat() * 0.6D - 0.3D, -1.0D, (double)this.random.nextFloat() * 0.6D - 0.3D));
			Vec3 vec32 = vec31.scale(0.3D + (double)(this.random.nextFloat() * 2.0F));
			((ServerLevel)this.level).sendParticles(ParticleTypes.SQUID_INK, vec3.x, vec3.y + 0.5D, vec3.z, 0, vec32.x, vec32.y, vec32.z, (double)0.1F);
		}
	}

	public SoundEvent getAmbientSound() {
		return SoundEvents.SQUID_AMBIENT;
	}

	public SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.SQUID_HURT;
	}

	public SoundEvent getDeathSound() {
		return SoundEvents.SQUID_DEATH;
	}

	public SoundEvent getFlopSound() {
		return SoundEvents.COD_FLOP;
	}

	public void travel(Vec3 travelVector) {
		if (this.isEffectiveAi() && this.isInWater()) {
			this.moveRelative(0.01F, travelVector);
			this.move(MoverType.SELF, this.getDeltaMovement());
			this.setDeltaMovement(this.getDeltaMovement().scale(0.9D));
			if (this.getTarget() == null) {
				this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.005D, 0.0D));
			}
		} else {
			super.travel(travelVector);
		}

	}

	@OnlyIn(Dist.CLIENT)
	public void handleEntityEvent(byte id) {
		if (id == 19) {
			this.squidRotation = 0.0F;
		} else {
			super.handleEntityEvent(id);
		}
	}

	static class MoveHelperController extends MoveControl {
		private final TrumpetSquid fish;

		MoveHelperController(TrumpetSquid fish) {
			super(fish);
			this.fish = fish;
		}

		public void tick() {
			if (this.fish.isEyeInFluid(FluidTags.WATER)) {
				this.fish.setDeltaMovement(this.fish.getDeltaMovement().add(0.0D, 0.005D, 0.0D));
			}

			if (this.operation == Operation.MOVE_TO && !this.fish.getNavigation().isDone()) {
				float f = (float) (this.speedModifier * this.fish.getAttributeValue(Attributes.MOVEMENT_SPEED));
				this.fish.setSpeed(Mth.lerp(0.125F, this.fish.getSpeed(), f));
				double d0 = this.wantedX - this.fish.getX();
				double d1 = this.wantedY - this.fish.getY();
				double d2 = this.wantedZ - this.fish.getZ();
				if (d1 != 0.0D) {
					double d3 = (double) Mth.sqrt((float) (d0 * d0 + d1 * d1 + d2 * d2));
					this.fish.setDeltaMovement(this.fish.getDeltaMovement().add(0.0D, (double) this.fish.getSpeed() * (d1 / d3) * 0.1D, 0.0D));
				}

				if (d0 != 0.0D || d2 != 0.0D) {
					float f1 = (float) (Mth.atan2(d2, d0) * (double) (180F / (float) Math.PI)) - 90.0F;
					this.fish.yRot = this.rotlerp(this.fish.yRot, f1, 90.0F);
					this.fish.yBodyRot = this.fish.yRot;
				}

			} else {
				this.fish.setSpeed(0.0F);
			}
		}

	}

	public void tick() {
		super.tick();

		if (this.level.isClientSide && this.isInWater() && this.getDeltaMovement().lengthSqr() > 0.03D) {
			Vec3 vec3 = this.getViewVector(0.0F);
			float f = Mth.cos(this.getYRot() * ((float)Math.PI / 180F)) * 0.3F;
			float f1 = Mth.sin(this.getYRot() * ((float)Math.PI / 180F)) * 0.3F;

		}

	}

	public static boolean canSpawn(EntityType<TrumpetSquid> p_223364_0_, LevelAccessor p_223364_1_, MobSpawnType reason, BlockPos p_223364_3_, RandomSource random) {
		return WaterAnimal.checkSurfaceWaterAnimalSpawnRules(p_223364_0_, p_223364_1_, reason, p_223364_3_, random);
	}

}