package com.gmail.jamal009a.kirbymodremorphed.item;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
//import com.gmail.jamal009a.kirbymodremorphed.item.armor.*;
import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.MetaKnightArmor;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.BeamAbility;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.CupidAbility;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.FighterAbility;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.MicrophoneAbility;
import com.gmail.jamal009a.kirbymodremorphed.item.food.*;
import com.gmail.jamal009a.kirbymodremorphed.item.simple.*;
import com.gmail.jamal009a.kirbymodremorphed.item.weapon.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KirbyModRemorphed.MODID);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_FLESH = ITEMS.register("void_flesh",
            VOIDFleshItem::new);
    public static final RegistryObject<Item> JAMBA_CRYSTAL = ITEMS.register("jamba_crystal",
            JambaCrystalItem::new);
    public static final RegistryObject<Item> VOID_TERMINA_FEATHER = ITEMS.register("void_termina_feather",
            VoidTerminaFeatherItem::new);
    public static final RegistryObject<Item> VOID_TERMINA_HORN = ITEMS.register("void_termina_horn",
            VoidTerminaHornItem::new);
    public static final RegistryObject<Item> VOID_TERMINA_REMAINT = ITEMS.register("void_termina_remaint",
            VoidTerminaRemaintItem::new);
    public static final RegistryObject<Item> STARR = ITEMS.register("starr",
            StarrItem::new);
    public static final RegistryObject<Item> ENERGY_SPHERE = ITEMS.register("energy_sphere",
            EnergySphereItem::new);
    public static final RegistryObject<Item> ESSENTIAL_PART = ITEMS.register("essential_part",
            EssentialPartItem::new);
    public static final RegistryObject<Item> REDSTONE_GEM = ITEMS.register("redstone_gem",
            RedstonegemItem::new);
    public static final RegistryObject<Item> LAPIS_GEM = ITEMS.register("lapis_gem",
            LapisgemaItem::new);
    public static final RegistryObject<Item> MIRROR_SHARD = ITEMS.register("mirror_shard",
            MirrorShardItem::new);
    public static final RegistryObject<Item> MAXIM_TOMATO = ITEMS.register("maxim_tomato",
            () -> new Item(new Item.Properties().food(ModFoods.MAXIM_TOMATO)));
    public static final RegistryObject<Item> BAGEL = ITEMS.register("bagel",
            () -> new Item(new Item.Properties().food(ModFoods.BAGEL)));
    public static final RegistryObject<Item> ONIGIRI = ITEMS.register("onigiri",
            () -> new Item(new Item.Properties().food(ModFoods.ONIGIRI)));
    public static final RegistryObject<Item> ICE_CREAM_BAR = ITEMS.register("ice_cream_bar",
            () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM_BAR)));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().food(ModFoods.CHERRIES)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> MELON = ITEMS.register("melon",
            () -> new Item(new Item.Properties().food(ModFoods.MELON)));
    public static final RegistryObject<Item> ENERGY_DRINK = ITEMS.register("energy_drink",
            () -> new Item(new Item.Properties().food(ModFoods.ENERGY_DRINK)));
    public static final RegistryObject<Item> MINT_LEAF = ITEMS.register("mint_leaf",
            () -> new Item(new Item.Properties().food(ModFoods.MINT_LEAF)));
    public static final RegistryObject<Item> SPICY_FOOD = ITEMS.register("spicy_food",
            () -> new Item(new Item.Properties().food(ModFoods.SPICY_FOOD)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> BANANA_BUNCH = ITEMS.register("banana_bunch",
            () -> new Item(new Item.Properties().food(ModFoods.BANANA_BUNCH)));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY)));
    public static final RegistryObject<Item> CARROT = ITEMS.register("carrot",
            () -> new Item(new Item.Properties().food(ModFoods.CARROT)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN)));
    public static final RegistryObject<Item> NORI_SENBEI = ITEMS.register("nori_senbei",
            () -> new Item(new Item.Properties().food(ModFoods.NORI_SENBEI)));
    public static final RegistryObject<Item> HOT_DOG = ITEMS.register("hot_dog",
            () -> new Item(new Item.Properties().food(ModFoods.HOT_DOG)));
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_CANE)));
    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi",
            () -> new Item(new Item.Properties().food(ModFoods.SUSHI)));
    public static final RegistryObject<Item> INVINCIBLE_CANDY = ITEMS.register("invincible_candy",
            InvincibleCandy::new);
    public static final RegistryObject<Item> META_KNIGHTS_SWORD = ITEMS.register("meta_knights_sword",
            MetaKnightsSwordItem::new);
    public static final RegistryObject<Item> META_KNIGHTS_MASK = ITEMS.register("meta_knights_mask", () -> new MetaKnightArmor(ModArmorMaterials.META_KNIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> META_KNIGHTS_WINGS = ITEMS.register("meta_knights_wings", () -> new MetaKnightArmor(ModArmorMaterials.META_KNIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DARK_META_KNIGHT_SWORD = ITEMS.register("dark_meta_knights_sword",
            DarkMetaKightSwordItem::new);
    public static final RegistryObject<Item> FIGHTER_GLOVE = ITEMS.register("fighter_glove",
            FighterGloveItem::new);
    public static final RegistryObject<Item> FLAM_SWORD = ITEMS.register("flam_sword",
            FlamSwordItem::new);
    public static final RegistryObject<Item> FRAN_AXE = ITEMS.register("fran_axe",
            FranAxeItem::new);
    public static final RegistryObject<Item> ZAN_SPEAR = ITEMS.register("zan_spear",
            ZanSpearItem::new);
    public static final RegistryObject<Item> BASIC_HAMMER = ITEMS.register("basic_hammer",
            HammerWeaponItem::new);
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            KatanaItem::new);
    public static final RegistryObject<Item> KIRBY_SWORD = ITEMS.register("kirby_sword",
            KirbysSwordItem::new);
    public static final RegistryObject<Item> MECH_FIST = ITEMS.register("iron_fist",
            MechFistItem::new);
    public static final RegistryObject<Item> ROCK_FIST = ITEMS.register("rock_fist",
            RockFistItem::new);
    public static final RegistryObject<Item> BASIC_SPEAR = ITEMS.register("basic_spear",
            BasicSpearItem::new);
    public static final RegistryObject<Item> BEAM_ABILITY = ITEMS.register("beam_ability", () -> new BeamAbility(ModArmorMaterials.ABILITY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MICROPHONE_ABILITY = ITEMS.register("microphone_ability", () -> new MicrophoneAbility(ModArmorMaterials.ABILITY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CUPID_ABILITY = ITEMS.register("cupid_ability", () -> new CupidAbility(ModArmorMaterials.ABILITY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FIGHTER_ABILITY = ITEMS.register("fighter_ability", () -> new FighterAbility(ModArmorMaterials.ABILITY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KIRBY_SPAWN_EGG = ITEMS.register("kirby_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.KIRBY, 0xFFC0CB, 0xFF007F, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));
    }
}
