package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelEmitterImperial extends ModelBase {

    public ModelRenderer upperRing1;
    public ModelRenderer innerRing1;
    public ModelRenderer emitterRing1;
    public ModelRenderer topRing1;
    public ModelRenderer topRing1_1;
    public ModelRenderer upperRing2;
    public ModelRenderer upperRing3;
    public ModelRenderer upperRing4;
    public ModelRenderer upperRing5;
    public ModelRenderer upperRing6;
    public ModelRenderer upperRing7;
    public ModelRenderer upperRing8;
    public ModelRenderer innerRing2;
    public ModelRenderer innerRing3;
    public ModelRenderer innerRing4;
    public ModelRenderer innerRing5;
    public ModelRenderer innerRing6;
    public ModelRenderer innerRing7;
    public ModelRenderer innerRing8;
    public ModelRenderer innerRing9;
    public ModelRenderer emitterRing2;
    public ModelRenderer emitterRing3;
    public ModelRenderer emitterRing4;
    public ModelRenderer emitterRing5;
    public ModelRenderer emitterRing6;
    public ModelRenderer emitterRing7;
    public ModelRenderer emitterRing8;
    public ModelRenderer topRing2;
    public ModelRenderer topRing3;
    public ModelRenderer topRing4;
    public ModelRenderer topRing5;
    public ModelRenderer topRing6;
    public ModelRenderer topRing7;
    public ModelRenderer topRing8;
    public ModelRenderer topRing2_1;
    public ModelRenderer topRing3_1;
    public ModelRenderer topRing4_1;
    public ModelRenderer topRing5_1;
    public ModelRenderer topRing6_1;
    public ModelRenderer topRing7_1;
    public ModelRenderer topRing8_1;

    public ModelEmitterImperial() {
        textureWidth = 16;
        textureHeight = 16;
        upperRing6 = new ModelRenderer(this, 0, 0);
        upperRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing6.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing6, 0.0F, -2.356194490192345F, 0.0F);
        emitterRing3 = new ModelRenderer(this, 2, 4);
        emitterRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing3, 0.0F, 1.5707963267948966F, 0.0F);
        emitterRing4 = new ModelRenderer(this, 2, 4);
        emitterRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing4, 0.0F, 2.356194490192345F, 0.0F);
        topRing1 = new ModelRenderer(this, 0, 8);
        topRing1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        innerRing8 = new ModelRenderer(this, 8, 0);
        innerRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing8.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing8, 0.5585053606381855F, -1.5707963267948966F, 0.0F);
        innerRing2 = new ModelRenderer(this, 8, 0);
        innerRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing2.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing2, 0.5585053606381855F, 0.0F, 0.0F);
        topRing1_1 = new ModelRenderer(this, 0, 4);
        topRing1_1.setRotationPoint(0.0F, -3.6F, 0.0F);
        topRing1_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        innerRing9 = new ModelRenderer(this, 8, 0);
        innerRing9.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing9.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing9, 0.5585053606381855F, -0.7853981633974483F, 0.0F);
        emitterRing7 = new ModelRenderer(this, 2, 4);
        emitterRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing7, 0.0F, -1.5707963267948966F, 0.0F);
        topRing5_1 = new ModelRenderer(this, 0, 4);
        topRing5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing5_1, 0.0F, 3.141592653589793F, 0.0F);
        upperRing5 = new ModelRenderer(this, 0, 0);
        upperRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing5.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing5, 0.0F, 3.141592653589793F, 0.0F);
        topRing2 = new ModelRenderer(this, 0, 8);
        topRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing2, 0.0F, 0.7853981633974483F, 0.0F);
        upperRing4 = new ModelRenderer(this, 0, 0);
        upperRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing4.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing4, 0.0F, 2.356194490192345F, 0.0F);
        topRing3 = new ModelRenderer(this, 0, 8);
        topRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing3, 0.0F, 1.5707963267948966F, 0.0F);
        upperRing2 = new ModelRenderer(this, 0, 0);
        upperRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing2.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing2, 0.0F, 0.7853981633974483F, 0.0F);
        emitterRing6 = new ModelRenderer(this, 2, 4);
        emitterRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing6, 0.0F, -2.356194490192345F, 0.0F);
        innerRing6 = new ModelRenderer(this, 8, 0);
        innerRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing6.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing6, 0.5585053606381855F, 3.141592653589793F, 0.0F);
        topRing6 = new ModelRenderer(this, 0, 8);
        topRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing6, 0.0F, -2.356194490192345F, 0.0F);
        topRing7 = new ModelRenderer(this, 0, 8);
        topRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing7, 0.0F, -1.5707963267948966F, 0.0F);
        topRing6_1 = new ModelRenderer(this, 0, 4);
        topRing6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing6_1, 0.0F, -2.356194490192345F, 0.0F);
        innerRing7 = new ModelRenderer(this, 8, 0);
        innerRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing7.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing7, 0.5585053606381855F, -2.356194490192345F, 0.0F);
        emitterRing5 = new ModelRenderer(this, 2, 4);
        emitterRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing5, 0.0F, 3.141592653589793F, 0.0F);
        topRing4_1 = new ModelRenderer(this, 0, 4);
        topRing4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing4_1, 0.0F, 2.356194490192345F, 0.0F);
        topRing8 = new ModelRenderer(this, 0, 8);
        topRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing4 = new ModelRenderer(this, 0, 8);
        topRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing4, 0.0F, 2.356194490192345F, 0.0F);
        emitterRing1 = new ModelRenderer(this, 2, 4);
        emitterRing1.setRotationPoint(0.0F, -4.0F, 0.0F);
        emitterRing1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        upperRing3 = new ModelRenderer(this, 0, 0);
        upperRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing3.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing3, 0.0F, 1.5707963267948966F, 0.0F);
        upperRing1 = new ModelRenderer(this, 0, 0);
        upperRing1.setRotationPoint(0.0F, -2.56F, 0.0F);
        upperRing1.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        innerRing4 = new ModelRenderer(this, 8, 0);
        innerRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing4.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing4, 0.5585053606381855F, 1.5707963267948966F, 0.0F);
        topRing7_1 = new ModelRenderer(this, 0, 4);
        topRing7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing7_1, 0.0F, -1.5707963267948966F, 0.0F);
        innerRing1 = new ModelRenderer(this, 0, 0);
        innerRing1.setRotationPoint(0.0F, 1.66F, 0.0F);
        innerRing1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        emitterRing2 = new ModelRenderer(this, 2, 4);
        emitterRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing2, 0.0F, 0.7853981633974483F, 0.0F);
        emitterRing8 = new ModelRenderer(this, 2, 4);
        emitterRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing8_1 = new ModelRenderer(this, 0, 4);
        topRing8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing8_1, 0.0F, -0.7853981633974483F, 0.0F);
        upperRing8 = new ModelRenderer(this, 0, 0);
        upperRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing8.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing5 = new ModelRenderer(this, 0, 8);
        topRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing5, 0.0F, 3.141592653589793F, 0.0F);
        innerRing5 = new ModelRenderer(this, 8, 0);
        innerRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing5.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing5, 0.5585053606381855F, 2.356194490192345F, 0.0F);
        topRing2_1 = new ModelRenderer(this, 0, 4);
        topRing2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing2_1, 0.0F, 0.7853981633974483F, 0.0F);
        innerRing3 = new ModelRenderer(this, 8, 0);
        innerRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing3.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing3, 0.5585053606381855F, 0.7853981633974483F, 0.0F);
        upperRing7 = new ModelRenderer(this, 0, 0);
        upperRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing7.addBox(-1.5F, -2.0F, 2.64F, 3, 2, 1, 0.0F);
        setRotateAngle(upperRing7, 0.0F, -1.5707963267948966F, 0.0F);
        topRing3_1 = new ModelRenderer(this, 0, 4);
        topRing3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_1.addBox(-1.5F, -1.0F, 0.62F, 3, 1, 3, 0.0F);
        setRotateAngle(topRing3_1, 0.0F, 1.5707963267948966F, 0.0F);
        upperRing1.addChild(upperRing6);
        emitterRing1.addChild(emitterRing3);
        emitterRing1.addChild(emitterRing4);
        innerRing1.addChild(innerRing8);
        innerRing1.addChild(innerRing2);
        innerRing1.addChild(innerRing9);
        emitterRing1.addChild(emitterRing7);
        topRing1_1.addChild(topRing5_1);
        upperRing1.addChild(upperRing5);
        topRing1.addChild(topRing2);
        upperRing1.addChild(upperRing4);
        topRing1.addChild(topRing3);
        upperRing1.addChild(upperRing2);
        emitterRing1.addChild(emitterRing6);
        innerRing1.addChild(innerRing6);
        topRing1.addChild(topRing6);
        topRing1.addChild(topRing7);
        topRing1_1.addChild(topRing6_1);
        innerRing1.addChild(innerRing7);
        emitterRing1.addChild(emitterRing5);
        topRing1_1.addChild(topRing4_1);
        topRing1.addChild(topRing8);
        topRing1.addChild(topRing4);
        upperRing1.addChild(upperRing3);
        innerRing1.addChild(innerRing4);
        topRing1_1.addChild(topRing7_1);
        emitterRing1.addChild(emitterRing2);
        emitterRing1.addChild(emitterRing8);
        topRing1_1.addChild(topRing8_1);
        upperRing1.addChild(upperRing8);
        topRing1.addChild(topRing5);
        innerRing1.addChild(innerRing5);
        topRing1_1.addChild(topRing2_1);
        innerRing1.addChild(innerRing3);
        upperRing1.addChild(upperRing7);
        topRing1_1.addChild(topRing3_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing1.offsetX, topRing1.offsetY, topRing1.offsetZ);
        GL11.glTranslatef(topRing1.rotationPointX * f5, topRing1.rotationPointY * f5, topRing1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.6D, 0.9D);
        GL11.glTranslatef(-topRing1.offsetX, -topRing1.offsetY, -topRing1.offsetZ);
        GL11.glTranslatef(-topRing1.rotationPointX * f5, -topRing1.rotationPointY * f5, -topRing1.rotationPointZ * f5);
        topRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing1_1.offsetX, topRing1_1.offsetY, topRing1_1.offsetZ);
        GL11.glTranslatef(
            topRing1_1.rotationPointX * f5,
            topRing1_1.rotationPointY * f5,
            topRing1_1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-topRing1_1.offsetX, -topRing1_1.offsetY, -topRing1_1.offsetZ);
        GL11.glTranslatef(
            -topRing1_1.rotationPointX * f5,
            -topRing1_1.rotationPointY * f5,
            -topRing1_1.rotationPointZ * f5);
        topRing1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(emitterRing1.offsetX, emitterRing1.offsetY, emitterRing1.offsetZ);
        GL11.glTranslatef(
            emitterRing1.rotationPointX * f5,
            emitterRing1.rotationPointY * f5,
            emitterRing1.rotationPointZ * f5);
        GL11.glScaled(-0.45D, 0.65D, -0.45D);
        GL11.glTranslatef(-emitterRing1.offsetX, -emitterRing1.offsetY, -emitterRing1.offsetZ);
        GL11.glTranslatef(
            -emitterRing1.rotationPointX * f5,
            -emitterRing1.rotationPointY * f5,
            -emitterRing1.rotationPointZ * f5);
        emitterRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(upperRing1.offsetX, upperRing1.offsetY, upperRing1.offsetZ);
        GL11.glTranslatef(
            upperRing1.rotationPointX * f5,
            upperRing1.rotationPointY * f5,
            upperRing1.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.8D, 0.5D);
        GL11.glTranslatef(-upperRing1.offsetX, -upperRing1.offsetY, -upperRing1.offsetZ);
        GL11.glTranslatef(
            -upperRing1.rotationPointX * f5,
            -upperRing1.rotationPointY * f5,
            -upperRing1.rotationPointZ * f5);
        upperRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(innerRing1.offsetX, innerRing1.offsetY, innerRing1.offsetZ);
        GL11.glTranslatef(
            innerRing1.rotationPointX * f5,
            innerRing1.rotationPointY * f5,
            innerRing1.rotationPointZ * f5);
        GL11.glScaled(0.81D, 0.9D, 0.81D);
        GL11.glTranslatef(-innerRing1.offsetX, -innerRing1.offsetY, -innerRing1.offsetZ);
        GL11.glTranslatef(
            -innerRing1.rotationPointX * f5,
            -innerRing1.rotationPointY * f5,
            -innerRing1.rotationPointZ * f5);
        innerRing1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
