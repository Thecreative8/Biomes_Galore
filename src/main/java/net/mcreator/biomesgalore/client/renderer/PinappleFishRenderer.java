
package net.mcreator.biomesgalore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.biomesgalore.entity.PinappleFishEntity;
import net.mcreator.biomesgalore.client.model.ModelPinapplefish;

public class PinappleFishRenderer extends MobRenderer<PinappleFishEntity, ModelPinapplefish<PinappleFishEntity>> {
	public PinappleFishRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPinapplefish(context.bakeLayer(ModelPinapplefish.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(PinappleFishEntity entity) {
		return new ResourceLocation("biomes_galore:textures/entities/pinapplefish.png");
	}
}
