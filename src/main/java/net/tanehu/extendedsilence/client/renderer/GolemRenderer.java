
package net.tanehu.extendedsilence.client.renderer;

import net.tanehu.extendedsilence.entity.GolemEntity;
import net.tanehu.extendedsilence.client.model.Modelpreanimated_iron_golem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GolemRenderer extends MobRenderer<GolemEntity, Modelpreanimated_iron_golem<GolemEntity>> {
	public GolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpreanimated_iron_golem(context.bakeLayer(Modelpreanimated_iron_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GolemEntity entity) {
		return new ResourceLocation("extended_silence:textures/entities/mythrilgolem.png");
	}
}
