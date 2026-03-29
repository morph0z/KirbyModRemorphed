package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public abstract class AbilityProjectileRenderer<T extends AbstractAbilityProjectile & GeoAnimatable> extends GeoEntityRenderer<T> {
    public AbilityProjectileRenderer(EntityRendererProvider.Context renderManager, GeoModel model) {
        super(renderManager, (GeoModel<T>) model);
    }

    @Override
    public void render(T entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    public void actuallyRender(PoseStack poseStack, AbstractAbilityProjectile animatable, BakedGeoModel model, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.mulPose(Axis.YP.rotationDegrees(animatable.getRotation().y));
        poseStack.mulPose(Axis.XP.rotationDegrees(animatable.getRotation().x));
        super.actuallyRender(poseStack, (T) animatable, model, renderType, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
