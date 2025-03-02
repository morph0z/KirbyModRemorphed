
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import com.gmail.jamal009a.kirbymodremorphed.procedures.DarkMetaKightSwordRightclickedOnBlockProcedure;
import com.gmail.jamal009a.kirbymodremorphed.procedures.DarkMetaKightSwordToolInHandTickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class DarkMetaKightSwordItem extends SwordItem {
	public DarkMetaKightSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 40000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.RAW_IRON_BLOCK), new ItemStack(Items.RAW_IRON), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.IRON_SWORD));
			}
		}, 3, 5f, new Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("§7feel the power of the sword wilded by the most powerful warrior of the mirror dimension"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DarkMetaKightSwordRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			DarkMetaKightSwordToolInHandTickProcedure.execute(entity);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
