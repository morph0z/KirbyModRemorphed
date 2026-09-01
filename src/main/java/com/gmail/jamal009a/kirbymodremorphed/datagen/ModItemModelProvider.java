package com.gmail.jamal009a.kirbymodremorphed.datagen;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, KirbyModRemorphed.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VOID_TERMINA_FEATHER);
        simpleItem(ModItems.VOID_FLESH);
        simpleItem(ModItems.VOID_TERMINA_HORN);
        simpleItem(ModItems.VOID_TERMINA_REMNANT);
        simpleItem(ModItems.STARR);
        simpleItem(ModItems.ENERGY_SPHERE);
        simpleItem(ModItems.ESSENTIAL_PART);
        simpleItem(ModItems.REDSTONE_GEM);
        simpleItem(ModItems.LAPIS_GEM);
        simpleItem(ModItems.MIRROR_SHARD);
        simpleItem(ModItems.JAMBA_CRYSTAL);

        abilityItemWith2D(ModItems.BEAM_ABILITY);
        abilityItemWith2D(ModItems.CUPID_ABILITY);
        abilityItemWith2D(ModItems.MICROPHONE_ABILITY);
        abilityItemWith2D(ModItems.FIGHTER_ABILITY);
        abilityItemWith2D(ModItems.JET_ABILITY);
        abilityItemWith2D(ModItems.CRASH_ABILITY);
        abilityItemWith2D(ModItems.NINJA_ABILITY);

        armorItemWith2D(ModItems.META_KNIGHTS_MASK);
        armorItemWith2D(ModItems.META_KNIGHTS_WINGS);

        foodItem(ModItems.MAXIM_TOMATO);
        foodItem(ModItems.BANANA_BUNCH);
        foodItem(ModItems.CANDY);
        foodItem(ModItems.CARROT);
        foodItem(ModItems.CORN);
        foodItem(ModItems.NORI_SENBEI);
        foodItem(ModItems.HOT_DOG);
        foodItem(ModItems.CANDY_CANE);
        foodItem(ModItems.SUSHI);

        simpleBlockItem(ModBlocks.CLOUDWOOD_DOOR);
        fenceItem(ModBlocks.CLOUDWOOD_FENCE, ModBlocks.CLOUDWOOD_PLANKS);
        trapdoorItem(ModBlocks.CLOUDWOOD_TRAPDOOR);
        buttonItem(ModBlocks.CLOUDWOOD_BUTTON, ModBlocks.CLOUDWOOD_PLANKS);

        evenSimplerBlockItem(ModBlocks.CLOUDWOOD_STAIRS);
        evenSimplerBlockItem(ModBlocks.CLOUDWOOD_SLAB);
        evenSimplerBlockItem(ModBlocks.CLOUDWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CLOUDWOOD_FENCE_GATE);

        handheldItem(ModItems.META_KNIGHTS_SWORD);

        withExistingParent(ModItems.KIRBY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.WADDLE_DEE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(KirbyModRemorphed.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder abilityItemWith2D(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(KirbyModRemorphed.MODID,"item/armor/ability/2d/" + item.getId().getPath() + "2d"));
    }
    private ItemModelBuilder armorItemWith2D(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(KirbyModRemorphed.MODID,"item/armor/2d/" + item.getId().getPath() + "2d"));
    }
    private ItemModelBuilder foodItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(KirbyModRemorphed.MODID,"item/food/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(KirbyModRemorphed.MODID,"item/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(KirbyModRemorphed.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(KirbyModRemorphed.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }


    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(KirbyModRemorphed.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(KirbyModRemorphed.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(KirbyModRemorphed.MODID,"item/" + item.getId().getPath()));
    }
}
