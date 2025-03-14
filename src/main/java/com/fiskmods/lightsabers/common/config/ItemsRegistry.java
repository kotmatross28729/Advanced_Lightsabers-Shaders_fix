package com.fiskmods.lightsabers.common.config;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class ItemsRegistry {

    public static List<ItemWM> excludedItems = new ArrayList<>();

    public static class ItemWM {

        public final Item item;

        public ItemWM(Item item) {
            this.item = item;
        }
    }
}
