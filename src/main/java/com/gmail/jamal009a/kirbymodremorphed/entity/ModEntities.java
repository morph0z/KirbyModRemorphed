package com.gmail.jamal009a.kirbymodremorphed.entity;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.kirby.KirbyEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KirbyModRemorphed.MODID);

    public static final RegistryObject<EntityType<KirbyEntity>> KIRBY =
            ENTITY_TYPES.register("kirby",
                    () -> EntityType.Builder.of(KirbyEntity::new, MobCategory.CREATURE)
                            .sized(0.75f, 0.75f)
                            .build(new ResourceLocation(KirbyModRemorphed.MODID, "kirby").toString()));

    public static final RegistryObject<EntityType<KiBlastProjectileEntity>> KI_BLAST_PROJECTILE =
            ENTITY_TYPES.register("ki_blast_projectile",
                () -> EntityType.Builder.of((EntityType<KiBlastProjectileEntity> pEntityType, Level pLevel) -> new KiBlastProjectileEntity(pEntityType, pLevel), MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .build("ki_blast_projectile"));

    public static final RegistryObject<EntityType<BeamProjectileEntity>> BEAM_PROJECTILE =
            ENTITY_TYPES.register("beam_projectile",
                    () -> EntityType.Builder.of((EntityType<BeamProjectileEntity> pEntityType, Level pLevel) -> new BeamProjectileEntity(pEntityType, pLevel), MobCategory.MISC)
                            .sized(0.5F, 0.5F)
                            .build("beam_projectile"));

    public static final RegistryObject<EntityType<BeamWaveProjectileEntity>> BEAM_WAVE_PROJECTILE =
            ENTITY_TYPES.register("beam_wave_projectile",
                    () -> EntityType.Builder.of((EntityType<BeamWaveProjectileEntity> pEntityType, Level pLevel) -> new BeamWaveProjectileEntity(pEntityType, pLevel), MobCategory.MISC)
                            .sized(0.5F, 0.5F)
                            .build("beam_wave_projectile"));

    public static final RegistryObject<EntityType<DamageHitBoxEntity>> DAMAGE_HIT_BOX_ENTITY =
            ENTITY_TYPES.register("damage_hit_box",
                    () -> EntityType.Builder.of((EntityType<DamageHitBoxEntity> pEntityType, Level pLevel) -> new DamageHitBoxEntity(pEntityType, pLevel), MobCategory.MISC)
                            .sized(0.5F, 0.5F)
                            .build("damage_hit_box"));

    public static final RegistryObject<EntityType<CupidArrowProjectileEntity>> CUPID_ARROW =
            ENTITY_TYPES.register("cupid_arrow",
                    () -> EntityType.Builder.of((EntityType<CupidArrowProjectileEntity> pEntityType, Level pLevel) -> new CupidArrowProjectileEntity(pEntityType, pLevel), MobCategory.MISC)
                            .sized(0.5F, 0.5F)
                            .build("cupid_arrow"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
