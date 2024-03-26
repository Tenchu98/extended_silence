
package net.tanehu.extendedsilence.client.renderer;

import net.tanehu.extendedsilence.entity.WithergolemEntity;
import net.tanehu.extendedsilence.client.model.Modelpreanimated_iron_golem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.mojang.blaze3d.vertex.PoseStack;

public class WithergolemRenderer extends MobRenderer<WithergolemEntity, Modelpreanimated_iron_golem<WithergolemEntity>> {
	public WithergolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpreanimated_iron_golem(context.bakeLayer(Modelpreanimated_iron_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(WithergolemEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(WithergolemEntity entity) {
		return new ResourceLocation("extended_silence:textures/entities/wither_golem.png");
	}
}
