package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.CrashAbility;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.MicrophoneAbility;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CrashAbilityRenderer extends GeoArmorRenderer<CrashAbility> {
    public CrashAbilityRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(KirbyModRemorphed.MODID, "armor/ability/crashability")));
    }
}
