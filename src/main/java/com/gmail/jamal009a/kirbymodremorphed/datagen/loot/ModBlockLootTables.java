package com.gmail.jamal009a.kirbymodremorphed.datagen.loot;

import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.text.Normalizer;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CLOUD.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CLOUDWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_WOOD.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_SLAB.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_FENCE.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_BUTTON.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_DOOR.get());
        this.dropSelf(ModBlocks.CLOUDWOOD_TRAPDOOR.get());
        this.add(ModBlocks.CLOUDWOOD_SLAB.get(), block -> createSlabItemTable(ModBlocks.CLOUDWOOD_SLAB.get()));
        this.add(ModBlocks.CLOUDWOOD_DOOR.get(), block -> createDoorTable(ModBlocks.CLOUDWOOD_DOOR.get()));

        //this.add(ModBlocks.CLOUDWOOD_LEAVES.get(),block -> createLeavesLikeOreDrops())
        this.add(ModBlocks.CLOUDWOOD_LEAVES.get(),block -> createLeavesDrops(block, ModBlocks.CLOUDWOOD_FENCE_GATE.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to sapling when added

        this.dropSelf(ModBlocks.COMPRESSEDGOLD.get());
        this.dropSelf(ModBlocks.COMPRESSEDIRON.get());

        this.dropSelf(ModBlocks.GROUNDKIRBY.get());
        this.dropSelf(ModBlocks.KIRBYGRASS.get());
        this.dropSelf(ModBlocks.MAGMAMELTEDBLOCK.get());
        this.dropSelf(ModBlocks.SAND.get());
        this.dropSelf(ModBlocks.SNOW.get());

        this.dropSelf(ModBlocks.UNFINISHED_JAMBA_HEART.get());
        this.dropSelf(ModBlocks.CORRUPTED_MAGMA.get());
        this.dropSelf(ModBlocks.JAMBA_PIECE.get());
        this.dropSelf(ModBlocks.JAMBA_HEART.get());
        this.add(ModBlocks.CRASHED_JAMBA_PIECE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.CRASHED_JAMBA_PIECE.get(), ModItems.JAMBA_CRYSTAL.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createLeavesLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}