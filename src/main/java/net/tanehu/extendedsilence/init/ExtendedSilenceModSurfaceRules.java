package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.mixins.NoiseGeneratorSettingsAccess;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber
public class ExtendedSilenceModSurfaceRules {
	@SubscribeEvent
	public static void init(ServerAboutToStartEvent event) {
		LevelStem levelStem = event.getServer().registryAccess().registryOrThrow(Registries.LEVEL_STEM).get(LevelStem.END);
		ChunkGenerator chunkGenerator = levelStem.generator();
		boolean hasEndBiomes = chunkGenerator.getBiomeSource().possibleBiomes().stream().anyMatch(biomeHolder -> biomeHolder.unwrapKey().orElseThrow().location().getNamespace().equals("extended_silence"));
		if (hasEndBiomes) {
			if (chunkGenerator instanceof NoiseBasedChunkGenerator generator) {
				NoiseGeneratorSettings noiseGeneratorSettings = generator.settings.value();
				((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings)
						.addSurfaceRule(SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("extended_silence:the_fallen_lands"))),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(ExtendedSilenceModBlocks.CORRUPTGRASSBLOCK.get().defaultBlockState())),
										SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.state(ExtendedSilenceModBlocks.CORRUPTDIRT.get().defaultBlockState())))),
								noiseGeneratorSettings.surfaceRule()));
			}
		}
	}
}
