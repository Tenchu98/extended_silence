
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.client.renderer.EndgolemRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExtendedSilenceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ExtendedSilenceModEntities.ENDGOLEM.get(), EndgolemRenderer::new);
	}
}
