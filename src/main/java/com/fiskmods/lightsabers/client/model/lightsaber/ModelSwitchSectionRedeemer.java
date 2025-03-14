package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionRedeemer extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer upperSideButton1;
    public ModelRenderer lowerSideButton1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body9;
    public ModelRenderer body8;
    public ModelRenderer upperSideButton2;
    public ModelRenderer upperSideButton3;
    public ModelRenderer upperSideButton4;
    public ModelRenderer upperSideButton5;
    public ModelRenderer upperSideButton6;
    public ModelRenderer upperSideButton7;
    public ModelRenderer upperSideButton8;
    public ModelRenderer lowerSideButton2;
    public ModelRenderer lowerSideButton3;
    public ModelRenderer lowerSideButton4;
    public ModelRenderer lowerSideButton5;
    public ModelRenderer lowerSideButton6;
    public ModelRenderer lowerSideButton7;
    public ModelRenderer lowerSideButton8;
    public ModelRenderer lowerSideButton9;
    public ModelRenderer lowerSideButton10;
    public ModelRenderer lowerSideButton11;
    public ModelRenderer lowerSideButton12;
    public ModelRenderer lowerSideButton13;
    public ModelRenderer lowerSideButton14;

    public ModelSwitchSectionRedeemer() {
        textureWidth = 64;
        textureHeight = 32;
        lowerSideButton5 = new ModelRenderer(this, 10, 9);
        lowerSideButton5.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton5.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton5, 0.0F, 3.141592653589793F, 0.0F);
        body3 = new ModelRenderer(this, 0, 0);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        lowerSideButton2 = new ModelRenderer(this, 10, 9);
        lowerSideButton2.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton2.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton2, 0.0F, 0.7853981633974483F, 0.0F);
        lowerSideButton13 = new ModelRenderer(this, 22, 0);
        lowerSideButton13.setRotationPoint(0.0F, -2.0F, 0.0F);
        lowerSideButton13.addBox(-1.5F, -1.5F, 2.7F, 3, 3, 2, 0.0F);
        setRotateAngle(lowerSideButton13, 0.0F, -1.0471975511965976F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body1, 0.0F, -1.5707963267948966F, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        lowerSideButton7 = new ModelRenderer(this, 10, 9);
        lowerSideButton7.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton7.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton7, 0.0F, -1.5707963267948966F, 0.0F);
        lowerSideButton12 = new ModelRenderer(this, 22, 0);
        lowerSideButton12.setRotationPoint(0.0F, -2.0F, 0.0F);
        lowerSideButton12.addBox(-1.5F, -1.5F, 2.7F, 3, 3, 2, 0.0F);
        setRotateAngle(lowerSideButton12, 0.0F, 2.0943951023931953F, 0.0F);
        lowerSideButton11 = new ModelRenderer(this, 22, 0);
        lowerSideButton11.setRotationPoint(0.0F, -2.0F, 0.0F);
        lowerSideButton11.addBox(-1.5F, -1.5F, 2.7F, 3, 3, 2, 0.0F);
        setRotateAngle(lowerSideButton11, 0.0F, 1.0471975511965976F, 0.0F);
        upperSideButton3 = new ModelRenderer(this, 8, 0);
        upperSideButton3.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton3.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton3, 0.0F, 1.5707963267948966F, 0.0F);
        upperSideButton2 = new ModelRenderer(this, 8, 0);
        upperSideButton2.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton2.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton2, 0.0F, 0.7853981633974483F, 0.0F);
        upperSideButton5 = new ModelRenderer(this, 8, 0);
        upperSideButton5.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton5.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton5, 0.0F, 3.141592653589793F, 0.0F);
        lowerSideButton10 = new ModelRenderer(this, 22, 0);
        lowerSideButton10.setRotationPoint(0.0F, -2.0F, 0.0F);
        lowerSideButton10.addBox(-1.5F, -1.5F, 2.7F, 3, 3, 2, 0.0F);
        setRotateAngle(lowerSideButton10, 0.0F, 3.141592653589793F, 0.0F);
        lowerSideButton9 = new ModelRenderer(this, 22, 0);
        lowerSideButton9.setRotationPoint(0.0F, -2.0F, 0.0F);
        lowerSideButton9.addBox(-1.5F, -1.5F, 2.7F, 3, 3, 2, 0.0F);
        body8 = new ModelRenderer(this, 0, 9);
        body8.setRotationPoint(0.0F, -4.0F, 3.62F);
        body8.addBox(-1.5F, -4.0F, 0.0F, 3, 8, 2, 0.0F);
        lowerSideButton8 = new ModelRenderer(this, 10, 9);
        lowerSideButton8.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton8.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton8, 0.0F, -0.7853981633974483F, 0.0F);
        body7 = new ModelRenderer(this, 0, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        body6 = new ModelRenderer(this, 0, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        lowerSideButton1 = new ModelRenderer(this, 10, 9);
        lowerSideButton1.setRotationPoint(-3.62F, -2.1F, 0.0F);
        lowerSideButton1.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton1, 1.5707963267948966F, 1.5707963267948966F, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        upperSideButton1 = new ModelRenderer(this, 8, 0);
        upperSideButton1.setRotationPoint(-3.62F, -6.1F, 0.0F);
        upperSideButton1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton1, 1.5707963267948966F, 1.5707963267948966F, 0.0F);
        body4 = new ModelRenderer(this, 0, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        body9 = new ModelRenderer(this, 0, 0);
        body9.setRotationPoint(0.0F, 0.0F, 0.0F);
        body9.addBox(-1.5F, -8.0F, 2.62F, 3, 8, 1, 0.0F);
        setRotateAngle(body9, 0.0F, -0.7853981633974483F, 0.0F);
        upperSideButton6 = new ModelRenderer(this, 8, 0);
        upperSideButton6.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton6.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton6, 0.0F, -2.356194490192345F, 0.0F);
        upperSideButton7 = new ModelRenderer(this, 8, 0);
        upperSideButton7.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton7.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton7, 0.0F, -1.5707963267948966F, 0.0F);
        lowerSideButton3 = new ModelRenderer(this, 10, 9);
        lowerSideButton3.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton3.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton3, 0.0F, 1.5707963267948966F, 0.0F);
        upperSideButton8 = new ModelRenderer(this, 8, 0);
        upperSideButton8.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton8.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton8, 0.0F, -0.7853981633974483F, 0.0F);
        upperSideButton4 = new ModelRenderer(this, 8, 0);
        upperSideButton4.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperSideButton4.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(upperSideButton4, 0.0F, 2.356194490192345F, 0.0F);
        lowerSideButton4 = new ModelRenderer(this, 10, 9);
        lowerSideButton4.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton4.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton4, 0.0F, 2.356194490192345F, 0.0F);
        lowerSideButton6 = new ModelRenderer(this, 10, 9);
        lowerSideButton6.setRotationPoint(0.0F, 0.0F, 0.0F);
        lowerSideButton6.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(lowerSideButton6, 0.0F, -2.356194490192345F, 0.0F);
        lowerSideButton14 = new ModelRenderer(this, 22, 0);
        lowerSideButton14.setRotationPoint(0.0F, -2.0F, 0.0F);
        lowerSideButton14.addBox(-1.5F, -1.5F, 2.7F, 3, 3, 2, 0.0F);
        setRotateAngle(lowerSideButton14, 0.0F, -2.0943951023931953F, 0.0F);
        lowerSideButton1.addChild(lowerSideButton5);
        body1.addChild(body3);
        lowerSideButton1.addChild(lowerSideButton2);
        lowerSideButton1.addChild(lowerSideButton13);
        body1.addChild(body5);
        lowerSideButton1.addChild(lowerSideButton7);
        lowerSideButton1.addChild(lowerSideButton12);
        lowerSideButton1.addChild(lowerSideButton11);
        upperSideButton1.addChild(upperSideButton3);
        upperSideButton1.addChild(upperSideButton2);
        upperSideButton1.addChild(upperSideButton5);
        lowerSideButton1.addChild(lowerSideButton10);
        lowerSideButton1.addChild(lowerSideButton9);
        body7.addChild(body8);
        lowerSideButton1.addChild(lowerSideButton8);
        body1.addChild(body7);
        body1.addChild(body6);
        body1.addChild(body2);
        body1.addChild(body4);
        body1.addChild(body9);
        upperSideButton1.addChild(upperSideButton6);
        upperSideButton1.addChild(upperSideButton7);
        lowerSideButton1.addChild(lowerSideButton3);
        upperSideButton1.addChild(upperSideButton8);
        upperSideButton1.addChild(upperSideButton4);
        lowerSideButton1.addChild(lowerSideButton4);
        lowerSideButton1.addChild(lowerSideButton6);
        lowerSideButton1.addChild(lowerSideButton14);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(lowerSideButton1.offsetX, lowerSideButton1.offsetY, lowerSideButton1.offsetZ);
        GL11.glTranslatef(
            lowerSideButton1.rotationPointX * f5,
            lowerSideButton1.rotationPointY * f5,
            lowerSideButton1.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-lowerSideButton1.offsetX, -lowerSideButton1.offsetY, -lowerSideButton1.offsetZ);
        GL11.glTranslatef(
            -lowerSideButton1.rotationPointX * f5,
            -lowerSideButton1.rotationPointY * f5,
            -lowerSideButton1.rotationPointZ * f5);
        lowerSideButton1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(upperSideButton1.offsetX, upperSideButton1.offsetY, upperSideButton1.offsetZ);
        GL11.glTranslatef(
            upperSideButton1.rotationPointX * f5,
            upperSideButton1.rotationPointY * f5,
            upperSideButton1.rotationPointZ * f5);
        GL11.glScaled(0.15D, 0.15D, 0.15D);
        GL11.glTranslatef(-upperSideButton1.offsetX, -upperSideButton1.offsetY, -upperSideButton1.offsetZ);
        GL11.glTranslatef(
            -upperSideButton1.rotationPointX * f5,
            -upperSideButton1.rotationPointY * f5,
            -upperSideButton1.rotationPointZ * f5);
        upperSideButton1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
