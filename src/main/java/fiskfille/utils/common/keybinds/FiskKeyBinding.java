package fiskfille.utils.common.keybinds;

import net.minecraft.client.settings.KeyBinding;

import fiskfille.utils.helper.FiskServerUtils;

public class FiskKeyBinding extends KeyBinding {

    public final String defaultKeyDescription;
    public String keyDescription;

    public FiskKeyBinding(String name, int key) {
        super(name = "key." + FiskServerUtils.getActiveModId() + "." + name, key, FiskServerUtils.getActiveModName());
        defaultKeyDescription = name;
        keyDescription = name;

        FiskKeyHandler.KEYS.add(this);
    }

    @Override
    public String getKeyDescription() {
        return keyDescription;
    }

    @Override
    public String toString() {
        return defaultKeyDescription;
    }
}
