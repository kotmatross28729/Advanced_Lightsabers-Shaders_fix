package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelBodyRedeemer extends ModelBase {

    public ModelRenderer grip1;
    public ModelRenderer body1;
    public ModelRenderer bodyPart1_1;
    public ModelRenderer bodyPart2_1;
    public ModelRenderer bodyPart3_1;
    public ModelRenderer bodyPart4_1;
    public ModelRenderer bodyPart5_1;
    public ModelRenderer bodyPart6_1;
    public ModelRenderer grip2;
    public ModelRenderer grip3;
    public ModelRenderer grip4;
    public ModelRenderer grip5;
    public ModelRenderer grip6;
    public ModelRenderer grip7;
    public ModelRenderer grip8;
    public ModelRenderer grip9;
    public ModelRenderer grip10;
    public ModelRenderer grip11;
    public ModelRenderer grip12;
    public ModelRenderer grip13;
    public ModelRenderer grip14;
    public ModelRenderer grip15;
    public ModelRenderer grip16;
    public ModelRenderer grip17;
    public ModelRenderer grip18;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer bodyPart1_2;
    public ModelRenderer bodyPart1_3;
    public ModelRenderer bodyPart2_2;
    public ModelRenderer bodyPart2_3;
    public ModelRenderer bodyPart3_2;
    public ModelRenderer bodyPart3_3;
    public ModelRenderer bodyPart4_2;
    public ModelRenderer bodyPart4_3;
    public ModelRenderer bodyPart5_2;
    public ModelRenderer bodyPart5_3;
    public ModelRenderer bodyPart6_2;
    public ModelRenderer bodyPart6_3;

    public ModelBodyRedeemer() {
        textureWidth = 64;
        textureHeight = 32;
        grip4 = new ModelRenderer(this, 0, 0);
        grip4.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip4.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip4, 0.0F, 2.356194490192345F, 0.0F);
        body2 = new ModelRenderer(this, 8, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        body1 = new ModelRenderer(this, 8, 0);
        body1.setRotationPoint(0.0F, 6.3F, 0.0F);
        body1.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        bodyPart3_2 = new ModelRenderer(this, 4, 12);
        bodyPart3_2.setRotationPoint(0.0F, -1.18F, 3.94F);
        bodyPart3_2.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart3_2, 0.6981317007977318F, 0.0F, 0.0F);
        bodyPart1_3 = new ModelRenderer(this, 4, 12);
        bodyPart1_3.setRotationPoint(0.0F, 1.18F, 3.94F);
        bodyPart1_3.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart1_3, -0.6981317007977318F, 0.0F, 0.0F);
        body5 = new ModelRenderer(this, 8, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        grip1 = new ModelRenderer(this, 0, 0);
        grip1.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip1.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        bodyPart4_1 = new ModelRenderer(this, 4, 8);
        bodyPart4_1.setRotationPoint(0.0F, 9.8F, 0.0F);
        bodyPart4_1.addBox(-1.5F, -1.5F, 3.32F, 3, 3, 1, 0.0F);
        setRotateAngle(bodyPart4_1, 0.0F, 3.141592653589793F, 0.0F);
        body4 = new ModelRenderer(this, 8, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        grip9 = new ModelRenderer(this, 0, 8);
        grip9.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip9.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        bodyPart4_2 = new ModelRenderer(this, 4, 12);
        bodyPart4_2.setRotationPoint(0.0F, -1.18F, 3.94F);
        bodyPart4_2.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart4_2, 0.6981317007977318F, 0.0F, 0.0F);
        grip18 = new ModelRenderer(this, 0, 8);
        grip18.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip18.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip18, 0.0F, -0.6283185307179586F, 0.0F);
        bodyPart5_2 = new ModelRenderer(this, 4, 12);
        bodyPart5_2.setRotationPoint(0.0F, -1.18F, 3.94F);
        bodyPart5_2.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart5_2, 0.6981317007977318F, 0.0F, 0.0F);
        body7 = new ModelRenderer(this, 8, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        grip17 = new ModelRenderer(this, 0, 8);
        grip17.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip17.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip17, 0.0F, -1.2566370614359172F, 0.0F);
        bodyPart5_3 = new ModelRenderer(this, 4, 12);
        bodyPart5_3.setRotationPoint(0.0F, 1.18F, 3.94F);
        bodyPart5_3.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart5_3, -0.6981317007977318F, 0.0F, 0.0F);
        grip13 = new ModelRenderer(this, 0, 8);
        grip13.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip13.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip13, 0.0F, 2.5132741228718345F, 0.0F);
        bodyPart2_1 = new ModelRenderer(this, 4, 8);
        bodyPart2_1.setRotationPoint(0.0F, 9.8F, 0.0F);
        bodyPart2_1.addBox(-1.5F, -1.5F, 3.32F, 3, 3, 1, 0.0F);
        setRotateAngle(bodyPart2_1, 0.0F, 1.0471975511965976F, 0.0F);
        grip7 = new ModelRenderer(this, 0, 0);
        grip7.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip7.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip7, 0.0F, -1.5707963267948966F, 0.0F);
        grip3 = new ModelRenderer(this, 0, 0);
        grip3.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip3.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip3, 0.0F, 1.5707963267948966F, 0.0F);
        bodyPart6_2 = new ModelRenderer(this, 4, 12);
        bodyPart6_2.setRotationPoint(0.0F, -1.18F, 3.94F);
        bodyPart6_2.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart6_2, 0.6981317007977318F, 0.0F, 0.0F);
        bodyPart3_1 = new ModelRenderer(this, 4, 8);
        bodyPart3_1.setRotationPoint(0.0F, 9.8F, 0.0F);
        bodyPart3_1.addBox(-1.5F, -1.5F, 3.32F, 3, 3, 1, 0.0F);
        setRotateAngle(bodyPart3_1, 0.0F, 2.0943951023931953F, 0.0F);
        grip15 = new ModelRenderer(this, 0, 8);
        grip15.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip15.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip15, 0.0F, -2.5132741228718345F, 0.0F);
        grip10 = new ModelRenderer(this, 0, 8);
        grip10.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip10.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip10, 0.0F, 0.6283185307179586F, 0.0F);
        grip16 = new ModelRenderer(this, 0, 8);
        grip16.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip16.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip16, 0.0F, -1.8849555921538759F, 0.0F);
        bodyPart6_1 = new ModelRenderer(this, 4, 8);
        bodyPart6_1.setRotationPoint(0.0F, 9.8F, 0.0F);
        bodyPart6_1.addBox(-1.5F, -1.5F, 3.32F, 3, 3, 1, 0.0F);
        setRotateAngle(bodyPart6_1, 0.0F, -1.0471975511965976F, 0.0F);
        bodyPart3_3 = new ModelRenderer(this, 4, 12);
        bodyPart3_3.setRotationPoint(0.0F, 1.18F, 3.94F);
        bodyPart3_3.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart3_3, -0.6981317007977318F, 0.0F, 0.0F);
        grip2 = new ModelRenderer(this, 0, 0);
        grip2.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip2.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip2, 0.0F, 0.7853981633974483F, 0.0F);
        bodyPart2_3 = new ModelRenderer(this, 4, 12);
        bodyPart2_3.setRotationPoint(0.0F, 1.18F, 3.94F);
        bodyPart2_3.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart2_3, -0.6981317007977318F, 0.0F, 0.0F);
        grip8 = new ModelRenderer(this, 0, 0);
        grip8.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip8.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip8, 0.0F, -0.7853981633974483F, 0.0F);
        bodyPart6_3 = new ModelRenderer(this, 4, 12);
        bodyPart6_3.setRotationPoint(0.0F, 1.18F, 3.94F);
        bodyPart6_3.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart6_3, -0.6981317007977318F, 0.0F, 0.0F);
        body6 = new ModelRenderer(this, 8, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        bodyPart2_2 = new ModelRenderer(this, 4, 12);
        bodyPart2_2.setRotationPoint(0.0F, -1.18F, 3.94F);
        bodyPart2_2.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart2_2, 0.6981317007977318F, 0.0F, 0.0F);
        grip11 = new ModelRenderer(this, 0, 8);
        grip11.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip11.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip11, 0.0F, 1.2566370614359172F, 0.0F);
        body8 = new ModelRenderer(this, 8, 0);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        bodyPart5_1 = new ModelRenderer(this, 4, 8);
        bodyPart5_1.setRotationPoint(0.0F, 9.8F, 0.0F);
        bodyPart5_1.addBox(-1.5F, -1.5F, 3.32F, 3, 3, 1, 0.0F);
        setRotateAngle(bodyPart5_1, 0.0F, -2.0943951023931953F, 0.0F);
        bodyPart4_3 = new ModelRenderer(this, 4, 12);
        bodyPart4_3.setRotationPoint(0.0F, 1.18F, 3.94F);
        bodyPart4_3.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart4_3, -0.6981317007977318F, 0.0F, 0.0F);
        grip5 = new ModelRenderer(this, 0, 0);
        grip5.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip5.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip5, 0.0F, 3.141592653589793F, 0.0F);
        body3 = new ModelRenderer(this, 8, 0);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, 0.0F, 2.62F, 3, 6, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        bodyPart1_2 = new ModelRenderer(this, 4, 12);
        bodyPart1_2.setRotationPoint(0.0F, -1.18F, 3.94F);
        bodyPart1_2.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
        setRotateAngle(bodyPart1_2, 0.6981317007977318F, 0.0F, 0.0F);
        grip12 = new ModelRenderer(this, 0, 8);
        grip12.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip12.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip12, 0.0F, 1.8849555921538759F, 0.0F);
        grip14 = new ModelRenderer(this, 0, 8);
        grip14.setRotationPoint(0.0F, 3.5F, 0.0F);
        grip14.addBox(-0.5F, -3.5F, -4.02F, 1, 7, 1, 0.0F);
        setRotateAngle(grip14, 0.0F, 3.141592653589793F, 0.0F);
        bodyPart1_1 = new ModelRenderer(this, 4, 8);
        bodyPart1_1.setRotationPoint(0.0F, 9.8F, 0.0F);
        bodyPart1_1.addBox(-1.5F, -1.5F, 3.32F, 3, 3, 1, 0.0F);
        grip6 = new ModelRenderer(this, 0, 0);
        grip6.setRotationPoint(0.0F, 0.0F, 0.0F);
        grip6.addBox(-1.5F, 0.0F, 2.62F, 3, 7, 1, 0.0F);
        setRotateAngle(grip6, 0.0F, -2.356194490192345F, 0.0F);
        grip1.addChild(grip4);
        body1.addChild(body2);
        bodyPart3_1.addChild(bodyPart3_2);
        bodyPart1_1.addChild(bodyPart1_3);
        body1.addChild(body5);
        body1.addChild(body4);
        grip1.addChild(grip9);
        bodyPart4_1.addChild(bodyPart4_2);
        grip1.addChild(grip18);
        bodyPart5_1.addChild(bodyPart5_2);
        body1.addChild(body7);
        grip1.addChild(grip17);
        bodyPart5_1.addChild(bodyPart5_3);
        grip1.addChild(grip13);
        grip1.addChild(grip7);
        grip1.addChild(grip3);
        bodyPart6_1.addChild(bodyPart6_2);
        grip1.addChild(grip15);
        grip1.addChild(grip10);
        grip1.addChild(grip16);
        bodyPart3_1.addChild(bodyPart3_3);
        grip1.addChild(grip2);
        bodyPart2_1.addChild(bodyPart2_3);
        grip1.addChild(grip8);
        bodyPart6_1.addChild(bodyPart6_3);
        body1.addChild(body6);
        bodyPart2_1.addChild(bodyPart2_2);
        grip1.addChild(grip11);
        body1.addChild(body8);
        bodyPart4_1.addChild(bodyPart4_3);
        grip1.addChild(grip5);
        body1.addChild(body3);
        bodyPart1_1.addChild(bodyPart1_2);
        grip1.addChild(grip12);
        grip1.addChild(grip14);
        grip1.addChild(grip6);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(grip1.offsetX, grip1.offsetY, grip1.offsetZ);
        GL11.glTranslatef(grip1.rotationPointX * f5, grip1.rotationPointY * f5, grip1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-grip1.offsetX, -grip1.offsetY, -grip1.offsetZ);
        GL11.glTranslatef(-grip1.rotationPointX * f5, -grip1.rotationPointY * f5, -grip1.rotationPointZ * f5);
        grip1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bodyPart4_1.offsetX, bodyPart4_1.offsetY, bodyPart4_1.offsetZ);
        GL11.glTranslatef(
            bodyPart4_1.rotationPointX * f5,
            bodyPart4_1.rotationPointY * f5,
            bodyPart4_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-bodyPart4_1.offsetX, -bodyPart4_1.offsetY, -bodyPart4_1.offsetZ);
        GL11.glTranslatef(
            -bodyPart4_1.rotationPointX * f5,
            -bodyPart4_1.rotationPointY * f5,
            -bodyPart4_1.rotationPointZ * f5);
        bodyPart4_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bodyPart2_1.offsetX, bodyPart2_1.offsetY, bodyPart2_1.offsetZ);
        GL11.glTranslatef(
            bodyPart2_1.rotationPointX * f5,
            bodyPart2_1.rotationPointY * f5,
            bodyPart2_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-bodyPart2_1.offsetX, -bodyPart2_1.offsetY, -bodyPart2_1.offsetZ);
        GL11.glTranslatef(
            -bodyPart2_1.rotationPointX * f5,
            -bodyPart2_1.rotationPointY * f5,
            -bodyPart2_1.rotationPointZ * f5);
        bodyPart2_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bodyPart3_1.offsetX, bodyPart3_1.offsetY, bodyPart3_1.offsetZ);
        GL11.glTranslatef(
            bodyPart3_1.rotationPointX * f5,
            bodyPart3_1.rotationPointY * f5,
            bodyPart3_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-bodyPart3_1.offsetX, -bodyPart3_1.offsetY, -bodyPart3_1.offsetZ);
        GL11.glTranslatef(
            -bodyPart3_1.rotationPointX * f5,
            -bodyPart3_1.rotationPointY * f5,
            -bodyPart3_1.rotationPointZ * f5);
        bodyPart3_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bodyPart6_1.offsetX, bodyPart6_1.offsetY, bodyPart6_1.offsetZ);
        GL11.glTranslatef(
            bodyPart6_1.rotationPointX * f5,
            bodyPart6_1.rotationPointY * f5,
            bodyPart6_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-bodyPart6_1.offsetX, -bodyPart6_1.offsetY, -bodyPart6_1.offsetZ);
        GL11.glTranslatef(
            -bodyPart6_1.rotationPointX * f5,
            -bodyPart6_1.rotationPointY * f5,
            -bodyPart6_1.rotationPointZ * f5);
        bodyPart6_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bodyPart5_1.offsetX, bodyPart5_1.offsetY, bodyPart5_1.offsetZ);
        GL11.glTranslatef(
            bodyPart5_1.rotationPointX * f5,
            bodyPart5_1.rotationPointY * f5,
            bodyPart5_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-bodyPart5_1.offsetX, -bodyPart5_1.offsetY, -bodyPart5_1.offsetZ);
        GL11.glTranslatef(
            -bodyPart5_1.rotationPointX * f5,
            -bodyPart5_1.rotationPointY * f5,
            -bodyPart5_1.rotationPointZ * f5);
        bodyPart5_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(bodyPart1_1.offsetX, bodyPart1_1.offsetY, bodyPart1_1.offsetZ);
        GL11.glTranslatef(
            bodyPart1_1.rotationPointX * f5,
            bodyPart1_1.rotationPointY * f5,
            bodyPart1_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-bodyPart1_1.offsetX, -bodyPart1_1.offsetY, -bodyPart1_1.offsetZ);
        GL11.glTranslatef(
            -bodyPart1_1.rotationPointX * f5,
            -bodyPart1_1.rotationPointY * f5,
            -bodyPart1_1.rotationPointZ * f5);
        bodyPart1_1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
