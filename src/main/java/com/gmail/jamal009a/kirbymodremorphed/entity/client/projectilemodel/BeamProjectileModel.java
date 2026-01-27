package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilemodel;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BeamProjectileModel extends GeoModel<BeamProjectileEntity> {
    @Override
    public ResourceLocation getModelResource(BeamProjectileEntity BeamProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "geo/entity/projectile/beammodel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BeamProjectileEntity BeamProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/projectiles/beamprojectile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BeamProjectileEntity beamProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "animations/entity/projectile/beammodel.animation.json");
    }
}
