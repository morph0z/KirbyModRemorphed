
package com.gmail.jamal009a.kirbymodremorphed.entity.client.mobrender;

import com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel.JambelieverModel;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.JambelieverEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class JambelieverRenderer extends GeoEntityRenderer<JambelieverEntity> {
    public JambelieverRenderer(EntityRendererProvider.Context renderManager) {super(renderManager, new JambelieverModel());}

    @Override
    public void render(@NotNull JambelieverEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    protected float getDeathMaxRotation(JambelieverEntity animatable) {
        return 0.0F;
    }
}
