package codyhuh.unusualfishmod;

import codyhuh.unusualfishmod.core.registry.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnusualFishMod.MOD_ID)
public class UnusualFishMod {
	public static final String MOD_ID = "unusualfishmod";

	public UnusualFishMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		UFItems.ITEMS.register(bus);
		UFEntities.ENTITIES.register(bus);
		UFBlocks.BLOCKS.register(bus);
		UFEnchantments.ENCHANTMENTS.register(bus);
		UFSounds.SOUND_EVENTS.register(bus);
		UFBlockEntities.BLOCK_ENTITIES.register(bus);
		UFLootModifiers.LOOT_MODIFIERS.register(bus);
		UFTabs.CREATIVE_TABS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}
}
