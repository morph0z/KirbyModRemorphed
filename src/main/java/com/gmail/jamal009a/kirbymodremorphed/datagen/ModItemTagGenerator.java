package com.gmail.jamal009a.kirbymodremorphed.datagen;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, KirbyModRemorphed.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.SWORDS)
                .add(ModItems.FLAM_SWORD.get())
                .add(ModItems.BASIC_SPEAR.get())
                .add(ModItems.KATANA.get())
                .add(ModItems.ZAN_SPEAR.get())
                .add(ModItems.META_KNIGHTS_SWORD.get());

        this.tag(ItemTags.AXES)
                .add(ModItems.FRAN_AXE.get());

        this.tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.REDSTONE_GEM.get())
                .add(ModItems.LAPIS_GEM.get())
                .add(ModItems.STARR.get())
                .add(ModItems.JAMBA_CRYSTAL.get())
                .add(ModItems.MIRROR_SHARD.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CLOUDWOOD_LOG.get().asItem())
                .add(ModBlocks.CLOUDWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CLOUDWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.CLOUDWOOD_PLANKS.get().asItem());

        this.tag(ModTags.Items.KIRBY_ABILITIES)
                .add(ModItems.CUPID_ABILITY.get())
                .add(ModItems.BEAM_ABILITY.get())
                .add(ModItems.FIGHTER_ABILITY.get())
                .add(ModItems.MICROPHONE_ABILITY.get());

        this.tag(ModTags.Items.KIRBY_FOOD)
                .add(ModItems.CANDY.get())
                .add(ModItems.INVINCIBLE_CANDY.get())
                .add(ModItems.BAGEL.get())
                .add(ModItems.BANANA_BUNCH.get())
                .add(ModItems.CARROT.get())
                .add(ModItems.CHEESE.get())
                .add(ModItems.CHERRIES.get())
                .add(ModItems.CORN.get())
                .add(ModItems.ENERGY_DRINK.get())
                .add(ModItems.HOT_DOG.get())
                .add(ModItems.ICE_CREAM_BAR.get())
                .add(ModItems.MELON.get())
                .add(ModItems.MINT_LEAF.get())
                .add(ModItems.SPICY_FOOD.get())
                .add(ModItems.ONIGIRI.get())
                .add(ModItems.SUSHI.get())
                .add(ModItems.TOMATO.get())
                .add(ModItems.NORI_SENBEI.get())
                .add(ModItems.MAXIM_TOMATO.get());
    }
}
