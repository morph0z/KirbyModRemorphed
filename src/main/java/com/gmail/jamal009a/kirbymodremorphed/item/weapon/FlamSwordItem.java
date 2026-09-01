
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import java.util.List;
//can also use ice ability
public class FlamSwordItem extends SwordItem {
	public FlamSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2802;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5.4f;
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
		}, 3, -2.2f, new Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7cFlam's weapon of choice\u00A7f"));
		list.add(Component.literal("§7infused with \u00A7cFlames\u00A7f"));
		list.add(Component.literal("§7balanced damage and speed"));
	}
}
