package com.gmail.jamal009a.kirbymodremorphed.entity.client.mobrender;

import com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel.WaddleDeeModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.WaddleDeeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WaddleDeeRenderer extends GeoEntityRenderer<WaddleDeeEntity> {
    public WaddleDeeRenderer(EntityRendererProvider.Context renderManager) {super(renderManager, new WaddleDeeModel());}

    @Override
    public void render(@NotNull WaddleDeeEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    protected float getDeathMaxRotation(WaddleDeeEntity animatable) {
        return 0.0F;
    }
}