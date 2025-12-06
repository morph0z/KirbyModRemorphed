package com.gmail.jamal009a.kirbymodremorphed.core.registries;

import com.gmail.jamal009a.kirbymodremorphed.world.damagesource.ModDamageType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;

public class ModRegistries extends Registries {
    public static final ResourceKey<Registry<ModDamageType>> MOD_DAMAGE_TYPE = createRegistryKey("mod_damage_type");

    private static <T> ResourceKey<Registry<T>> createRegistryKey(String pName) {
        return ResourceKey.createRegistryKey(new ResourceLocation(pName));
    }
}
