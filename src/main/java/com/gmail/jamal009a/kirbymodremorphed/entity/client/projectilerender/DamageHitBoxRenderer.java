package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.DamageHitBoxEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DamageHitBoxRenderer extends EntityRenderer<DamageHitBoxEntity> {

    public DamageHitBoxRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public @Nullable ResourceLocation getTextureLocation(@NotNull DamageHitBoxEntity pEntity) {
        return null;
    }
}
