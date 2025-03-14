package com.fiskmods.lightsabers.common.data;

import net.minecraft.entity.Entity;

import com.fiskmods.lightsabers.common.force.PowerData;
import com.fiskmods.lightsabers.common.force.PowerData.Container;

public class ALDataPowers extends ALData<PowerData.Container> {

    public ALDataPowers() {
        super(PowerData.Container.factory());
    }

    @Override
    protected void update(Entity entity) {
        Container value = get(entity);

        if (value != null) {
            value.update(entity);
        }
    }

    @Override
    protected void onValueChanged(Entity entity, Container value) {
        if (value != null) {
            value.markDirty(entity);
        }
    }
}
