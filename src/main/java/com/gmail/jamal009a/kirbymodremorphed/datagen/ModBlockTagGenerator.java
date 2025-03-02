//package com.gmail.jamal009a.kirbymodremorphed.datagen;
package com.gmail.jamal009a.kirbymodremorphed.datagen;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, KirbyModRemorphed.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.SAND.get())
                .add(ModBlocks.KIRBYGRASS.get())
                .add(ModBlocks.GROUNDKIRBY.get())
                .add(ModBlocks.SAND.get())
                .add(ModBlocks.CLOUD.get());

        this.tag(BlockTags.DIRT)
                .add(ModBlocks.SAND.get())
                .add(ModBlocks.MAGMAMELTEDBLOCK.get())
                .add(ModBlocks.KIRBYGRASS.get())
                .add(ModBlocks.GROUNDKIRBY.get())
                .add(ModBlocks.SAND.get())
                .add(ModBlocks.CLOUD.get())
                .add(ModBlocks.SNOW.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CLOUDWOOD_LOG.get())
                .add(ModBlocks.CLOUDWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_CLOUDWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.CLOUDWOOD_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.CLOUDWOOD_LEAVES.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MAGMAMELTEDBLOCK.get())
                .add(ModBlocks.COMPRESSEDIRON.get())
                .add(ModBlocks.COMPRESSEDGOLD.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COMPRESSEDIRON.get())
                .add(ModBlocks.COMPRESSEDGOLD.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.CLOUDWOOD_FENCE_GATE.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.CLOUDWOOD_FENCE.get());
    }
}
