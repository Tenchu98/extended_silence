
package net.tanehu.extendedsilence.fluid;

import net.tanehu.extendedsilence.init.ExtendedSilenceModFluids;
import net.tanehu.extendedsilence.init.ExtendedSilenceModFluidTypes;
import net.tanehu.extendedsilence.init.ExtendedSilenceModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public abstract class DragonessenceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ExtendedSilenceModFluidTypes.DRAGONESSENCE_TYPE.get(), () -> ExtendedSilenceModFluids.DRAGONESSENCE.get(),
			() -> ExtendedSilenceModFluids.FLOWING_DRAGONESSENCE.get()).explosionResistance(100f).block(() -> (LiquidBlock) ExtendedSilenceModBlocks.DRAGONESSENCE.get());

	private DragonessenceFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends DragonessenceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DragonessenceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
