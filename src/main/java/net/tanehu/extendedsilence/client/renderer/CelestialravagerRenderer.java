
package net.tanehu.extendedsilence.client.renderer;

import net.tanehu.extendedsilence.entity.CelestialravagerEntity;
import net.tanehu.extendedsilence.client.model.Modelpreanimated_ravager;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CelestialravagerRenderer extends MobRenderer<CelestialravagerEntity, Modelpreanimated_ravager<CelestialravagerEntity>> {
	public CelestialravagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpreanimated_ravager(context.bakeLayer(Modelpreanimated_ravager.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CelestialravagerEntity entity) {
		return new ResourceLocation("extended_silence:textures/entities/ravager.png");
	}
}
