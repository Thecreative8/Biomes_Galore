
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomesgalore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.biomesgalore.client.model.ModelPinapplefish;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BiomesGaloreModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPinapplefish.LAYER_LOCATION, ModelPinapplefish::createBodyLayer);
	}
}
