package com.gmail.jamal009a.kirbymodremorphed.item.armor.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.MicrophoneAbility;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MicrophoneAbilityRenderer extends GeoArmorRenderer<MicrophoneAbility> {
    public MicrophoneAbilityRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(KirbyModRemorphed.MODID, "armor/microphoneability")));
    }
}
