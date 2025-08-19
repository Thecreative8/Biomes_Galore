
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomesgalore.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.biomesgalore.BiomesGaloreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiomesGaloreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BiomesGaloreMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(BiomesGaloreModItems.PINAPPLE_FISH_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(BiomesGaloreModBlocks.SMALL_PINAPPLE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(BiomesGaloreModItems.PINAPPLE_PIZZA.get());

		}
	}
}
