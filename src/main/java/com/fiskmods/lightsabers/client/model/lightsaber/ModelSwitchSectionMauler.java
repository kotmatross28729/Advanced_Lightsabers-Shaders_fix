package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionMauler extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer bottomConnector1;
    public ModelRenderer topConnector1;
    public ModelRenderer button1_1;
    public ModelRenderer button2_1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer bottomConnector2;
    public ModelRenderer bottomConnector3;
    public ModelRenderer bottomConnector4;
    public ModelRenderer bottomConnector5;
    public ModelRenderer bottomConnector6;
    public ModelRenderer bottomConnector7;
    public ModelRenderer bottomConnector8;
    public ModelRenderer topConnector2;
    public ModelRenderer topConnector3;
    public ModelRenderer topConnector4;
    public ModelRenderer topConnector5;
    public ModelRenderer topConnector6;
    public ModelRenderer topConnector7;
    public ModelRenderer topConnector8;
    public ModelRenderer button1_2;
    public ModelRenderer button1_3;
    public ModelRenderer button1_4;
    public ModelRenderer button1_5;
    public ModelRenderer button1_6;
    public ModelRenderer button1_7;
    public ModelRenderer button1_8;
    public ModelRenderer button2_2;
    public ModelRenderer button2_3;
    public ModelRenderer button2_4;
    public ModelRenderer button2_5;
    public ModelRenderer button2_6;
    public ModelRenderer button2_7;
    public ModelRenderer button2_8;

    public ModelSwitchSectionMauler() {
        textureWidth = 64;
        textureHeight = 32;
        button1_5 = new ModelRenderer(this, 8, 0);
        button1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_5, 0.0F, 3.141592653589793F, 0.0F);
        button2_5 = new ModelRenderer(this, 8, 7);
        button2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_5, 0.0F, 3.141592653589793F, 0.0F);
        body5 = new ModelRenderer(this, 0, 3);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        bottomConnector8 = new ModelRenderer(this, 0, 0);
        bottomConnector8.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector8.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector8, 0.0F, -0.7853981633974483F, 0.0F);
        button2_8 = new ModelRenderer(this, 8, 7);
        button2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_8, 0.0F, -0.7853981633974483F, 0.0F);
        button1_8 = new ModelRenderer(this, 8, 0);
        button1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_8, 0.0F, -0.7853981633974483F, 0.0F);
        button2_2 = new ModelRenderer(this, 8, 7);
        button2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_2, 0.0F, 0.7853981633974483F, 0.0F);
        button1_3 = new ModelRenderer(this, 8, 0);
        button1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_3, 0.0F, 1.5707963267948966F, 0.0F);
        button1_7 = new ModelRenderer(this, 8, 0);
        button1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_7, 0.0F, -1.5707963267948966F, 0.0F);
        button2_1 = new ModelRenderer(this, 8, 7);
        button2_1.setRotationPoint(0.0F, -5.0F, -3.62F);
        button2_1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_1, 1.5707963267948966F, 0.0F, 0.0F);
        topConnector3 = new ModelRenderer(this, 0, 0);
        topConnector3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector3, 0.0F, 1.5707963267948966F, 0.0F);
        button2_4 = new ModelRenderer(this, 8, 7);
        button2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_4, 0.0F, 2.356194490192345F, 0.0F);
        topConnector8 = new ModelRenderer(this, 0, 0);
        topConnector8.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector8, 0.0F, -0.7853981633974483F, 0.0F);
        body7 = new ModelRenderer(this, 0, 3);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        body3 = new ModelRenderer(this, 0, 3);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        body1 = new ModelRenderer(this, 0, 3);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        bottomConnector7 = new ModelRenderer(this, 0, 0);
        bottomConnector7.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector7.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector7, 0.0F, -1.5707963267948966F, 0.0F);
        bottomConnector3 = new ModelRenderer(this, 0, 0);
        bottomConnector3.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector3.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector3, 0.0F, 1.5707963267948966F, 0.0F);
        button2_6 = new ModelRenderer(this, 8, 7);
        button2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_6, 0.0F, -2.356194490192345F, 0.0F);
        topConnector2 = new ModelRenderer(this, 0, 0);
        topConnector2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector2, 0.0F, 0.7853981633974483F, 0.0F);
        bottomConnector5 = new ModelRenderer(this, 0, 0);
        bottomConnector5.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector5.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector5, 0.0F, 3.141592653589793F, 0.0F);
        body4 = new ModelRenderer(this, 0, 3);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        topConnector4 = new ModelRenderer(this, 0, 0);
        topConnector4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector4, 0.0F, 2.356194490192345F, 0.0F);
        bottomConnector2 = new ModelRenderer(this, 0, 0);
        bottomConnector2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector2.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector2, 0.0F, 0.7853981633974483F, 0.0F);
        bottomConnector4 = new ModelRenderer(this, 0, 0);
        bottomConnector4.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector4.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector4, 0.0F, 2.356194490192345F, 0.0F);
        button2_3 = new ModelRenderer(this, 8, 7);
        button2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_3, 0.0F, 1.5707963267948966F, 0.0F);
        topConnector7 = new ModelRenderer(this, 0, 0);
        topConnector7.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector7, 0.0F, -1.5707963267948966F, 0.0F);
        body2 = new ModelRenderer(this, 0, 3);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        topConnector6 = new ModelRenderer(this, 0, 0);
        topConnector6.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector6, 0.0F, -2.356194490192345F, 0.0F);
        button1_4 = new ModelRenderer(this, 8, 0);
        button1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_4, 0.0F, 2.356194490192345F, 0.0F);
        topConnector5 = new ModelRenderer(this, 0, 0);
        topConnector5.setRotationPoint(0.0F, 0.0F, 0.0F);
        topConnector5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topConnector5, 0.0F, 3.141592653589793F, 0.0F);
        button2_7 = new ModelRenderer(this, 8, 7);
        button2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button2_7, 0.0F, -1.5707963267948966F, 0.0F);
        button1_2 = new ModelRenderer(this, 8, 0);
        button1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_2, 0.0F, 0.7853981633974483F, 0.0F);
        button1_1 = new ModelRenderer(this, 8, 0);
        button1_1.setRotationPoint(0.0F, -9.5F, -3.62F);
        button1_1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_1, 1.5707963267948966F, 0.0F, 0.0F);
        body8 = new ModelRenderer(this, 0, 3);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        topConnector1 = new ModelRenderer(this, 0, 0);
        topConnector1.setRotationPoint(0.0F, -12.0F, 0.0F);
        topConnector1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        body6 = new ModelRenderer(this, 0, 3);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        bottomConnector6 = new ModelRenderer(this, 0, 0);
        bottomConnector6.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector6.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(bottomConnector6, 0.0F, -2.356194490192345F, 0.0F);
        bottomConnector1 = new ModelRenderer(this, 0, 0);
        bottomConnector1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bottomConnector1.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        button1_6 = new ModelRenderer(this, 8, 0);
        button1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        button1_6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(button1_6, 0.0F, -2.356194490192345F, 0.0F);
        button1_1.addChild(button1_5);
        button2_1.addChild(button2_5);
        body1.addChild(body5);
        bottomConnector1.addChild(bottomConnector8);
        button2_1.addChild(button2_8);
        button1_1.addChild(button1_8);
        button2_1.addChild(button2_2);
        button1_1.addChild(button1_3);
        button1_1.addChild(button1_7);
        topConnector1.addChild(topConnector3);
        button2_1.addChild(button2_4);
        topConnector1.addChild(topConnector8);
        body1.addChild(body7);
        body1.addChild(body3);
        bottomConnector1.addChild(bottomConnector7);
        bottomConnector1.addChild(bottomConnector3);
        button2_1.addChild(button2_6);
        topConnector1.addChild(topConnector2);
        bottomConnector1.addChild(bottomConnector5);
        body1.addChild(body4);
        topConnector1.addChild(topConnector4);
        bottomConnector1.addChild(bottomConnector2);
        bottomConnector1.addChild(bottomConnector4);
        button2_1.addChild(button2_3);
        topConnector1.addChild(topConnector7);
        body1.addChild(body2);
        topConnector1.addChild(topConnector6);
        button1_1.addChild(button1_4);
        topConnector1.addChild(topConnector5);
        button2_1.addChild(button2_7);
        button1_1.addChild(button1_2);
        body1.addChild(body8);
        body1.addChild(body6);
        bottomConnector1.addChild(bottomConnector6);
        button1_1.addChild(button1_6);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bottomConnector1.isHidden = true;
        topConnector1.isHidden = true;

        GL11.glPushMatrix();
        GL11.glTranslatef(button2_1.offsetX, button2_1.offsetY, button2_1.offsetZ);
        GL11.glTranslatef(button2_1.rotationPointX * f5, button2_1.rotationPointY * f5, button2_1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-button2_1.offsetX, -button2_1.offsetY, -button2_1.offsetZ);
        GL11.glTranslatef(
            -button2_1.rotationPointX * f5,
            -button2_1.rotationPointY * f5,
            -button2_1.rotationPointZ * f5);
        button2_1.render(f5);
        GL11.glPopMatrix();
        body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(button1_1.offsetX, button1_1.offsetY, button1_1.offsetZ);
        GL11.glTranslatef(button1_1.rotationPointX * f5, button1_1.rotationPointY * f5, button1_1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-button1_1.offsetX, -button1_1.offsetY, -button1_1.offsetZ);
        GL11.glTranslatef(
            -button1_1.rotationPointX * f5,
            -button1_1.rotationPointY * f5,
            -button1_1.rotationPointZ * f5);
        button1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topConnector1.offsetX, topConnector1.offsetY, topConnector1.offsetZ);
        GL11.glTranslatef(
            topConnector1.rotationPointX * f5,
            topConnector1.rotationPointY * f5,
            topConnector1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-topConnector1.offsetX, -topConnector1.offsetY, -topConnector1.offsetZ);
        GL11.glTranslatef(
            -topConnector1.rotationPointX * f5,
            -topConnector1.rotationPointY * f5,
            -topConnector1.rotationPointZ * f5);
        topConnector1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bottomConnector1.offsetX, bottomConnector1.offsetY, bottomConnector1.offsetZ);
        GL11.glTranslatef(
            bottomConnector1.rotationPointX * f5,
            bottomConnector1.rotationPointY * f5,
            bottomConnector1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-bottomConnector1.offsetX, -bottomConnector1.offsetY, -bottomConnector1.offsetZ);
        GL11.glTranslatef(
            -bottomConnector1.rotationPointX * f5,
            -bottomConnector1.rotationPointY * f5,
            -bottomConnector1.rotationPointZ * f5);
        bottomConnector1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
