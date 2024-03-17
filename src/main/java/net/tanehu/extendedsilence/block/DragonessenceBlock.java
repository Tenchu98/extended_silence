
package net.tanehu.extendedsilence.block;

import net.tanehu.extendedsilence.init.ExtendedSilenceModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class DragonessenceBlock extends LiquidBlock {
	public DragonessenceBlock() {
		super(() -> ExtendedSilenceModFluids.DRAGONESSENCE.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission().noLootTable()
				.liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
