package com.fiskmods.lightsabers.common.force.effect;

import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PowerEffectActive extends PowerEffect {

    public PowerEffectActive(int amplifier) {
        super(amplifier);
    }

    public void start(EntityPlayer player, Side side) {}

    public void stop(EntityPlayer player, Side side) {}

    @SideOnly(Side.CLIENT)
    public void render(EntityPlayer player, float partialTicks) {}
}
