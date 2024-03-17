
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.fluid.types.DragonessenceFluidType;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class ExtendedSilenceModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ExtendedSilenceMod.MODID);
	public static final RegistryObject<FluidType> DRAGONESSENCE_TYPE = REGISTRY.register("dragonessence", () -> new DragonessenceFluidType());
}
