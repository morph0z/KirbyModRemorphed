package com.gmail.jamal009a.kirbymodremorphed.item;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KirbyModRemorphed.MODID);
    public  static  final RegistryObject<CreativeModeTab> ABILITIES_TAB = CREATIVE_MODE_TABS.register("abilities_tab",
            () -> CreativeModeTab.builder().icon((() -> new ItemStack(ModItems.BEAM_ABILITY.get())))
                    .title(Component.translatable("creative.abilities_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BEAM_ABILITY.get());
                        pOutput.accept(ModItems.MICROPHONE_ABILITY.get());
                        pOutput.accept(ModItems.CUPID_ABILITY.get());
                        pOutput.accept(ModItems.FIGHTER_ABILITY.get());
                    })
                    .build());
    public  static  final RegistryObject<CreativeModeTab> ABILITIES_ITEMS_TAB = CREATIVE_MODE_TABS.register("abilities_items_tab",
            () -> CreativeModeTab.builder().icon((() -> new ItemStack(ModItems.BASIC_HAMMER.get())))
                    .title(Component.translatable("creative.abilities_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KIRBY_SWORD.get());
                        pOutput.accept(ModItems.KATANA.get());
                        pOutput.accept(ModItems.BASIC_HAMMER.get());
                        pOutput.accept(ModItems.FIGHTER_GLOVE.get());
                        pOutput.accept(ModItems.MECH_FIST.get());
                        pOutput.accept(ModItems.ROCK_FIST.get());
                    })
                    .build());
    public  static  final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("food_tab",
            () -> CreativeModeTab.builder().icon((() -> new ItemStack(ModItems.MAXIM_TOMATO.get())))
                    .title(Component.translatable("creative.food_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MAXIM_TOMATO.get());
                        pOutput.accept(ModItems.INVINCIBLE_CANDY.get());
                        pOutput.accept(ModItems.BAGEL.get());
                        pOutput.accept(ModItems.ONIGIRI.get());
                        pOutput.accept(ModItems.ICE_CREAM_BAR.get());
                        pOutput.accept(ModItems.CHERRIES.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.MELON.get());
                        pOutput.accept(ModItems.ENERGY_DRINK.get());
                        pOutput.accept(ModItems.MINT_LEAF.get());
                        pOutput.accept(ModItems.SPICY_FOOD.get());
                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.BANANA_BUNCH.get());
                        pOutput.accept(ModItems.CANDY.get());
                        pOutput.accept(ModItems.CARROT.get());
                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.NORI_SENBEI.get());
                        pOutput.accept(ModItems.HOT_DOG.get());
                        pOutput.accept(ModItems.CANDY_CANE.get());
                        pOutput.accept(ModItems.SUSHI.get());
                    })
                    .build());
    public  static  final RegistryObject<CreativeModeTab> MOB_TAB = CREATIVE_MODE_TABS.register("mob_tab",
            () -> CreativeModeTab.builder().icon((() -> new ItemStack(ModItems.KIRBY_SPAWN_EGG.get())))
                    .title(Component.translatable("creative.mob_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KIRBY_SPAWN_EGG.get());
                    })
                    .build());
    public  static  final RegistryObject<CreativeModeTab> BLOCK_TAB = CREATIVE_MODE_TABS.register("block_tab",
            () -> CreativeModeTab.builder().icon((() -> new ItemStack(ModBlocks.CLOUD.get())))
                    .title(Component.translatable("creative.block_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.COMPRESSEDGOLD.get());
                        pOutput.accept(ModBlocks.COMPRESSEDIRON.get());
                        pOutput.accept(ModBlocks.CLOUD.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_CLOUDWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CLOUDWOOD_LOG.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_BUTTON.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_FENCE.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_SLAB.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_STAIRS.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_DOOR.get());
                        pOutput.accept(ModBlocks.CLOUDWOOD_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.JAMBA_HEART.get());
                        pOutput.accept(ModBlocks.JAMBA_PIECE.get());
                        pOutput.accept(ModBlocks.CRASHED_JAMBA_PIECE.get());
                        pOutput.accept(ModBlocks.UNFINISHED_JAMBA_HEART.get());
                        pOutput.accept(ModBlocks.CORRUPTED_MAGMA.get());
                        pOutput.accept(ModBlocks.MAGMAMELTEDBLOCK.get());
                        pOutput.accept(ModBlocks.GROUNDKIRBY.get());
                        pOutput.accept(ModBlocks.KIRBYGRASS.get());
                        pOutput.accept(ModBlocks.SNOW.get());
                        pOutput.accept(ModBlocks.SAND.get());
                    })
                    .build());
    public  static  final RegistryObject<CreativeModeTab> ITEM_TAB = CREATIVE_MODE_TABS.register("items_tab",
            () -> CreativeModeTab.builder().icon((() -> new ItemStack(ModItems.VOID_FLESH.get())))
                    .title(Component.translatable("creative.items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VOID_FLESH.get());
                        pOutput.accept(ModItems.JAMBA_CRYSTAL.get());
                        pOutput.accept(ModItems.VOID_TERMINA_REMAINT.get());
                        pOutput.accept(ModItems.VOID_TERMINA_FEATHER.get());
                        pOutput.accept(ModItems.VOID_TERMINA_HORN.get());
                        pOutput.accept(ModItems.STARR.get());
                        pOutput.accept(ModItems.ENERGY_SPHERE.get());
                        pOutput.accept(ModItems.ESSENTIAL_PART.get());
                        pOutput.accept(ModItems.REDSTONE_GEM.get());
                        pOutput.accept(ModItems.LAPIS_GEM.get());
                        pOutput.accept(ModItems.MIRROR_SHARD.get());
                        pOutput.accept(ModItems.META_KNIGHTS_SWORD.get());
                        pOutput.accept(ModItems.DARK_META_KNIGHT_SWORD.get());
                        pOutput.accept(ModItems.META_KNIGHTS_MASK.get());
                        pOutput.accept(ModItems.FLAM_SWORD.get());
                        pOutput.accept(ModItems.FRAN_AXE.get());
                        pOutput.accept(ModItems.ZAN_SPEAR.get());
                        pOutput.accept(ModItems.BASIC_SPEAR.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
