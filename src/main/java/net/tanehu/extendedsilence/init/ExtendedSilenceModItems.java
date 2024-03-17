
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.item.UnobtainiumIngotItem;
import net.tanehu.extendedsilence.item.StarmetalingotItem;
import net.tanehu.extendedsilence.item.RawunobtainiumItem;
import net.tanehu.extendedsilence.item.RawquadrilliumItem;
import net.tanehu.extendedsilence.item.RawmythrilchunkItem;
import net.tanehu.extendedsilence.item.RawhallowedItem;
import net.tanehu.extendedsilence.item.RawdurasteelItem;
import net.tanehu.extendedsilence.item.RawbanglumItem;
import net.tanehu.extendedsilence.item.RawadamantiteItem;
import net.tanehu.extendedsilence.item.QuadrillumIngotItem;
import net.tanehu.extendedsilence.item.MythrilIngotItem;
import net.tanehu.extendedsilence.item.MysticDustItem;
import net.tanehu.extendedsilence.item.MorkiteItem;
import net.tanehu.extendedsilence.item.ImperialdiamondItem;
import net.tanehu.extendedsilence.item.HallowedIngotItem;
import net.tanehu.extendedsilence.item.EndermitedustItem;
import net.tanehu.extendedsilence.item.EnderbrickItem;
import net.tanehu.extendedsilence.item.DurasteelIngotItem;
import net.tanehu.extendedsilence.item.DragonscaleItem;
import net.tanehu.extendedsilence.item.DragonessenceshardItem;
import net.tanehu.extendedsilence.item.DragonessenceItem;
import net.tanehu.extendedsilence.item.CarmotItem;
import net.tanehu.extendedsilence.item.BanglumIngotItem;
import net.tanehu.extendedsilence.item.AquariumItem;
import net.tanehu.extendedsilence.item.AdamantiteIngotItem;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ExtendedSilenceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedSilenceMod.MODID);
	public static final RegistryObject<Item> IMPERIALDIAMOND = REGISTRY.register("imperialdiamond", () -> new ImperialdiamondItem());
	public static final RegistryObject<Item> STARMETALINGOT = REGISTRY.register("starmetalingot", () -> new StarmetalingotItem());
	public static final RegistryObject<Item> BLOCKOFDRAGONSCALES = block(ExtendedSilenceModBlocks.BLOCKOFDRAGONSCALES);
	public static final RegistryObject<Item> DRAGONSCALE = REGISTRY.register("dragonscale", () -> new DragonscaleItem());
	public static final RegistryObject<Item> DRAGONESSENCESHARD = REGISTRY.register("dragonessenceshard", () -> new DragonessenceshardItem());
	public static final RegistryObject<Item> DRAGONESSENCE_BUCKET = REGISTRY.register("dragonessence_bucket", () -> new DragonessenceItem());
	public static final RegistryObject<Item> IMPERIALDIAMONDORE = block(ExtendedSilenceModBlocks.IMPERIALDIAMONDORE);
	public static final RegistryObject<Item> ADAMANTITE_ORE = block(ExtendedSilenceModBlocks.ADAMANTITE_ORE);
	public static final RegistryObject<Item> ADAMANTITE_BLOCK = block(ExtendedSilenceModBlocks.ADAMANTITE_BLOCK);
	public static final RegistryObject<Item> ADAMANTITE_INGOT = REGISTRY.register("adamantite_ingot", () -> new AdamantiteIngotItem());
	public static final RegistryObject<Item> AQUARIUM_ORE = block(ExtendedSilenceModBlocks.AQUARIUM_ORE);
	public static final RegistryObject<Item> AQUARIUM_BLOCK = block(ExtendedSilenceModBlocks.AQUARIUM_BLOCK);
	public static final RegistryObject<Item> BANGLUM_ORE = block(ExtendedSilenceModBlocks.BANGLUM_ORE);
	public static final RegistryObject<Item> BANGLUM_BLOCK = block(ExtendedSilenceModBlocks.BANGLUM_BLOCK);
	public static final RegistryObject<Item> AQUARIUM = REGISTRY.register("aquarium", () -> new AquariumItem());
	public static final RegistryObject<Item> BANGLUM_INGOT = REGISTRY.register("banglum_ingot", () -> new BanglumIngotItem());
	public static final RegistryObject<Item> CARMOT_ORE = block(ExtendedSilenceModBlocks.CARMOT_ORE);
	public static final RegistryObject<Item> CARMOT_BLOCK = block(ExtendedSilenceModBlocks.CARMOT_BLOCK);
	public static final RegistryObject<Item> CARMOT = REGISTRY.register("carmot", () -> new CarmotItem());
	public static final RegistryObject<Item> MORKITE_ORE = block(ExtendedSilenceModBlocks.MORKITE_ORE);
	public static final RegistryObject<Item> MORKITE_BLOCK = block(ExtendedSilenceModBlocks.MORKITE_BLOCK);
	public static final RegistryObject<Item> MORKITE = REGISTRY.register("morkite", () -> new MorkiteItem());
	public static final RegistryObject<Item> ENDERFLAME = block(ExtendedSilenceModBlocks.ENDERFLAME);
	public static final RegistryObject<Item> DURASTEEL_ORE = block(ExtendedSilenceModBlocks.DURASTEEL_ORE);
	public static final RegistryObject<Item> DURASTEEL_BLOCK = block(ExtendedSilenceModBlocks.DURASTEEL_BLOCK);
	public static final RegistryObject<Item> HALLOWED_ORE = block(ExtendedSilenceModBlocks.HALLOWED_ORE);
	public static final RegistryObject<Item> HALLOWED_BLOCK = block(ExtendedSilenceModBlocks.HALLOWED_BLOCK);
	public static final RegistryObject<Item> DURASTEEL_INGOT = REGISTRY.register("durasteel_ingot", () -> new DurasteelIngotItem());
	public static final RegistryObject<Item> HALLOWED_INGOT = REGISTRY.register("hallowed_ingot", () -> new HallowedIngotItem());
	public static final RegistryObject<Item> RAWBANGLUM = REGISTRY.register("rawbanglum", () -> new RawbanglumItem());
	public static final RegistryObject<Item> RAWADAMANTITE = REGISTRY.register("rawadamantite", () -> new RawadamantiteItem());
	public static final RegistryObject<Item> MYTHRIL_ORE = block(ExtendedSilenceModBlocks.MYTHRIL_ORE);
	public static final RegistryObject<Item> MYTHRIL_BLOCK = block(ExtendedSilenceModBlocks.MYTHRIL_BLOCK);
	public static final RegistryObject<Item> MYTHRIL_INGOT = REGISTRY.register("mythril_ingot", () -> new MythrilIngotItem());
	public static final RegistryObject<Item> RAWMYTHRILCHUNK = REGISTRY.register("rawmythrilchunk", () -> new RawmythrilchunkItem());
	public static final RegistryObject<Item> UNOBTAINIUM_ORE = block(ExtendedSilenceModBlocks.UNOBTAINIUM_ORE);
	public static final RegistryObject<Item> UNOBTAINIUM_BLOCK = block(ExtendedSilenceModBlocks.UNOBTAINIUM_BLOCK);
	public static final RegistryObject<Item> UNOBTAINIUM_INGOT = REGISTRY.register("unobtainium_ingot", () -> new UnobtainiumIngotItem());
	public static final RegistryObject<Item> QUADRILLUM_ORE = block(ExtendedSilenceModBlocks.QUADRILLUM_ORE);
	public static final RegistryObject<Item> QUADRILLUM_BLOCK = block(ExtendedSilenceModBlocks.QUADRILLUM_BLOCK);
	public static final RegistryObject<Item> QUADRILLUM_INGOT = REGISTRY.register("quadrillum_ingot", () -> new QuadrillumIngotItem());
	public static final RegistryObject<Item> IMPERIALDIAMONDBLOCK = block(ExtendedSilenceModBlocks.IMPERIALDIAMONDBLOCK);
	public static final RegistryObject<Item> DRAGONWOOD_WOOD = block(ExtendedSilenceModBlocks.DRAGONWOOD_WOOD);
	public static final RegistryObject<Item> DRAGONWOOD_LOG = block(ExtendedSilenceModBlocks.DRAGONWOOD_LOG);
	public static final RegistryObject<Item> DRAGONWOOD_PLANKS = block(ExtendedSilenceModBlocks.DRAGONWOOD_PLANKS);
	public static final RegistryObject<Item> DRAGONWOOD_LEAVES = block(ExtendedSilenceModBlocks.DRAGONWOOD_LEAVES);
	public static final RegistryObject<Item> DRAGONWOOD_STAIRS = block(ExtendedSilenceModBlocks.DRAGONWOOD_STAIRS);
	public static final RegistryObject<Item> DRAGONWOOD_SLAB = block(ExtendedSilenceModBlocks.DRAGONWOOD_SLAB);
	public static final RegistryObject<Item> DRAGONWOOD_FENCE = block(ExtendedSilenceModBlocks.DRAGONWOOD_FENCE);
	public static final RegistryObject<Item> DRAGONWOOD_FENCE_GATE = block(ExtendedSilenceModBlocks.DRAGONWOOD_FENCE_GATE);
	public static final RegistryObject<Item> DRAGONWOOD_PRESSURE_PLATE = block(ExtendedSilenceModBlocks.DRAGONWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> DRAGONWOOD_BUTTON = block(ExtendedSilenceModBlocks.DRAGONWOOD_BUTTON);
	public static final RegistryObject<Item> DRAGONWOODSAPLING = block(ExtendedSilenceModBlocks.DRAGONWOODSAPLING);
	public static final RegistryObject<Item> RAWUNOBTAINIUM = REGISTRY.register("rawunobtainium", () -> new RawunobtainiumItem());
	public static final RegistryObject<Item> RAWQUADRILLIUM = REGISTRY.register("rawquadrillium", () -> new RawquadrilliumItem());
	public static final RegistryObject<Item> RAWHALLOWED = REGISTRY.register("rawhallowed", () -> new RawhallowedItem());
	public static final RegistryObject<Item> RAWDURASTEEL = REGISTRY.register("rawdurasteel", () -> new RawdurasteelItem());
	public static final RegistryObject<Item> ENDGOLEM_SPAWN_EGG = REGISTRY.register("endgolem_spawn_egg", () -> new ForgeSpawnEggItem(ExtendedSilenceModEntities.ENDGOLEM, -769, -65536, new Item.Properties()));
	public static final RegistryObject<Item> RED_GLOW = block(ExtendedSilenceModBlocks.RED_GLOW);
	public static final RegistryObject<Item> BLACK_QUARTZ_BLOCK = block(ExtendedSilenceModBlocks.BLACK_QUARTZ_BLOCK);
	public static final RegistryObject<Item> BLACK_QUARTZ_PILLAR = block(ExtendedSilenceModBlocks.BLACK_QUARTZ_PILLAR);
	public static final RegistryObject<Item> BLACK_QUARTZ_SLAB = block(ExtendedSilenceModBlocks.BLACK_QUARTZ_SLAB);
	public static final RegistryObject<Item> BLACK_QUARTZ_STAIRS = block(ExtendedSilenceModBlocks.BLACK_QUARTZ_STAIRS);
	public static final RegistryObject<Item> BLACKQUARTZCHISELED = block(ExtendedSilenceModBlocks.BLACKQUARTZCHISELED);
	public static final RegistryObject<Item> BLACKENDSTONE = block(ExtendedSilenceModBlocks.BLACKENDSTONE);
	public static final RegistryObject<Item> ENDERBRICK = REGISTRY.register("enderbrick", () -> new EnderbrickItem());
	public static final RegistryObject<Item> BLACKENDSTONEBRICKS = block(ExtendedSilenceModBlocks.BLACKENDSTONEBRICKS);
	public static final RegistryObject<Item> REDENDERBRICK = block(ExtendedSilenceModBlocks.REDENDERBRICK);
	public static final RegistryObject<Item> ENDBRICKSLAB = block(ExtendedSilenceModBlocks.ENDBRICKSLAB);
	public static final RegistryObject<Item> ENDBRICKSTAIRS = block(ExtendedSilenceModBlocks.ENDBRICKSTAIRS);
	public static final RegistryObject<Item> REDENDBRICKSLAB = block(ExtendedSilenceModBlocks.REDENDBRICKSLAB);
	public static final RegistryObject<Item> REDENDBRICKSTAIRS = block(ExtendedSilenceModBlocks.REDENDBRICKSTAIRS);
	public static final RegistryObject<Item> GOLEMSPAWNER = block(ExtendedSilenceModBlocks.GOLEMSPAWNER);
	public static final RegistryObject<Item> BLOCKOF_DRAGON_ESSENCE = block(ExtendedSilenceModBlocks.BLOCKOF_DRAGON_ESSENCE);
	public static final RegistryObject<Item> MYSTIC_DUST = REGISTRY.register("mystic_dust", () -> new MysticDustItem());
	public static final RegistryObject<Item> ENDERMITEDUST = REGISTRY.register("endermitedust", () -> new EndermitedustItem());
	public static final RegistryObject<Item> SILENT_CAULDRON = block(ExtendedSilenceModBlocks.SILENT_CAULDRON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
