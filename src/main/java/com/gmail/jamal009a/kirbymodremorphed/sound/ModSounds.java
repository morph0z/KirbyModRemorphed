package com.gmail.jamal009a.kirbymodremorphed.sound;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, KirbyModRemorphed.MODID);

    public static final RegistryObject<SoundEvent>POWER_UP = registerSoundEvents("power_up");

//    public static final ForgeSoundType SOUND_BLOCK_SOUNDS = new ForgeSoundType(1F,1F,
//            ModSounds.SOUND_BLOCK_BREAK,ModSounds.SOUND_BLOCK_STEP)

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(KirbyModRemorphed.MODID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register((eventBus));
    }
}
