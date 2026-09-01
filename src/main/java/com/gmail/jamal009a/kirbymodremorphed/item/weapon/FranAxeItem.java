
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import java.util.List;
//can also use fire ability
public class FranAxeItem extends AxeItem {
	public FranAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2802;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7.6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3.4f, new Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A79Fran's weapon of choice\u00A7f"));
		list.add(Component.literal("§7infused with \u00A79Frost\u00A7f"));
		list.add(Component.literal("§7hits hard and moves slow"));
	}
}
