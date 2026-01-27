package com.gmail.jamal009a.kirbymodremorphed.sound;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KirbyModRemorphed.MODID);

    public static final RegistryObject<SoundEvent>POWER_UP = registerSoundEvents("power_up");

    public static final RegistryObject<SoundEvent>MIC_SHOUT_1 = registerSoundEvents("mic_shout_1");
    public static final RegistryObject<SoundEvent>MIC_SHOUT_2 = registerSoundEvents("mic_shout_2");
    public static final RegistryObject<SoundEvent>MIC_SHOUT_3 = registerSoundEvents("mic_shout_3");

    public static final RegistryObject<SoundEvent>ABILITY_CHARGE_1 = registerSoundEvents("ability_charge_1");
    public static final RegistryObject<SoundEvent>ABILITY_CHARGE_2 = registerSoundEvents("ability_charge_2");
    public static final RegistryObject<SoundEvent>ABILITY_CHARGE_3 = registerSoundEvents("ability_charge_3");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(KirbyModRemorphed.MODID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register((eventBus));
    }
}
