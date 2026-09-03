
package com.gmail.jamal009a.kirbymodremorphed.entity.client.mobmodel;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.JambelieverEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;


public class JambelieverModel extends GeoModel<JambelieverEntity> {
    @Override
    public ResourceLocation getModelResource(JambelieverEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "geo/entity/jambeliever.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JambelieverEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "textures/entities/jambeliever.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JambelieverEntity animatable) {
        return new ResourceLocation(KirbyModRemorphed.MODID, "animations/entity/jambeliever.animation.json");
    }
}
