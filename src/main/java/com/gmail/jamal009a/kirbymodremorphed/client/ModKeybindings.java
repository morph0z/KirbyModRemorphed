package com.gmail.jamal009a.kirbymodremorphed.client;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public class ModKeybindings {
    public static final ModKeybindings INSTANCE = new ModKeybindings();

    private ModKeybindings(){}

    private static final String CATEGORY = "key.categories." + KirbyModRemorphed.MODID;

    public final KeyMapping primaryAbilityUse = new KeyMapping(
            "key."+KirbyModRemorphed.MODID+".primary_ability_use",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_X, -1),
            CATEGORY
    );
    public final KeyMapping secondaryAbilityUse = new KeyMapping(
            "key."+KirbyModRemorphed.MODID+".secondary_ability_use",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_V, -1),
            CATEGORY
    );


    public final KeyMapping wingsSideRollLeft = new KeyMapping(
            "key."+KirbyModRemorphed.MODID+".wings_side_roll_left",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_Z, -1),
            CATEGORY
    );
    public final KeyMapping wingsSideRollRight = new KeyMapping(
            "key."+KirbyModRemorphed.MODID+".wings_side_roll_right",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_C, -1),
            CATEGORY
    );
}
