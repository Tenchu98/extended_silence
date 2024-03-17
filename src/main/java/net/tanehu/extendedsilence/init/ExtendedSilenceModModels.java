
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tanehu.extendedsilence.init;

import net.tanehu.extendedsilence.client.model.Modelendaze;
import net.tanehu.extendedsilence.client.model.ModelAnimatedRedstoneGolemModel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ExtendedSilenceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelendaze.LAYER_LOCATION, Modelendaze::createBodyLayer);
		event.registerLayerDefinition(ModelAnimatedRedstoneGolemModel.LAYER_LOCATION, ModelAnimatedRedstoneGolemModel::createBodyLayer);
	}
}
