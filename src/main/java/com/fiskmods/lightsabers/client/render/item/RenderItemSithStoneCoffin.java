package com.fiskmods.lightsabers.client.render.item;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.fiskmods.lightsabers.common.tileentity.TileEntitySithStoneCoffin;

public class RenderItemSithStoneCoffin implements IItemRenderer {

    private final TileEntity tile = new TileEntitySithStoneCoffin();

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        float scale = 0.6F;
        GL11.glScalef(scale, scale, scale);

        if (type == ItemRenderType.ENTITY || type == ItemRenderType.INVENTORY) {
            GL11.glTranslatef(-0.5F, -1.0F, -0.5F);
        } else if (type == ItemRenderType.EQUIPPED) {
            GL11.glTranslatef(0.5F, 0.0F, 0.5F);
        } else if (type == ItemRenderType.EQUIPPED_FIRST_PERSON || type == ItemRenderType.FIRST_PERSON_MAP) {
            GL11.glTranslatef(0.5F, 0.0F, 0.5F);
        }

        TileEntityRendererDispatcher.instance.renderTileEntityAt(tile, 0.0F, 0.0F, 0.0F, 0.0F);
    }
}
