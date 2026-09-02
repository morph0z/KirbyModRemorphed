package com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.WaddleDeeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WaddleDeeModel extends GeoModel<WaddleDeeEntity> {
    @Override
    public ResourceLocation getModelResource(WaddleDeeEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "geo/entity/waddle_dee.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaddleDeeEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/waddle_dee.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WaddleDeeEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "animations/entity/waddle_dee.animation.json");
    }
}
