package com.gmail.jamal009a.kirbymodremorphed.item;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    //MASK_META_KNIGHT("metaknightmask",26, new int[]{10,0,0,0}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE,1, 0, () -> Ingredient.of(ModBlocks.COMPRESSEDIRON.get())),
    //ABILITY("ability",26, new int[]{5,0,0,0}, 25, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kirbymodremorphed:power_up")),1, 0, ()->Ingredient.of(ModItems.STARR.get()));;
    META_KNIGHT("meta_knight",15, new int[]{5,3,0,0}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 1, 0.2F, null ),
    ABILITY("ability", 15, new int[]{4,0,0,0}, 25, ModSounds.POWER_UP.get(), 1, 0, null );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackRecistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackRecistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackRecistance = knockbackRecistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()]* this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return KirbyModRemorphed.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackRecistance;
    }
}
