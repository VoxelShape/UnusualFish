package codyhuh.unusualfishmod.core.registry;

import codyhuh.unusualfishmod.UnusualFishMod;
import codyhuh.unusualfishmod.common.item.*;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public final class UFItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnusualFishMod.MOD_ID);

	private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
	private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
	private static final Component ANCIENT_WEAPON_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(UnusualFishMod.MOD_ID, "ancient_weapon_upgrade"))).withStyle(TITLE_FORMAT);
	private static final Component ANCIENT_WEAPON_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(UnusualFishMod.MOD_ID, "smithing_template.ancient_weapon_parts.applies_to"))).withStyle(DESCRIPTION_FORMAT);
	private static final Component ANCIENT_WEAPON_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(UnusualFishMod.MOD_ID, "smithing_template.ancient_weapon_parts.ingredients"))).withStyle(DESCRIPTION_FORMAT);
	private static final Component ANCIENT_WEAPON_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(UnusualFishMod.MOD_ID, "smithing_template.ancient_weapon_parts.base_slot_description")));
	private static final Component ANCIENT_WEAPON_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(UnusualFishMod.MOD_ID, "smithing_template.ancient_weapon_parts.additions_slot_description")));
	private static final ResourceLocation EMPTY_SLOT_WEAPON_PARTS = new ResourceLocation(UnusualFishMod.MOD_ID, "item/empty_slot_weapon_parts");
	private static final ResourceLocation EMPTY_SLOT_DEPTH_CLAW = new ResourceLocation(UnusualFishMod.MOD_ID, "item/empty_slot_depth_claw");
	private static final ResourceLocation EMPTY_SLOT_RIPPER_TOOTH = new ResourceLocation(UnusualFishMod.MOD_ID, "item/empty_slot_ripper_tooth");

	// Foods
	public static final RegistryObject<Item> RAW_EYELASH = ITEMS.register("raw_eyelash", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_EYELASH)));
	public static final RegistryObject<Item> RAW_SPINDLEFISH = ITEMS.register("raw_spindlefish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_SPINDLEFISH)));
	public static final RegistryObject<Item> RAW_SNOWFLAKE = ITEMS.register("raw_snowflake", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_SNOWFLAKE)));
	public static final RegistryObject<Item> RAW_AERO_MONO = ITEMS.register("raw_aero_mono", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_AERO_MONO)));
	public static final RegistryObject<Item> RAW_PICKLEFSIH = ITEMS.register("raw_picklefish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_PICKLEFISH)));
	public static final RegistryObject<Item> RAW_AMBER_GOBY = ITEMS.register("raw_amber_goby", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_AMBER_GOBY)));
	public static final RegistryObject<Item> RAW_BEAKED_HERRING = ITEMS.register("raw_beaked_herring", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_BEAKED_HERRING)));
	public static final RegistryObject<Item> RAW_BLIND_SAILFIN = ITEMS.register("raw_blind_sailfin", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_BLIND_SAILFIN)));
	public static final RegistryObject<Item> RAW_CIRCUS_FISH = ITEMS.register("raw_circus_fish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_CIRCUS_FISH)));
	public static final RegistryObject<Item> RAW_COPPERFLAME_ANTHIAS = ITEMS.register("raw_copperflame_anthias", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_COPPERFLAME_ANTHIAS)));
	public static final RegistryObject<Item> RAW_DEMON_HERRING = ITEMS.register("raw_demon_herring", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_DEMON_HERRING)));
	public static final RegistryObject<Item> RAW_DROOPING_GOURAMI = ITEMS.register("raw_drooping_gourami", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_DROOPING_GOURAMI)));
	public static final RegistryObject<Item> RAW_DUALITY_DAMSELFISH = ITEMS.register("raw_duality_damselfish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_DUALITY_DAMSELFISH)));
	public static final RegistryObject<Item> RAW_FORKFISH = ITEMS.register("raw_forkfish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_FORKFISH)));
	public static final RegistryObject<Item> RAW_HATCHETFISH = ITEMS.register("raw_hatchetfish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_HATCHETFISH)));
	public static final RegistryObject<Item> RAW_SNEEP_SNORP = ITEMS.register("raw_sneep_snorp", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_SNEEP_SNORP)));
	public static final RegistryObject<Item> RAW_TRIPLE_TWIRL_PLECO = ITEMS.register("raw_triple_twirl_pleco", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_TRIPLE_TWIRL_PLECO)));
	//public static final RegistryObject<Item> UNUSUAL_FILLET = ITEMS.register("unusual_fillet", () -> new Item(new Item.Properties().food(UFFoodProperties.UNUSUAL_FILLET)));

	public static final RegistryObject<Item> RAW_AERO_MONO_STICK = ITEMS.register("raw_aero_mono_stick", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_AERO_MONO_STICK)));
	public static final RegistryObject<Item> COOKED_AERO_MONO_STICK = ITEMS.register("cooked_aero_mono_stick", () -> new Item(new Item.Properties().food(UFFoodProperties.COOKED_AERO_MONO_STICK)));
	//public static final RegistryObject<Item> RAW_BUMPFACE = ITEMS.register("raw_bumpface", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_BUMPFACE)));
	public static final RegistryObject<Item> RAW_SAILOR_BARB = ITEMS.register("raw_sailor_barb", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_SAILOR_BARB)));
	public static final RegistryObject<Item> RAW_BARK_ANGELFISH = ITEMS.register("raw_bark_angelfish", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_BARK_ANGELFISH)));
	public static final RegistryObject<Item> RAW_BLIZZARD_TUNA = ITEMS.register("raw_blizzard_tuna", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_BLIZZARD_TUNA)));
	public static final RegistryObject<Item> COOKED_BLIZZARD_TUNA = ITEMS.register("cooked_blizzard_tuna", () -> new Item(new Item.Properties().food(UFFoodProperties.COOKED_BLIZZARD_TUNA)));
	public static final RegistryObject<Item> RAW_SHOCKCAT = ITEMS.register("raw_shockcat", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_SHOCKCAT)));
	public static final RegistryObject<Item> COOKED_SHOCKCAT = ITEMS.register("cooked_shockcat", () -> new Item(new Item.Properties().food(UFFoodProperties.COOKED_SHOCKCAT)));
	public static final RegistryObject<Item> RAW_LOBSTER = ITEMS.register("raw_lobster", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_LOBSTER)));
	public static final RegistryObject<Item> COOKED_LOBSTER = ITEMS.register("cooked_lobster", () -> new Item(new Item.Properties().food(UFFoodProperties.COOKED_LOBSTER)));
	public static final RegistryObject<Item> RAW_MOSSTHORN = ITEMS.register("raw_mossthorn", () -> new Item(new Item.Properties().food(UFFoodProperties.RAW_MOSSTHORN)));
	public static final RegistryObject<Item> COOKED_MOSSTHORN = ITEMS.register("cooked_mossthorn", () -> new Item(new Item.Properties().food(UFFoodProperties.COOKED_MOSSTHORN)));
	public static final RegistryObject<Item> COOKED_UNUSUAL_FILLET = ITEMS.register("cooked_unusual_fillet", () -> new Item(new Item.Properties().food(UFFoodProperties.COOKED_UNUSUAL_FILLET)));
	public static final RegistryObject<Item> LOBSTER_ROLL = ITEMS.register("lobster_roll", () -> new Item(new Item.Properties().food(UFFoodProperties.LOBSTER_ROLL)));
	public static final RegistryObject<Item> ODD_FISHSTICKS = ITEMS.register("odd_fishsticks", () -> new Item(new Item.Properties().food(UFFoodProperties.ODD_FISHSTICKS)));
	public static final RegistryObject<Item> PICKLEDISH = ITEMS.register("pickledish", () -> new BowlFoodItem(new Item.Properties().food(UFFoodProperties.PICKLEDISH).stacksTo(1)));
	public static final RegistryObject<Item> STRANGE_BROTH = ITEMS.register("strange_broth", () -> new BowlFoodItem(new Item.Properties().food(UFFoodProperties.STRANGE_BROTH).stacksTo(1)));
	public static final RegistryObject<Item> UNUSUAL_SANDWICH = ITEMS.register("unusual_sandwich", () -> new Item(new Item.Properties().food(UFFoodProperties.UNUSUAL_SANDWICH)));
	public static final RegistryObject<Item> WEIRD_GOLDFISH = ITEMS.register("weird_goldfish", () -> new Item(new Item.Properties().food(UFFoodProperties.WEIRD_GOLDFISH)));

	// Drops
	public static final RegistryObject<Item> TENDRIL = ITEMS.register("tendril", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> RIPPER_TOOTH = ITEMS.register("ripper_tooth", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> LOBSTER_SPIKE = ITEMS.register("lobster_spike", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> RELUCENT_SHARD = ITEMS.register("relucent_shard", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_SHARD = ITEMS.register("crimson_shard", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> DEPTH_CLAW = ITEMS.register("depth_claw", () -> new Item(new Item.Properties()));

	// Gear
	public static final RegistryObject<Item> DEPTH_SCYTHE = ITEMS.register("depth_scythe", () -> new DepthScytheItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().durability(600)));
	public static final RegistryObject<Item> RIPSAW = ITEMS.register("ripsaw", () -> new RipsawItem(new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> FLUVIAL_SHELL = ITEMS.register("fluvial_shell", () -> new WeatherShellItem("rain", new Item.Properties().stacksTo(1).durability(1)));
	public static final RegistryObject<Item> CLEMENT_SHELL = ITEMS.register("clement_shell", () -> new WeatherShellItem("clear", new Item.Properties().stacksTo(1).durability(1)));
	public static final RegistryObject<Item> THUNDEROUS_SHELL = ITEMS.register("thunderous_shell", () -> new WeatherShellItem("thunder", new Item.Properties().stacksTo(1).durability(1)));
	public static final RegistryObject<Item> PRISMARINE_SPEAR = ITEMS.register("prismarine_spear", () -> new PrismarineSpearItem(new Item.Properties().stacksTo(1).durability(100)));
	public static final RegistryObject<Item> WEAPON_PARTS = ITEMS.register("weapon_parts", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> ANCIENT_WEAPON_SMITHING_TEMPLATE = ITEMS.register("ancient_weapon_smithing_template", () -> new SmithingTemplateItem(ANCIENT_WEAPON_APPLIES_TO, ANCIENT_WEAPON_INGREDIENTS, ANCIENT_WEAPON_UPGRADE, ANCIENT_WEAPON_ADDITIONS_SLOT_DESCRIPTION, ANCIENT_WEAPON_BASE_SLOT_DESCRIPTION, List.of(EMPTY_SLOT_WEAPON_PARTS), List.of(EMPTY_SLOT_DEPTH_CLAW, EMPTY_SLOT_RIPPER_TOOTH)));
	public static final RegistryObject<Item> MUSIC_DISC_SEAFOAM = ITEMS.register("music_disc_seafoam", () -> new RecordItem(1, UFSounds.MUSIC_DISC_SEAFOAM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 155 * 20));
	//public static final RegistryObject<Item> STARGAZER = ITEMS.register("stargazer", () -> new StargazerItem(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));

	// Buckets
	public static final RegistryObject<Item> AERO_MONO_BUCKET = ITEMS.register("aero_mono_bucket", () -> new UFFishBucketItem(UFEntities.AERO_MONO, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	//public static final RegistryObject<Item> RHINO_TETRA_BUCKET = ITEMS.register("rhino_tetra_bucket", () -> new UFFishBucketItem(UFEntities.RHINO_TETRA, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> DUALITY_DAMSELFISH_BUCKET = ITEMS.register("duality_damselfish_bucket", () -> new UFFishBucketItem(UFEntities.DUALITY_DAMSELFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> DROOPING_GOURAMI_BUCKET = ITEMS.register("drooping_gourami_bucket", () -> new UFFishBucketItem(UFEntities.DROOPING_GOURAMI, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> MOSSTHORN_BUCKET = ITEMS.register("mossthorn_bucket", () -> new UFFishBucketItem(UFEntities.MOSSTHORN, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SAILOR_BARB_BUCKET = ITEMS.register("sailor_barb_bucket", () -> new UFFishBucketItem(UFEntities.SAILOR_BARB, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TRIPLE_TWIRL_PLECO_BUCKET = ITEMS.register("triple_twirl_pleco_bucket", () -> new UFFishBucketItem(UFEntities.TRIPLE_TWIRL_PLECO, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SPINDLEFISH_BUCKET = ITEMS.register("spindlefish_bucket", () -> new UFFishBucketItem(UFEntities.SPINDLEFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> RIPPER_BUCKET = ITEMS.register("ripper_bucket", () -> new UFFishBucketItem(UFEntities.RIPPER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SEA_SPIDER_BUCKET = ITEMS.register("sea_spider_bucket", () -> new UFFishBucketItem(UFEntities.SEA_SPIDER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> CLOWNTHORN_SHARK_BUCKET = ITEMS.register("clownthorn_shark_bucket", () -> new UFFishBucketItem(UFEntities.CLOWNTHORN_SHARK, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SNEEPSNORP_BUCKET = ITEMS.register("sneepsnorp_bucket", () -> new UFFishBucketItem(UFEntities.SNEEPSNORP, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> BLACKCAP_SNAIL_BUCKET = ITEMS.register("blackcap_snail_bucket", () -> new UFFishBucketItem(UFEntities.BLACKCAP_SNAIL, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> BRICK_SNAIL_BUCKET = ITEMS.register("brick_snail_bucket", () -> new UFFishBucketItem(UFEntities.BRICK_SNAIL, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> DEEP_CRAWLER_BUCKET = ITEMS.register("deep_crawler_bucket", () -> new UFFishBucketItem(UFEntities.DEEP_CRAWLER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> WIZARD_JELLY_BUCKET = ITEMS.register("wizard_jelly_bucket", () -> new UFFishBucketItem(UFEntities.WIZARD_JELLY, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> PORCUPINE_LOBSTA_BUCKET = ITEMS.register("porcupine_lobsta_bucket", () -> new UFFishBucketItem(UFEntities.PORCUPINE_LOBSTA, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> FRESHWATER_MANTIS_BUCKET = ITEMS.register("freshwater_mantis_bucket", () -> new UFFishBucketItem(UFEntities.FRESHWATER_MANTIS, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> BARK_ANGELFISH_BUCKET = ITEMS.register("bark_angelfish_bucket", () -> new UFFishBucketItem(UFEntities.BARK_ANGELFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SKIPPER_BUCKET = ITEMS.register("lobed_skipper_bucket", () -> new UFFishBucketItem(UFEntities.LOBED_SKIPPER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> BEAKED_HERRING_BUCKET = ITEMS.register("beaked_herring_bucket", () -> new UFFishBucketItem(UFEntities.BEAKED_HERRING, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> PICKLEFISH_BUCKET = ITEMS.register("picklefish_bucket", () -> new UFFishBucketItem(UFEntities.PICKLEFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> BLIND_SAILFIN_BUCKET = ITEMS.register("blind_sailfin_bucket", () -> new UFFishBucketItem(UFEntities.BLIND_SAILFIN, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> DEMON_HERRING_BUCKET = ITEMS.register("demon_herring_bucket", () -> new UFFishBucketItem(UFEntities.DEMON_HERRING, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> AMBER_GOBY_BUCKET = ITEMS.register("amber_goby_bucket", () -> new UFFishBucketItem(UFEntities.AMBER_GOBY, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> HATCHET_FISH_BUCKET = ITEMS.register("hatchet_fish_bucket", () -> new UFFishBucketItem(UFEntities.HATCHET_FISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> COPPERFLAME_BUCKET = ITEMS.register("copperflame_bucket", () -> new UFFishBucketItem(UFEntities.COPPERFLAME, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SQUODDLE_BUCKET = ITEMS.register("squoddle_bucket", () -> new UFFishBucketItem(UFEntities.SQUODDLE, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SEA_MOSQUITO_BUCKET = ITEMS.register("sea_mosquito_bucket", () -> new UFFishBucketItem(UFEntities.SEA_MOSQUITO, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> FORKFISH_BUCKET = ITEMS.register("forkfish_bucket", () -> new UFFishBucketItem(UFEntities.FORKFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SPOON_SHARK_BUCKET = ITEMS.register("spoon_shark_bucket", () -> new UFFishBucketItem(UFEntities.SPOON_SHARK, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> CORAL_SKRIMP_BUCKET = ITEMS.register("coral_skrimp_bucket", () -> new UFFishBucketItem(UFEntities.CORAL_SKRIMP, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> CIRCUS_FISH_BUCKET = ITEMS.register("circus_fish_bucket", () -> new UFFishBucketItem(UFEntities.CIRCUS_FISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> EYELASH_FISH_BUCKET = ITEMS.register("eyelash_fish_bucket", () -> new UFFishBucketItem(UFEntities.EYELASH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SNOWFLAKE_TAIL_FISH_BUCKET = ITEMS.register("snowflake_tail_fish_bucket", () -> new UFFishBucketItem(UFEntities.SNOWFLAKE, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> CRIMSONSHELL_SQUID_BUCKET = ITEMS.register("crimsonshell_squid_bucket", () -> new UFFishBucketItem(UFEntities.CRIMSONSHELL_SQUID, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> VOLT_ANGLER_BUCKET = ITEMS.register("volt_angler_bucket", () -> new UFFishBucketItem(UFEntities.VOLT_ANGLER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> BLIZZARDFIN_BUCKET = ITEMS.register("blizzardfin_bucket", () -> new UFFishBucketItem(UFEntities.BLIZZARDFIN_TUNA, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> MUDDYTOP_SNAIL_BUCKET = ITEMS.register("muddytop_snail_bucket", () -> new UFFishBucketItem(UFEntities.MUDDYTOP_SNAIL, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SHOCKCAT_BUCKET = ITEMS.register("shockcat_bucket", () -> new UFFishBucketItem(UFEntities.SHOCKCAT, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> PINKFIN_IDOL_BUCKET = ITEMS.register("pinkfin_idol_bucket", () -> new UFFishBucketItem(UFEntities.PINKFIN, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TIGER_PUFFER_BUCKET = ITEMS.register("tiger_puffer_bucket", () -> new UFFishBucketItem(UFEntities.TIGER_PUFFER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> STOUT_BICHIR_BUCKET = ITEMS.register("stout_bichir_bucket", () -> new UFFishBucketItem(UFEntities.STOUT_BICHIR, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TRIBBLE_BUCKET = ITEMS.register("tribble_bucket", () -> new UFFishBucketItem(UFEntities.TRIBBLE, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> TRUMPET_SQUID_BUCKET = ITEMS.register("trumpet_squid_bucket", () -> new UFFishBucketItem(UFEntities.TRUMPET_SQUID, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().stacksTo(1)));

	// Spawn Eggs
	public static final RegistryObject<ForgeSpawnEggItem> AERO_MONO_SPAWN_EGG = ITEMS.register("aero_mono_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.AERO_MONO, 0x8ca8b5, 0x506884, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> PINKFIN_SPAWN_EGG = ITEMS.register("pinkfin_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.PINKFIN, 0x0e011e, 0x421054, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BARBED_SPAWN_EGG = ITEMS.register("roughback_guitarfish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.ROUGHBACK, 0x5e5d4f, 0x92998e, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> CLOWNTHORN_SPAWN_EGG = ITEMS.register("clownthorn_shark_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.CLOWNTHORN_SHARK, 0xbe5515, 0xa21e00, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> DUALITY_SPAWN_EGG = ITEMS.register("duality_damselfish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.DUALITY_DAMSELFISH, 0x8a94a1, 0x2c3338, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> DROOPING_GOURAMI_SPAWN_EGG = ITEMS.register("drooping_gourami_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.DROOPING_GOURAMI, 0x54434d, 0x363243, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> MOSSTHORN_SPAWN_EGG = ITEMS.register("mossthorn_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.MOSSTHORN, 0x26a529, 0x034223, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> RHINO_TETRA_SPAWN_EGG = ITEMS.register("rhino_tetra_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.RHINO_TETRA, 0x919187, 0x7b2726, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> RIPPER_SPAWN_EGG = ITEMS.register("ripper_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.RIPPER, 0x565950, 0x8f9386, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SAILOR_BARB_PAWN_EGG = ITEMS.register("sailor_barb_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SAILOR_BARB, 0x5e6a25, 0xa1a68c, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SEA_PANCAKE_SPAWN_EGG = ITEMS.register("sea_pancake_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SEA_PANCAKE, 0xbda877, 0xdfcbb7, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SEA_SPIDER_SPAWN_EGG = ITEMS.register("sea_spider_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SEA_SPIDER, 0x774128, 0xaf7834, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SPINDLEFISH_SPAWN_EGG = ITEMS.register("spindlefish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SPINDLEFISH, 0x8e2573, 0xc14aeb, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> TRIPLE_TWIRL_PLECO_SPAWN_EGG = ITEMS.register("triple_twirl_pleco_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.TRIPLE_TWIRL_PLECO, 0xc1923a, 0x903113, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BRICK_SNAIL_SPAWN_EGG = ITEMS.register("brick_snail_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.BRICK_SNAIL, 0xb5553b, 0x674f17, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> ZEBRA_CORNETFISH_SPAWN_EGG = ITEMS.register("zebra_cornetfish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.ZEBRA_CORNETFISH , 0x153957, 0xc7ad0d, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> TIGER_PUFFER_SPAWN_EGG = ITEMS.register("tiger_puffer_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.TIGER_PUFFER, 0x622814, 0x84736f, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BLACKCAP_SNAIL_SPAWN_EGG = ITEMS.register("blackcap_snail_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.BLACKCAP_SNAIL, 0x262917, 0x4c3d27, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SNEEPSNORP_EGG = ITEMS.register("sneepsnorp_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SNEEPSNORP, 0x3347a7, 0xce8a24, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> DEEP_CRAWLER_SPAWN_EGG = ITEMS.register("deep_crawler_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.DEEP_CRAWLER, 0x536761, 0x34363f, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> WIZARD_JELLY_SPAWN_EGG = ITEMS.register("wizard_jelly_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.WIZARD_JELLY, 0x5550b4, 0x3aa8d7, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> PORCUPINE_LOBSTA_SPAWN_EGG = ITEMS.register("porcupine_lobsta_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.PORCUPINE_LOBSTA, 0x624736, 0x9e521b, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> TRUMPET_SQUID_SPAWN_EGG = ITEMS.register("trumpet_squid_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.TRUMPET_SQUID, 0xe8d26a, 0xc6a042, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> FRESHWATER_MANTIS_EGG = ITEMS.register("freshwater_mantis_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.FRESHWATER_MANTIS, 0x454629, 0x94ab67, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BARK_ANGELFISH_SPAWN_EGG = ITEMS.register("bark_angelfish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.BARK_ANGELFISH, 0x553f1a, 0x35270a, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SHOCKCAT_SPAWN_EGG = ITEMS.register("shockcat_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SHOCKCAT, 0x34294f, 0x255f9b, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> MUDDYTOP_SNAIL_SPAWN_EGG = ITEMS.register("muddytop_snail_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.MUDDYTOP_SNAIL, 0x23100e, 0x5f4d3b, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> KALAPPA_SPAWN_EGG = ITEMS.register("kalappa_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.KALAPPA, 0x624051, 0x886d86, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> LOBED_SKIPPER_SPAWN_EGG = ITEMS.register("lobed_skipper_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.LOBED_SKIPPER, 0x4b2618, 0x9e632f, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> STOUT_BICHIR_SPAWN_EGG = ITEMS.register("stout_bichir_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.STOUT_BICHIR, 0x5a5e3d, 0xb08f33, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BEAKED_HERRING_SPAWN_EGG = ITEMS.register("beaked_herring_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.BEAKED_HERRING, 0x8bacc4, 0xc5d0cf, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> PICKLEFISH_SPAWN_EGG = ITEMS.register("picklefish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.PICKLEFISH, 0x235806, 0xd0cd07, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BLIND_SAILFIN_SPAWN_EGG = ITEMS.register("blind_sailfin_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.BLIND_SAILFIN, 0xdcccc3, 0xc19c8e, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> DEMON_HERRING_SPAWN_EGG = ITEMS.register("demon_herring_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.DEMON_HERRING, 0x363243, 0xef7930, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> AMBER_GOBY_SPAWN_EGG = ITEMS.register("amber_goby_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.AMBER_GOBY, 0xfb912e, 0xae5e2c, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> HATCHET_FISH_SPAWN_EGG = ITEMS.register("hatchet_fish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.HATCHET_FISH, 0x0b0b26, 0x7d3283, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> COPPERFLAME_SPAWN_EGG = ITEMS.register("copperflame_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.COPPERFLAME, 0x4fab90, 0x7fcf90, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> ROOTBALL_SPAWN_EGG = ITEMS.register("root_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.ROOTBALL, 0x647233, 0xad7d65, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> CELESTIAL_FISH_SPAWN_EGG = ITEMS.register("celestial_fish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.CELESTIAL_FISH, 0x6876a2, 0xe2e4c5, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> GNASHER_SPAWN_EGG = ITEMS.register("gnasher_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.GNASHER, 0x323232, 0x465bb2, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> PRAWN_SPAWN_EGG = ITEMS.register("prawn_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.PRAWN, 0x5a579e, 0x4694d1, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SQUODDLE_SPAWN_EGG = ITEMS.register("squoddle_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SQUODDLE, 0xb37817, 0xe58a2e, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SEA_MOSQUITO_SPAWN_EGG = ITEMS.register("sea_mosquito_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SEA_MOSQUITO, 0x326934, 0x6c122f, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> FORKFISH_SPAWN_EGG = ITEMS.register("forkfish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.FORKFISH, 0x8e882c, 0x3dbba0, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SPOON_SHARK_SPAWN_EGG = ITEMS.register("spoon_shark_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SPOON_SHARK, 0xddbd78, 0xb3925b, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> CORAL_SKRIMP_EGG = ITEMS.register("coral_skrimp_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.CORAL_SKRIMP, 0x5a0e7a, 0xb34aa2, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> CIRCUS_FISH_SPAWN_EGG = ITEMS.register("circus_fish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.CIRCUS_FISH, 0xab4b36, 0xc88f62, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> BLIZZARDFIN_SPAWN_EGG = ITEMS.register("blizzardfin_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.BLIZZARDFIN_TUNA, 0x9ed7dc, 0x6182a6, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> EYELASH_FISH_SPAWN_EGG = ITEMS.register("eyelash_fish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.EYELASH, 0xb7b7ba, 0xfcfcfa, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> SNOWFLAKE_TAIL_FISH_SPAWN_EGG = ITEMS.register("snowflake_tail_fish_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.SNOWFLAKE, 0x649ccc, 0xcbe8e6, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> TIGER_JUNGLE_SHARK_SPAWN_EGG = ITEMS.register("tiger_jungle_shark_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.TIGER_JUNGLE_SHARK, 0x272530, 0xa5a8c6, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> CRIMSONSHELL_SQUID_SPAWN_EGG = ITEMS.register("crimsonshell_squid_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.CRIMSONSHELL_SQUID, 0xab101c, 0x432c39, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> VOLT_ANGLER_SPAWN_EGG = ITEMS.register("volt_angler_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.VOLT_ANGLER, 0x2d4035, 0x509033, new Item.Properties()));
	public static final RegistryObject<ForgeSpawnEggItem> TRIBBLE_SPAWN_EGG = ITEMS.register("tribble_spawn_egg", () -> new ForgeSpawnEggItem(UFEntities.TRIBBLE, 0x656f26, 0x46491a, new Item.Properties()));
}
