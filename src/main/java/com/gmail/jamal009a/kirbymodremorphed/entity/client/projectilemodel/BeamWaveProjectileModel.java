package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilemodel;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamWaveProjectileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BeamWaveProjectileModel extends GeoModel<BeamWaveProjectileEntity> {
    @Override
    public ResourceLocation getModelResource(BeamWaveProjectileEntity BeamWaveProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "geo/entity/projectile/beamwavemodel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BeamWaveProjectileEntity BeamWaveProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/projectiles/beamprojectile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BeamWaveProjectileEntity BeamWaveProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "animations/entity/projectile/beamwavemodel.animation.json");
    }
}
