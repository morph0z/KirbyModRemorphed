package com.gmail.jamal009a.kirbymodremorphed.entity.client.projectilerender;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public abstract class AbilityProjectileRenderer<T extends AbstractAbilityProjectile & GeoAnimatable> extends GeoEntityRenderer<T> {
    public AbilityProjectileRenderer(EntityRendererProvider.Context renderManager, GeoModel model) {
        super(renderManager, (GeoModel<T>) model);
    }

//    public void actuallyRender(PoseStack poseStack, AbstractAbilityProjectile animatable, BakedGeoModel model, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//        poseStack.mulPose(Axis.YP.rotationDegrees(animatable.getYRot()));
//        poseStack.mulPose(Axis.XP.rotationDegrees(-animatable.getXRot()));
//        actuallyRender(poseStack, animatable, model, renderType, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
//    }

//    @Override
//    public void actuallyRender(PoseStack poseStack, AbstractAbilityProjectile animatable, BakedGeoModel model, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//        poseStack.mulPose(Axis.YP.rotationDegrees(animatable.getYRot()));
//        poseStack.mulPose(Axis.XP.rotationDegrees(animatable.getXRot()));
//        actuallyRender(poseStack, animatable, model, renderType, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
//    }

}
