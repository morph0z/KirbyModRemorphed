package com.gmail.jamal009a.kirbymodremorphed.item;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier Kirby = TierSortingRegistry.registerTier(
            new ForgeTier(5,1600,5f,4f,27,
                    ModTags.Blocks.NEEDS_KIRBY_TOOLS, () -> Ingredient.of(ModItems.REDSTONE_GEM.get())),
            new ResourceLocation(KirbyModRemorphed.MODID,"redstone_gem"), List.of(Tiers.NETHERITE), List.of());
}
