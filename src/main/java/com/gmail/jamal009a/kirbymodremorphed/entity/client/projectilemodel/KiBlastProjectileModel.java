package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilemodel;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KiBlastProjectileModel extends GeoModel<KiBlastProjectileEntity> {
    @Override
    public ResourceLocation getModelResource(KiBlastProjectileEntity kiBlastProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "geo/entity/projectile/kiblastmodel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KiBlastProjectileEntity kiBlastProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/projectiles/kiblastprojectile.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KiBlastProjectileEntity kiBlastProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "animations/entity/projectile/kiblastmodel.animation.json");
    }
}
