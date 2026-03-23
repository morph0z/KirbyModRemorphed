package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilemodel.BeamProjectileModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilemodel.BeamWaveProjectileModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamWaveProjectileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BeamWaveProjectileRenderer extends AbilityProjectileRenderer<BeamWaveProjectileEntity> {
    public BeamWaveProjectileRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BeamWaveProjectileModel());
    }

    @Override
    public void render(@NotNull BeamWaveProjectileEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
