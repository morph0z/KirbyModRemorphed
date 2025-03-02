package com.gmail.jamal009a.kirbymodremorphed.item.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;


public class InvincibleCandy extends Item{
    public InvincibleCandy() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).saturationMod(3)
                .nutrition(20).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360,3),1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 360,6),1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 360,2),1f).alwaysEat().build()));
    }
}
