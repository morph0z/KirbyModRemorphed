package com.gmail.jamal009a.kirbymodremorphed.datagen;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, KirbyModRemorphed.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.COMPRESSED_IRON);
        blockWithItem(ModBlocks.COMPRESSED_GOLD);

        blockWithItem(ModBlocks.GROUND_KIRBY);
        //blockWithItem(ModBlocks.SNOW);
        //blockWithItem(ModBlocks.KIRBY_GRASS);
        blockWithItem(ModBlocks.SAND);
        //blockWithItem(ModBlocks.MAGMA_MELTED_BLOCK);

        blockWithItem(ModBlocks.CLOUD);
        //blockWithItem(ModBlocks.CLOUDWOOD_BUTTON);
        //blockWithItem(ModBlocks.CLOUDWOOD_FENCE);
        //blockWithItem(ModBlocks.CLOUDWOOD_LOG);
        //blockWithItem(ModBlocks.CLOUDWOOD_FENCE_GATE);
        blockWithItem(ModBlocks.CLOUDWOOD_PLANKS);
        //blockWithItem(ModBlocks.CLOUDWOOD_PRESSURE_PLATE);
        //blockWithItem(ModBlocks.CLOUDWOOD_SLAB);
        //blockWithItem(ModBlocks.CLOUDWOOD_WOOD);
        leavesBlock(ModBlocks.CLOUDWOOD_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.CLOUDWOOD_STAIRS.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CLOUDWOOD_SLAB.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CLOUDWOOD_BUTTON.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CLOUDWOOD_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CLOUDWOOD_FENCE.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CLOUDWOOD_FENCE_GATE.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CLOUDWOOD_FENCE.get()), blockTexture(ModBlocks.CLOUDWOOD_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.CLOUDWOOD_DOOR.get()), modLoc("block/cloudwood_door_bottom"), modLoc("block/cloudwood_door_top"),"cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CLOUDWOOD_TRAPDOOR.get()), modLoc("block/cloudwood_trapdoor"), true ,"cutout");

        logBlock(((RotatedPillarBlock) ModBlocks.CLOUDWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CLOUDWOOD_WOOD.get()), blockTexture(ModBlocks.CLOUDWOOD_LOG.get()), blockTexture(ModBlocks.CLOUDWOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CLOUDWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get()), new ResourceLocation(KirbyModRemorphed.MODID,"block/stripped_cloudwood_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CLOUDWOOD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get()));

        blockItem(ModBlocks.CLOUDWOOD_LOG);
        blockItem(ModBlocks.CLOUDWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_CLOUDWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_CLOUDWOOD_WOOD);
        //blockWithItem(ModBlocks.CRASHED_JAMBA_PIECE);
        //blockWithItem(ModBlocks.JAMBA_PIECE);
        //blockWithItem(ModBlocks.UNFINISHED_JAMBA_HEART);
        //blockWithItem(ModBlocks.JAMBA_HEART);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(KirbyModRemorphed.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
