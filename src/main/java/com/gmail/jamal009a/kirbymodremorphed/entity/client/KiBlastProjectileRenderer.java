package com.gmail.jamal009a.kirbymodremorphed.entity.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class KiBlastProjectileRenderer extends ArrowRenderer<KiBlastProjectileEntity> {
    public KiBlastProjectileRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(KiBlastProjectileEntity kiBlastProjectileEntity) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/projectiles/kiblastprojectile.png");
    }
}
