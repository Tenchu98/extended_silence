
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.fluid.DragonessenceFluid;
import net.tanehu.extendedsilence.ExtendedSilenceMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class ExtendedSilenceModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ExtendedSilenceMod.MODID);
	public static final RegistryObject<FlowingFluid> DRAGONESSENCE = REGISTRY.register("dragonessence", () -> new DragonessenceFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_DRAGONESSENCE = REGISTRY.register("flowing_dragonessence", () -> new DragonessenceFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(DRAGONESSENCE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DRAGONESSENCE.get(), RenderType.translucent());
		}
	}
}
