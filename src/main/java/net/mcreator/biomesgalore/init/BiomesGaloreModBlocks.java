
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomesgalore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.biomesgalore.block.SmallPinappleBlock;
import net.mcreator.biomesgalore.block.PinappleStemBlock;
import net.mcreator.biomesgalore.block.PinapplePlantBlock;
import net.mcreator.biomesgalore.block.PinappleBlockBlock;
import net.mcreator.biomesgalore.BiomesGaloreMod;

public class BiomesGaloreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BiomesGaloreMod.MODID);
	public static final RegistryObject<Block> PINAPPLE_BLOCK = REGISTRY.register("pinapple_block", () -> new PinappleBlockBlock());
	public static final RegistryObject<Block> PINAPPLE_STEM = REGISTRY.register("pinapple_stem", () -> new PinappleStemBlock());
	public static final RegistryObject<Block> SMALL_PINAPPLE = REGISTRY.register("small_pinapple", () -> new SmallPinappleBlock());
	public static final RegistryObject<Block> PINAPPLE_PLANT = REGISTRY.register("pinapple_plant", () -> new PinapplePlantBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
