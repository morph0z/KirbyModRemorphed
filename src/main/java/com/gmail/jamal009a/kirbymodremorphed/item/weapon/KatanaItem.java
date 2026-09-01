
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems.KirbyAbilityMiscItem;
import com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems.KirbyAbilitySwordItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import java.util.List;

public class KatanaItem extends KirbyAbilitySwordItem {
	public KatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1f, new Properties());
	}

//	@Override
//	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
//		super.appendHoverText(itemstack, world, list, flag);
//		list.add(Component.literal("§7kirby's special ninja blade"));
//	}

}
