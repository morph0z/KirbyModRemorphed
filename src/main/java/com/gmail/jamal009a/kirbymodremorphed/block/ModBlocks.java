package com.gmail.jamal009a.kirbymodremorphed.block;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.custom.*;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, KirbyModRemorphed.MODID);

    public static final RegistryObject<Block> CLOUD = registryBlock("cloud", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.WOOL).strength(0.4f,0.2f).noOcclusion()));

    public static final RegistryObject<Block> CLOUDWOOD_WOOD = registryBlock("cloudwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3)));
    public static final RegistryObject<Block> CLOUDWOOD_LOG = registryBlock("cloudwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3).noOcclusion()));
    public static final RegistryObject<Block> STRIPPED_CLOUDWOOD_LOG = registryBlock("stripped_cloudwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3).noOcclusion()));
    public static final RegistryObject<Block> STRIPPED_CLOUDWOOD_WOOD = registryBlock("stripped_cloudwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3).noOcclusion()));

    public static final RegistryObject<Block> CLOUDWOOD_PLANKS = registryBlock("cloudwood_planks", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 30;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 10;
        }
    });
    public static final RegistryObject<Block> CLOUDWOOD_LEAVES = registryBlock("cloudwood_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.FLOWERING_AZALEA).noOcclusion()){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 60;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 30;
        }
    });

    public static final RegistryObject<Block> CLOUDWOOD_STAIRS = registryBlock("cloudwood_stairs", () -> new StairBlock(() -> ModBlocks.CLOUDWOOD_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava()));
    public static final RegistryObject<Block> CLOUDWOOD_SLAB = registryBlock("cloudwood_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava()));
    public static final RegistryObject<Block> CLOUDWOOD_BUTTON = registryBlock("cloudwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava(), BlockSetType.OAK, 40, true));

    public static final RegistryObject<Block> CLOUDWOOD_FENCE = registryBlock("cloudwood_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava()));
    public static final RegistryObject<Block> CLOUDWOOD_FENCE_GATE = registryBlock("cloudwood_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava(), SoundEvents.WOOL_FALL, SoundEvents.WOOL_BREAK));
    public static final RegistryObject<Block> CLOUDWOOD_PRESSURE_PLATE = registryBlock("cloudwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava(), BlockSetType.OAK));
    public static final RegistryObject<Block> CLOUDWOOD_DOOR = registryBlock("cloudwood_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava().noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> CLOUDWOOD_TRAPDOOR = registryBlock("cloudwood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f).instrument(NoteBlockInstrument.BASS).ignitedByLava().noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> CORRUPTED_MAGMA = registryBlock("corrupted_magma", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.AMETHYST).strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final RegistryObject<Block> CRASHED_JAMBA_PIECE = registryBlock("crashed_jamba_piece", CrashedJambaPieceBlock::new);
    public static final RegistryObject<Block> JAMBA_PIECE = registryBlock("jamba_piece", JambaPieceBlock::new);
    public static final RegistryObject<Block> UNFINISHED_JAMBA_HEART = registryBlock("unfinished_jamba_heart", UnfinishedJambaHeartBlock::new);
    public static final RegistryObject<Block> JAMBA_HEART = registryBlock("jamba_heart", JambaHeartBlock::new);
    public static final RegistryObject<Block> COMPRESSED_GOLD = registryBlock("compressed_gold", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.ANVIL).strength(7f, 20f).instrument(NoteBlockInstrument.COW_BELL)));
    public static final RegistryObject<Block> COMPRESSED_IRON = registryBlock("compressed_iron", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.ANVIL).strength(8f, 20f).instrument(NoteBlockInstrument.COW_BELL)));
    public static final RegistryObject<Block> GROUND_KIRBY = registryBlock("ground_kirby", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL).strength(1f,0.2f).instrument(NoteBlockInstrument.BASS)));
    public static final RegistryObject<Block> KIRBY_GRASS = registryBlock("kirby_grass", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.WET_GRASS).strength(1.2f,0.2f).instrument(NoteBlockInstrument.BASS)));
    public static final RegistryObject<Block> MAGMA_MELTED_BLOCK = registryBlock("magma_melted_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHER_BRICKS).strength(0.7f, 1f)));
    public static final RegistryObject<Block> SAND = registryBlock("sand", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND).strength(0.7f, 1f)));
    public static final RegistryObject<Block> SNOW = registryBlock("snow", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).sound(SoundType.SNOW).strength(0.7f, 1f)));
    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
