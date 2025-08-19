
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomesgalore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.biomesgalore.item.PinapplePizzaItem;
import net.mcreator.biomesgalore.item.PinappleItem;
import net.mcreator.biomesgalore.BiomesGaloreMod;

public class BiomesGaloreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BiomesGaloreMod.MODID);
	public static final RegistryObject<Item> PINAPPLE_BLOCK = block(BiomesGaloreModBlocks.PINAPPLE_BLOCK);
	public static final RegistryObject<Item> PINAPPLE_STEM = block(BiomesGaloreModBlocks.PINAPPLE_STEM);
	public static final RegistryObject<Item> SMALL_PINAPPLE = block(BiomesGaloreModBlocks.SMALL_PINAPPLE);
	public static final RegistryObject<Item> PINAPPLE = REGISTRY.register("pinapple", () -> new PinappleItem());
	public static final RegistryObject<Item> PINAPPLE_PLANT = block(BiomesGaloreModBlocks.PINAPPLE_PLANT);
	public static final RegistryObject<Item> PINAPPLE_FISH_SPAWN_EGG = REGISTRY.register("pinapple_fish_spawn_egg", () -> new ForgeSpawnEggItem(BiomesGaloreModEntities.PINAPPLE_FISH, -205, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> PINAPPLE_PIZZA = REGISTRY.register("pinapple_pizza", () -> new PinapplePizzaItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
