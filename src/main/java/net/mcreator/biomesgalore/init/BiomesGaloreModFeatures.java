
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomesgalore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.biomesgalore.world.features.PinapplePlantSpawningFeature;
import net.mcreator.biomesgalore.BiomesGaloreMod;

@Mod.EventBusSubscriber
public class BiomesGaloreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BiomesGaloreMod.MODID);
	public static final RegistryObject<Feature<?>> PINAPPLE_PLANT_SPAWNING = REGISTRY.register("pinapple_plant_spawning", PinapplePlantSpawningFeature::new);
}
