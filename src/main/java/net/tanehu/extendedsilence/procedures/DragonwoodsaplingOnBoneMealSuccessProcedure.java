package net.tanehu.extendedsilence.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DragonwoodsaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Variation = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.END_STONE) {
			Variation = Mth.nextInt(RandomSource.create(), 0, 2);
			if (Variation == 0) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 5, 3, 3, 3, 1);
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("extended_silence", "dragonwood"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z - 4), BlockPos.containing(x + 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Variation == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 5, 3, 3, 3, 1);
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("extended_silence", "dragonwood"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z - 4), BlockPos.containing(x + 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Variation == 2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 5, 3, 3, 3, 1);
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("extended_silence", "dragonwood"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y, z - 4), BlockPos.containing(x + 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}
