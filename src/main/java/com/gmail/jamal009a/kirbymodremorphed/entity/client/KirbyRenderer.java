package com.gmail.jamal009a.kirbymodremorphed.entity.client;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KirbyRenderer extends GeoEntityRenderer<KirbyEntity> {
    public KirbyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KirbyModel());
    }

//    @Override
//    public ResourceLocation getTextureLocation(KirbyEntity animatable) {
//        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entity/kirby.png");
//    }

    @Override
    public void render(@NotNull KirbyEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
//        if(entity.isBaby()) {
//            poseStack.scale(0.4f, 0.4f, 0.4f);
//        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}