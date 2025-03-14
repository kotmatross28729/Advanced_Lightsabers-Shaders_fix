package com.fiskmods.lightsabers.common.event;

import net.minecraft.item.ItemStack;

import com.fiskmods.lightsabers.common.item.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import mods.battlegear2.api.RenderPlayerEventChild.PreRenderSheathed;

public class ClientEventHandlerBG {

    @SubscribeEvent
    public void onPreRenderSheathed(PreRenderSheathed event) {
        ItemStack itemstack = event.element;

        if (itemstack != null) {
            if (itemstack.getItem() == ModItems.lightsaber || itemstack.getItem() == ModItems.doubleLightsaber) {
                event.setCanceled(true);
            }
        }
    }
}
