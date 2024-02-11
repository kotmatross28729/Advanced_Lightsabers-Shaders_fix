package com.fiskmods.lightsabers.common.config;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ItemsRegistry {
    public static List<ItemWM> excludedItems = new ArrayList<>();
    public static class ItemWM {

        public final Item item;
        public ItemWM(Item item) {
            this.item = item;
        }
    }
}
