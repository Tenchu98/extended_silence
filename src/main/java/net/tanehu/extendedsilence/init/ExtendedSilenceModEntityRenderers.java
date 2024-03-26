
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.client.renderer.WithergolemRenderer;
import net.tanehu.extendedsilence.client.renderer.VoidWalkerRenderer;
import net.tanehu.extendedsilence.client.renderer.GolemRenderer;
import net.tanehu.extendedsilence.client.renderer.EndgolemRenderer;
import net.tanehu.extendedsilence.client.renderer.DragonGolemRenderer;
import net.tanehu.extendedsilence.client.renderer.CelestialravagerRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExtendedSilenceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ExtendedSilenceModEntities.ENDGOLEM.get(), EndgolemRenderer::new);
		event.registerEntityRenderer(ExtendedSilenceModEntities.VOID_WALKER.get(), VoidWalkerRenderer::new);
		event.registerEntityRenderer(ExtendedSilenceModEntities.MYTHRIL_GOLEM.get(), GolemRenderer::new);
		event.registerEntityRenderer(ExtendedSilenceModEntities.WITHERGOLEM.get(), WithergolemRenderer::new);
		event.registerEntityRenderer(ExtendedSilenceModEntities.DRAGON_GOLEM.get(), DragonGolemRenderer::new);
		event.registerEntityRenderer(ExtendedSilenceModEntities.CELESTIALRAVAGER.get(), CelestialravagerRenderer::new);
	}
}
