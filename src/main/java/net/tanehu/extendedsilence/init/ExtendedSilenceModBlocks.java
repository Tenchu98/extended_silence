
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.block.UnobtainiumOreBlock;
import net.tanehu.extendedsilence.block.UnobtainiumBlockBlock;
import net.tanehu.extendedsilence.block.SilentCauldronBlock;
import net.tanehu.extendedsilence.block.RedenderbrickBlock;
import net.tanehu.extendedsilence.block.RedendbrickstairsBlock;
import net.tanehu.extendedsilence.block.RedendbrickslabBlock;
import net.tanehu.extendedsilence.block.RedGlowBlock;
import net.tanehu.extendedsilence.block.QuadrillumOreBlock;
import net.tanehu.extendedsilence.block.QuadrillumBlockBlock;
import net.tanehu.extendedsilence.block.MythrilOreBlock;
import net.tanehu.extendedsilence.block.MythrilBlockBlock;
import net.tanehu.extendedsilence.block.MorkiteOreBlock;
import net.tanehu.extendedsilence.block.MorkiteBlockBlock;
import net.tanehu.extendedsilence.block.ImperialdiamondoreBlock;
import net.tanehu.extendedsilence.block.ImperialdiamondblockBlock;
import net.tanehu.extendedsilence.block.HallowedOreBlock;
import net.tanehu.extendedsilence.block.HallowedBlockBlock;
import net.tanehu.extendedsilence.block.GolemspawnerBlock;
import net.tanehu.extendedsilence.block.EnderflameBlock;
import net.tanehu.extendedsilence.block.EndbrickstairsBlock;
import net.tanehu.extendedsilence.block.EndbrickslabBlock;
import net.tanehu.extendedsilence.block.DurasteelOreBlock;
import net.tanehu.extendedsilence.block.DurasteelBlockBlock;
import net.tanehu.extendedsilence.block.DragonwoodsaplingBlock;
import net.tanehu.extendedsilence.block.DragonwoodWoodBlock;
import net.tanehu.extendedsilence.block.DragonwoodStairsBlock;
import net.tanehu.extendedsilence.block.DragonwoodSlabBlock;
import net.tanehu.extendedsilence.block.DragonwoodPressurePlateBlock;
import net.tanehu.extendedsilence.block.DragonwoodPlanksBlock;
import net.tanehu.extendedsilence.block.DragonwoodLogBlock;
import net.tanehu.extendedsilence.block.DragonwoodLeavesBlock;
import net.tanehu.extendedsilence.block.DragonwoodFenceGateBlock;
import net.tanehu.extendedsilence.block.DragonwoodFenceBlock;
import net.tanehu.extendedsilence.block.DragonwoodButtonBlock;
import net.tanehu.extendedsilence.block.DragonessenceBlock;
import net.tanehu.extendedsilence.block.CarmotOreBlock;
import net.tanehu.extendedsilence.block.CarmotBlockBlock;
import net.tanehu.extendedsilence.block.BlockofdragonscalesBlock;
import net.tanehu.extendedsilence.block.BlockofblackquartzBlock;
import net.tanehu.extendedsilence.block.BlockofDragonEssenceBlock;
import net.tanehu.extendedsilence.block.BlackquartzstairsBlock;
import net.tanehu.extendedsilence.block.BlackquartzslabBlock;
import net.tanehu.extendedsilence.block.BlackquartzpillarBlock;
import net.tanehu.extendedsilence.block.BlackquartzchiseledBlock;
import net.tanehu.extendedsilence.block.BlackendstonebricksBlock;
import net.tanehu.extendedsilence.block.BlackendstoneBlock;
import net.tanehu.extendedsilence.block.BanglumOreBlock;
import net.tanehu.extendedsilence.block.BanglumBlockBlock;
import net.tanehu.extendedsilence.block.AquariumOreBlock;
import net.tanehu.extendedsilence.block.AquariumBlockBlock;
import net.tanehu.extendedsilence.block.AdamantiteOreBlock;
import net.tanehu.extendedsilence.block.AdamantiteBlockBlock;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ExtendedSilenceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedSilenceMod.MODID);
	public static final RegistryObject<Block> BLOCKOFDRAGONSCALES = REGISTRY.register("blockofdragonscales", () -> new BlockofdragonscalesBlock());
	public static final RegistryObject<Block> DRAGONESSENCE = REGISTRY.register("dragonessence", () -> new DragonessenceBlock());
	public static final RegistryObject<Block> IMPERIALDIAMONDORE = REGISTRY.register("imperialdiamondore", () -> new ImperialdiamondoreBlock());
	public static final RegistryObject<Block> ADAMANTITE_ORE = REGISTRY.register("adamantite_ore", () -> new AdamantiteOreBlock());
	public static final RegistryObject<Block> ADAMANTITE_BLOCK = REGISTRY.register("adamantite_block", () -> new AdamantiteBlockBlock());
	public static final RegistryObject<Block> AQUARIUM_ORE = REGISTRY.register("aquarium_ore", () -> new AquariumOreBlock());
	public static final RegistryObject<Block> AQUARIUM_BLOCK = REGISTRY.register("aquarium_block", () -> new AquariumBlockBlock());
	public static final RegistryObject<Block> BANGLUM_ORE = REGISTRY.register("banglum_ore", () -> new BanglumOreBlock());
	public static final RegistryObject<Block> BANGLUM_BLOCK = REGISTRY.register("banglum_block", () -> new BanglumBlockBlock());
	public static final RegistryObject<Block> CARMOT_ORE = REGISTRY.register("carmot_ore", () -> new CarmotOreBlock());
	public static final RegistryObject<Block> CARMOT_BLOCK = REGISTRY.register("carmot_block", () -> new CarmotBlockBlock());
	public static final RegistryObject<Block> MORKITE_ORE = REGISTRY.register("morkite_ore", () -> new MorkiteOreBlock());
	public static final RegistryObject<Block> MORKITE_BLOCK = REGISTRY.register("morkite_block", () -> new MorkiteBlockBlock());
	public static final RegistryObject<Block> ENDERFLAME = REGISTRY.register("enderflame", () -> new EnderflameBlock());
	public static final RegistryObject<Block> DURASTEEL_ORE = REGISTRY.register("durasteel_ore", () -> new DurasteelOreBlock());
	public static final RegistryObject<Block> DURASTEEL_BLOCK = REGISTRY.register("durasteel_block", () -> new DurasteelBlockBlock());
	public static final RegistryObject<Block> HALLOWED_ORE = REGISTRY.register("hallowed_ore", () -> new HallowedOreBlock());
	public static final RegistryObject<Block> HALLOWED_BLOCK = REGISTRY.register("hallowed_block", () -> new HallowedBlockBlock());
	public static final RegistryObject<Block> MYTHRIL_ORE = REGISTRY.register("mythril_ore", () -> new MythrilOreBlock());
	public static final RegistryObject<Block> MYTHRIL_BLOCK = REGISTRY.register("mythril_block", () -> new MythrilBlockBlock());
	public static final RegistryObject<Block> UNOBTAINIUM_ORE = REGISTRY.register("unobtainium_ore", () -> new UnobtainiumOreBlock());
	public static final RegistryObject<Block> UNOBTAINIUM_BLOCK = REGISTRY.register("unobtainium_block", () -> new UnobtainiumBlockBlock());
	public static final RegistryObject<Block> QUADRILLUM_ORE = REGISTRY.register("quadrillum_ore", () -> new QuadrillumOreBlock());
	public static final RegistryObject<Block> QUADRILLUM_BLOCK = REGISTRY.register("quadrillum_block", () -> new QuadrillumBlockBlock());
	public static final RegistryObject<Block> IMPERIALDIAMONDBLOCK = REGISTRY.register("imperialdiamondblock", () -> new ImperialdiamondblockBlock());
	public static final RegistryObject<Block> DRAGONWOOD_WOOD = REGISTRY.register("dragonwood_wood", () -> new DragonwoodWoodBlock());
	public static final RegistryObject<Block> DRAGONWOOD_LOG = REGISTRY.register("dragonwood_log", () -> new DragonwoodLogBlock());
	public static final RegistryObject<Block> DRAGONWOOD_PLANKS = REGISTRY.register("dragonwood_planks", () -> new DragonwoodPlanksBlock());
	public static final RegistryObject<Block> DRAGONWOOD_LEAVES = REGISTRY.register("dragonwood_leaves", () -> new DragonwoodLeavesBlock());
	public static final RegistryObject<Block> DRAGONWOOD_STAIRS = REGISTRY.register("dragonwood_stairs", () -> new DragonwoodStairsBlock());
	public static final RegistryObject<Block> DRAGONWOOD_SLAB = REGISTRY.register("dragonwood_slab", () -> new DragonwoodSlabBlock());
	public static final RegistryObject<Block> DRAGONWOOD_FENCE = REGISTRY.register("dragonwood_fence", () -> new DragonwoodFenceBlock());
	public static final RegistryObject<Block> DRAGONWOOD_FENCE_GATE = REGISTRY.register("dragonwood_fence_gate", () -> new DragonwoodFenceGateBlock());
	public static final RegistryObject<Block> DRAGONWOOD_PRESSURE_PLATE = REGISTRY.register("dragonwood_pressure_plate", () -> new DragonwoodPressurePlateBlock());
	public static final RegistryObject<Block> DRAGONWOOD_BUTTON = REGISTRY.register("dragonwood_button", () -> new DragonwoodButtonBlock());
	public static final RegistryObject<Block> DRAGONWOODSAPLING = REGISTRY.register("dragonwoodsapling", () -> new DragonwoodsaplingBlock());
	public static final RegistryObject<Block> RED_GLOW = REGISTRY.register("red_glow", () -> new RedGlowBlock());
	public static final RegistryObject<Block> BLACK_QUARTZ_BLOCK = REGISTRY.register("black_quartz_block", () -> new BlockofblackquartzBlock());
	public static final RegistryObject<Block> BLACK_QUARTZ_PILLAR = REGISTRY.register("black_quartz_pillar", () -> new BlackquartzpillarBlock());
	public static final RegistryObject<Block> BLACK_QUARTZ_SLAB = REGISTRY.register("black_quartz_slab", () -> new BlackquartzslabBlock());
	public static final RegistryObject<Block> BLACK_QUARTZ_STAIRS = REGISTRY.register("black_quartz_stairs", () -> new BlackquartzstairsBlock());
	public static final RegistryObject<Block> BLACKQUARTZCHISELED = REGISTRY.register("blackquartzchiseled", () -> new BlackquartzchiseledBlock());
	public static final RegistryObject<Block> BLACKENDSTONE = REGISTRY.register("blackendstone", () -> new BlackendstoneBlock());
	public static final RegistryObject<Block> BLACKENDSTONEBRICKS = REGISTRY.register("blackendstonebricks", () -> new BlackendstonebricksBlock());
	public static final RegistryObject<Block> REDENDERBRICK = REGISTRY.register("redenderbrick", () -> new RedenderbrickBlock());
	public static final RegistryObject<Block> ENDBRICKSLAB = REGISTRY.register("endbrickslab", () -> new EndbrickslabBlock());
	public static final RegistryObject<Block> ENDBRICKSTAIRS = REGISTRY.register("endbrickstairs", () -> new EndbrickstairsBlock());
	public static final RegistryObject<Block> REDENDBRICKSLAB = REGISTRY.register("redendbrickslab", () -> new RedendbrickslabBlock());
	public static final RegistryObject<Block> REDENDBRICKSTAIRS = REGISTRY.register("redendbrickstairs", () -> new RedendbrickstairsBlock());
	public static final RegistryObject<Block> GOLEMSPAWNER = REGISTRY.register("golemspawner", () -> new GolemspawnerBlock());
	public static final RegistryObject<Block> BLOCKOF_DRAGON_ESSENCE = REGISTRY.register("blockof_dragon_essence", () -> new BlockofDragonEssenceBlock());
	public static final RegistryObject<Block> SILENT_CAULDRON = REGISTRY.register("silent_cauldron", () -> new SilentCauldronBlock());
}
