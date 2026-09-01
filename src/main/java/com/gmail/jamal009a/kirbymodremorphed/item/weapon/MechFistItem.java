
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems.KirbyAbilityAxeItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MechFistItem extends KirbyAbilityAxeItem {
	public MechFistItem() {
		super(new Tier() {
			public int getUses() {
				return 2150;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2, false, false));
		return super.hurtEnemy(itemstack, entity, sourceentity);
	}
//
//	@Override
//	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
//		super.appendHoverText(itemstack, world, list, flag);
//		list.add(Component.literal("§7Heavy hits"));
//	}
}
