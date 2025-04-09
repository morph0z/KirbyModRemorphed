package com.gmail.jamal009a.kirbymodremorphed.item.food;

import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;


public class InvincibleCandy extends Item{
    public InvincibleCandy() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).saturationMod(3)
                .nutrition(20).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360,3, false, false),1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 360,2, false, false),1f).alwaysEat().build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        pLivingEntity.invulnerableTime = 360;
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }
}
