package com.gmail.jamal009a.kirbymodremorphed.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MAXIM_TOMATO = new FoodProperties.Builder().saturationMod(3).fast()
            .nutrition(20).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60,3),1f).build();
    public static final FoodProperties BAGEL = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties ONIGIRI = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties ICE_CREAM_BAR = new FoodProperties.Builder().saturationMod(1)
            .nutrition(2).build();
    public static final FoodProperties CHERRIES = new FoodProperties.Builder().saturationMod(1)
            .nutrition(3).build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().saturationMod(1)
            .nutrition(3).build();
    public static final FoodProperties MELON = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties ENERGY_DRINK = new FoodProperties.Builder().saturationMod(1)
            .nutrition(5).build();
    public static final FoodProperties MINT_LEAF = new FoodProperties.Builder().saturationMod(1)
            .nutrition(2).build();
    public static final FoodProperties SPICY_FOOD = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties BANANA_BUNCH = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties CANDY = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties CARROT = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties NORI_SENBEI = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties HOT_DOG = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties CANDY_CANE = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();
    public static final FoodProperties SUSHI = new FoodProperties.Builder().saturationMod(1)
            .nutrition(4).build();

}
