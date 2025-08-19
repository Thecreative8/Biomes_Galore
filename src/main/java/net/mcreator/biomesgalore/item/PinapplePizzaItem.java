
package net.mcreator.biomesgalore.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class PinapplePizzaItem extends Item {
	public PinapplePizzaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(12).saturationMod(16f).alwaysEat().build()));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		return ar;
	}
}
