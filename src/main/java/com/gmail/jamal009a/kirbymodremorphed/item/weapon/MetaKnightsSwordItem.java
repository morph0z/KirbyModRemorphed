
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MetaKnightsSwordItem extends SwordItem {
	public MetaKnightsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 40000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 24;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.RAW_GOLD), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.GOLD_NUGGET), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.REDSTONE));
			}
		}, 3, 4f, new Properties().fireResistant());
	}

//	@Override
//	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
//		super.appendHoverText(itemstack, world, list, flag);
//		list.add(Component.literal("§7Feel the power of the sword wilded by the most powerful warrior of the land"));
//	}


	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
