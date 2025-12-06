package com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KirbyModel extends GeoModel<KirbyEntity> {
    @Override
    public ResourceLocation getModelResource(KirbyEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "geo/entity/kirbyani.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KirbyEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/kirby.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KirbyEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "animations/entity/kirbyani.animation.json");
    }

//    @Override
//    public void setCustomAnimations(KirbyEntity animatable, long instanceId, AnimationState<KirbyEntity> animationState) {
//
//    }
}
