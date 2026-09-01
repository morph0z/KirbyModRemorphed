
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems.KirbyAbilityAxeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import java.util.List;
//multi punch attack and camecame ahhh wave please
public class FighterGloveItem extends KirbyAbilityAxeItem {
	public FighterGloveItem() {
		super(new Tier() {
			public int getUses() {
				return 2150;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, 3.5f, new Properties());
	}
//	@Override
//	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
//		super.appendHoverText(itemstack, world, list, flag);
//		list.add(Component.literal("§7Fast"));
//	}

	@Override
	public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
		super.onInventoryTick(stack, level, player, slotIndex, selectedIndex);
	}
}
