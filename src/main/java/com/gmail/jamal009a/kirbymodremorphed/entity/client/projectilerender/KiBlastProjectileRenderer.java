package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilemodel.KiBlastProjectileModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KiBlastProjectileRenderer extends AbilityProjectileRenderer<KiBlastProjectileEntity> {
    public KiBlastProjectileRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KiBlastProjectileModel());
    }

    @Override
    public void render(@NotNull KiBlastProjectileEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
