package com.gmail.jamal009a.kirbymodremorphed.world.damagesource;

import com.gmail.jamal009a.kirbymodremorphed.core.registries.ModRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

public class ModDamageSources {
    private final Registry<ModDamageType> modDamageTypes;
    private final ModDamageSource abilityEffect;

    public ModDamageSources(RegistryAccess pRegistry) {
        this.modDamageTypes = pRegistry.registryOrThrow(ModRegistries.MOD_DAMAGE_TYPE);
        this.abilityEffect = this.source(ModDamageTypes.ABILITY_EFFECT);
    }
    private ModDamageSource source(ResourceKey<ModDamageType> pDamageTypeKey) {
        return new ModDamageSource(this.modDamageTypes.getHolderOrThrow(pDamageTypeKey));
    }

    private ModDamageSource source(ResourceKey<ModDamageType> pDamageTypeKey, @Nullable Entity pEntity) {
        return new ModDamageSource(this.modDamageTypes.getHolderOrThrow(pDamageTypeKey), pEntity);
    }

    private ModDamageSource source(ResourceKey<ModDamageType> pDamageTypeKey, @Nullable Entity pCausingEntity, @Nullable Entity pDirectEntity) {
        return new ModDamageSource(this.modDamageTypes.getHolderOrThrow(pDamageTypeKey), pCausingEntity, pDirectEntity);
    }
}
