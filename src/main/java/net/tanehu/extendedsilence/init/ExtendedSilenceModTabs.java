
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtendedSilenceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtendedSilenceMod.MODID);
	public static final RegistryObject<CreativeModeTab> EXTENDED_SILENCE = REGISTRY.register("extended_silence",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.extended_silence.extended_silence")).icon(() -> new ItemStack(ExtendedSilenceModItems.IMPERIALDIAMOND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ExtendedSilenceModItems.IMPERIALDIAMOND.get());
				tabData.accept(ExtendedSilenceModItems.STARMETALINGOT.get());
				tabData.accept(ExtendedSilenceModBlocks.BLOCKOFDRAGONSCALES.get().asItem());
				tabData.accept(ExtendedSilenceModItems.DRAGONSCALE.get());
				tabData.accept(ExtendedSilenceModItems.DRAGONESSENCESHARD.get());
				tabData.accept(ExtendedSilenceModItems.DRAGONESSENCE_BUCKET.get());
				tabData.accept(ExtendedSilenceModBlocks.IMPERIALDIAMONDORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.ADAMANTITE_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.ADAMANTITE_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.ADAMANTITE_INGOT.get());
				tabData.accept(ExtendedSilenceModBlocks.AQUARIUM_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.AQUARIUM_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BANGLUM_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BANGLUM_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.AQUARIUM.get());
				tabData.accept(ExtendedSilenceModItems.BANGLUM_INGOT.get());
				tabData.accept(ExtendedSilenceModBlocks.CARMOT_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.CARMOT_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.CARMOT.get());
				tabData.accept(ExtendedSilenceModBlocks.MORKITE_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.MORKITE_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.MORKITE.get());
				tabData.accept(ExtendedSilenceModBlocks.DURASTEEL_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DURASTEEL_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.HALLOWED_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.HALLOWED_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.DURASTEEL_INGOT.get());
				tabData.accept(ExtendedSilenceModItems.HALLOWED_INGOT.get());
				tabData.accept(ExtendedSilenceModItems.RAWBANGLUM.get());
				tabData.accept(ExtendedSilenceModItems.RAWADAMANTITE.get());
				tabData.accept(ExtendedSilenceModBlocks.MYTHRIL_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.MYTHRIL_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.MYTHRIL_INGOT.get());
				tabData.accept(ExtendedSilenceModItems.RAWMYTHRILCHUNK.get());
				tabData.accept(ExtendedSilenceModBlocks.UNOBTAINIUM_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.UNOBTAINIUM_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.UNOBTAINIUM_INGOT.get());
				tabData.accept(ExtendedSilenceModBlocks.QUADRILLUM_ORE.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.QUADRILLUM_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModItems.QUADRILLUM_INGOT.get());
				tabData.accept(ExtendedSilenceModBlocks.IMPERIALDIAMONDBLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_WOOD.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_LOG.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_PLANKS.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_STAIRS.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_SLAB.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_BUTTON.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.DRAGONWOODSAPLING.get().asItem());
				tabData.accept(ExtendedSilenceModItems.RAWUNOBTAINIUM.get());
				tabData.accept(ExtendedSilenceModItems.RAWQUADRILLIUM.get());
				tabData.accept(ExtendedSilenceModItems.RAWHALLOWED.get());
				tabData.accept(ExtendedSilenceModItems.RAWDURASTEEL.get());
				tabData.accept(ExtendedSilenceModBlocks.RED_GLOW.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLACK_QUARTZ_BLOCK.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLACK_QUARTZ_PILLAR.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLACK_QUARTZ_SLAB.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLACK_QUARTZ_STAIRS.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLACKQUARTZCHISELED.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLACKENDSTONE.get().asItem());
				tabData.accept(ExtendedSilenceModItems.ENDERBRICK.get());
				tabData.accept(ExtendedSilenceModBlocks.BLACKENDSTONEBRICKS.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.REDENDERBRICK.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.ENDBRICKSLAB.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.ENDBRICKSTAIRS.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.REDENDBRICKSLAB.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.REDENDBRICKSTAIRS.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.GOLEMSPAWNER.get().asItem());
				tabData.accept(ExtendedSilenceModBlocks.BLOCKOF_DRAGON_ESSENCE.get().asItem());
				tabData.accept(ExtendedSilenceModItems.MYSTIC_DUST.get());
				tabData.accept(ExtendedSilenceModItems.ENDERMITEDUST.get());
				tabData.accept(ExtendedSilenceModBlocks.SILENT_CAULDRON.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_FENCE_GATE.get().asItem());
			tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ExtendedSilenceModItems.ENDGOLEM_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_LEAVES.get().asItem());
			tabData.accept(ExtendedSilenceModBlocks.DRAGONWOOD_FENCE.get().asItem());
		}
	}
}
