package com.gmail.jamal009a.kirbymodremorphed.world.damagesource;

import com.gmail.jamal009a.kirbymodremorphed.core.registries.ModRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;

public interface ModDamageTypes{
    ResourceKey<ModDamageType> ABILITY_EFFECT = ResourceKey.create(ModRegistries.MOD_DAMAGE_TYPE, new ResourceLocation("ability_effect"));
}
