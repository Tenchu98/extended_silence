
package net.tanehu.extendedsilence.client.renderer;

import net.tanehu.extendedsilence.entity.EndgolemEntity;
import net.tanehu.extendedsilence.client.model.ModelAnimatedRedstoneGolemModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class EndgolemRenderer extends MobRenderer<EndgolemEntity, ModelAnimatedRedstoneGolemModel<EndgolemEntity>> {
	public EndgolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAnimatedRedstoneGolemModel(context.bakeLayer(ModelAnimatedRedstoneGolemModel.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(EndgolemEntity entity) {
		return new ResourceLocation("extended_silence:textures/entities/redstone_powered_iron_golem.png");
	}
}
