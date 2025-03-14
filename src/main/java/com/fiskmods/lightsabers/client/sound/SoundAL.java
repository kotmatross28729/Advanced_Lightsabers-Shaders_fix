package com.fiskmods.lightsabers.client.sound;

import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.ResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SoundAL extends PositionedSound {

    public static SoundAL mediumHum = SoundAL
        .makeSound(new ResourceLocation(ALSounds.ambient_lightsaber_hum_medium), true, 1.0F, 0.5F);

    public static SoundAL makeSound(ResourceLocation resourceLocation, boolean loop) {
        SoundAL sound = new SoundAL(
            resourceLocation,
            1.0F,
            1.0F,
            false,
            0,
            ISound.AttenuationType.NONE,
            0.0F,
            0.0F,
            0.0F);
        sound.repeat = loop;
        return sound;
    }

    public static SoundAL makeSound(ResourceLocation resourceLocation, boolean loop, float volume, float pitch) {
        return new SoundAL(resourceLocation, volume, pitch, loop, 0, AttenuationType.NONE, 0.0F, 0.0F, 0.0F);
    }

    public static SoundAL makeSound(ResourceLocation resourceLocation, boolean loop, float x, float y, float z) {
        return new SoundAL(resourceLocation, 1.0F, 1.0F, loop, 0, AttenuationType.LINEAR, x, y, z);
    }

    public static SoundAL makeSound(ResourceLocation resourceLocation, boolean loop, float x, float y, float z,
        float volume, float pitch, ISound.AttenuationType attenuationType) {
        return new SoundAL(resourceLocation, volume, pitch, loop, 0, attenuationType, x, y, z);
    }

    public SoundAL(ResourceLocation location, float volume, float pitch, boolean repeat, int p_i45108_5_,
        ISound.AttenuationType p_i45108_6_, float x, float y, float z) {
        super(location);
        this.volume = volume;
        field_147663_c = pitch;
        xPosF = x;
        yPosF = y;
        zPosF = z;
        this.repeat = repeat;
        field_147665_h = p_i45108_5_;
        field_147666_i = p_i45108_6_;
    }
}
