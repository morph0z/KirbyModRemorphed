package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel.KiBlastProjectileModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel.KirbyModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.WitherSkull;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KiBlastProjectileRenderer extends GeoEntityRenderer<KiBlastProjectileEntity> {
    public KiBlastProjectileRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KiBlastProjectileModel());
    }

    @Override
    public void render(@NotNull KiBlastProjectileEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
