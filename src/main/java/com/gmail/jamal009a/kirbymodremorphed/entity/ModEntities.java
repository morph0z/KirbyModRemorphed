package com.gmail.jamal009a.kirbymodremorphed.entity;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KirbyModRemorphed.MODID);

    public static final RegistryObject<EntityType<KirbyEntity>> KIRBY =
            ENTITY_TYPES.register("kirby",
                    () -> EntityType.Builder.of(KirbyEntity::new, MobCategory.CREATURE)
                            .sized(0.75f, 0.75f)
                            .build(new ResourceLocation(KirbyModRemorphed.MODID, "kirby").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
