package com.gmail.jamal009a.kirbymodremorphed.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.weapon.KatanaItem;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModKeybindings {
    public static final ModKeybindings INSTANCE = new ModKeybindings();

    private ModKeybindings(){}

    private static final String CATAGORY = "key.catagories." + KirbyModRemorphed.MODID;

    public final KeyMapping primaryAbilityUse = new KeyMapping(
            "key."+KirbyModRemorphed.MODID+".primary_ability_use",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_X, -1),
            CATAGORY
    );
    public final KeyMapping secondaryAbilityUse = new KeyMapping(
            "key."+KirbyModRemorphed.MODID+".secondary_ability_use",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_V, -1),
            CATAGORY
    );
}
