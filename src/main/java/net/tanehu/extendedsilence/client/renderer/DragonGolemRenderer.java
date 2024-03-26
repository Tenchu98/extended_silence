
package net.tanehu.extendedsilence.client.renderer;

import net.tanehu.extendedsilence.entity.DragonGolemEntity;
import net.tanehu.extendedsilence.client.model.Modelpreanimated_iron_golem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.mojang.blaze3d.vertex.PoseStack;

public class DragonGolemRenderer extends MobRenderer<DragonGolemEntity, Modelpreanimated_iron_golem<DragonGolemEntity>> {
	public DragonGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpreanimated_iron_golem(context.bakeLayer(Modelpreanimated_iron_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DragonGolemEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonGolemEntity entity) {
		return new ResourceLocation("extended_silence:textures/entities/dragon_golem.png");
	}
}
