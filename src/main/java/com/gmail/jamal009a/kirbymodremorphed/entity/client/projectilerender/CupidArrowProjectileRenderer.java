package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.CupidArrowProjectileEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class CupidArrowProjectileRenderer extends ArrowRenderer<CupidArrowProjectileEntity> {
    public CupidArrowProjectileRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    private static final ResourceLocation TEXTURE =
            new ResourceLocation("kirbymodremorphed",
                    "textures/entities/projectiles/cupid_arrow.png");

    @Override
    public ResourceLocation getTextureLocation(CupidArrowProjectileEntity cupidArrowProjectileEntity) {
        return TEXTURE;
    }
}
