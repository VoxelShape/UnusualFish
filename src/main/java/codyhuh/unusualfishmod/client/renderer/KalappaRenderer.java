package codyhuh.unusualfishmod.client.renderer;

import codyhuh.unusualfishmod.client.UFModelLayers;
import codyhuh.unusualfishmod.client.model.KalappaModel;
import codyhuh.unusualfishmod.common.entity.ulitity.Kalappa;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import codyhuh.unusualfishmod.UnusualFishMod;
import net.minecraft.resources.ResourceLocation;

public class KalappaRenderer extends MobRenderer<Kalappa, KalappaModel<Kalappa>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(UnusualFishMod.MOD_ID, "textures/entity/kalappa.png");

	public KalappaRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new KalappaModel<>(renderManagerIn.bakeLayer(UFModelLayers.KALAPPA)), 0.2F);
	}

	@Override
	public ResourceLocation getTextureLocation(Kalappa entity) {
		return TEXTURE;
	}
}