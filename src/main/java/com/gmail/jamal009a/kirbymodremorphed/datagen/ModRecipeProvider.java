package com.gmail.jamal009a.kirbymodremorphed.datagen;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //public static final List<itemLike> tag = List.of(ModItems.RAW_JAMBA_CRYSTAL.get(),
    //       ModBlocks.JAMBA_CRYSTAL_ORE.get(), MoBlocks.DEEPSLATE_JAMBA_CRYSTAL_ORE.get()),
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //oreBlasting(pWriter, tag, RecipeCategory.MISC, ModItems.JAMBA_CRYSTAL.get(), 0.25f, 200, "JAMBA_CRYSTAL");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JAMBA_HEART.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.JAMBA_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.JAMBA_CRYSTAL.get()), has(ModItems.JAMBA_CRYSTAL.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JAMBA_CRYSTAL.get(),9)
                .requires(ModBlocks.JAMBA_HEART.get())
                .unlockedBy(getHasName(ModBlocks.JAMBA_HEART.get()),has(ModBlocks.JAMBA_HEART.get()))
                .save(pWriter);
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  KirbyModRemorphed.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
