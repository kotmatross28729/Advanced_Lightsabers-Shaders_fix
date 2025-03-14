package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionProdigalSon extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body10;
    public ModelRenderer body8;
    public ModelRenderer body9;

    public ModelSwitchSectionProdigalSon() {
        textureWidth = 64;
        textureHeight = 32;
        body3 = new ModelRenderer(this, 0, 0);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        body7 = new ModelRenderer(this, 0, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        body6 = new ModelRenderer(this, 0, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        body9 = new ModelRenderer(this, 8, 0);
        body9.setRotationPoint(-1.5F, 1.75F, 0.75F);
        body9.addBox(-1.0F, -2.0F, -0.5F, 1, 4, 1, 0.0F);
        body10 = new ModelRenderer(this, 0, 0);
        body10.setRotationPoint(0.0F, 0.0F, 0.0F);
        body10.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body10, 0.0F, -0.7853981633974483F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        body4 = new ModelRenderer(this, 0, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        body8 = new ModelRenderer(this, 0, 9);
        body8.setRotationPoint(0.0F, -4.0F, 3.62F);
        body8.addBox(-1.5F, -4.0F, 0.0F, 3, 8, 2, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        body1.addChild(body3);
        body1.addChild(body7);
        body1.addChild(body6);
        body8.addChild(body9);
        body1.addChild(body10);
        body1.addChild(body4);
        body7.addChild(body8);
        body1.addChild(body2);
        body1.addChild(body5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(body1.offsetX, body1.offsetY, body1.offsetZ);
        GL11.glTranslatef(body1.rotationPointX * f5, body1.rotationPointY * f5, body1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.1D, 1.1D);
        GL11.glTranslatef(-body1.offsetX, -body1.offsetY, -body1.offsetZ);
        GL11.glTranslatef(-body1.rotationPointX * f5, -body1.rotationPointY * f5, -body1.rotationPointZ * f5);
        body1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
