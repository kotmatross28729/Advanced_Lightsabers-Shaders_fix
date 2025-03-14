package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelBodyMechanical extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer frontRing4;
    public ModelRenderer frontRing1;
    public ModelRenderer frontRing3;
    public ModelRenderer frontRing2;
    public ModelRenderer body2;
    public ModelRenderer body5;
    public ModelRenderer body8;
    public ModelRenderer body11;
    public ModelRenderer body14;
    public ModelRenderer body17;
    public ModelRenderer body20;
    public ModelRenderer body23;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body9;
    public ModelRenderer body10;
    public ModelRenderer body12;
    public ModelRenderer body13;
    public ModelRenderer body15;
    public ModelRenderer body16;
    public ModelRenderer body18;
    public ModelRenderer body19;
    public ModelRenderer body21;
    public ModelRenderer body22;
    public ModelRenderer body24;
    public ModelRenderer frontRing2_1;
    public ModelRenderer frontRing3_1;
    public ModelRenderer frontRing4_1;
    public ModelRenderer frontRing5;
    public ModelRenderer frontRing6;
    public ModelRenderer frontRing7;
    public ModelRenderer frontRing8;
    public ModelRenderer frontRing2_2;
    public ModelRenderer frontRing3_2;
    public ModelRenderer frontRing4_2;
    public ModelRenderer frontRing5_1;
    public ModelRenderer frontRing6_1;
    public ModelRenderer frontRing7_1;
    public ModelRenderer frontRing8_1;
    public ModelRenderer frontRing2_3;
    public ModelRenderer frontRing3_3;
    public ModelRenderer frontRing4_3;
    public ModelRenderer frontRing5_2;
    public ModelRenderer frontRing6_2;
    public ModelRenderer frontRing7_2;
    public ModelRenderer frontRing8_2;
    public ModelRenderer frontRing2_4;
    public ModelRenderer frontRing3_4;
    public ModelRenderer frontRing4_4;
    public ModelRenderer frontRing5_3;
    public ModelRenderer frontRing6_3;
    public ModelRenderer frontRing7_3;
    public ModelRenderer frontRing8_3;

    public ModelBodyMechanical() {
        textureWidth = 64;
        textureHeight = 32;
        body23 = new ModelRenderer(this, 8, 0);
        body23.setRotationPoint(0.0F, 8.3F, 2.6F);
        body23.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        frontRing3_2 = new ModelRenderer(this, 0, 17);
        frontRing3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing3_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing3_2, 0.0F, 1.5707963267948966F, 0.0F);
        body22 = new ModelRenderer(this, 14, 0);
        body22.setRotationPoint(0.0F, 0.0F, 0.6F);
        body22.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        frontRing4_2 = new ModelRenderer(this, 0, 17);
        frontRing4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing4_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing4_2, 0.0F, 2.356194490192345F, 0.0F);
        frontRing3 = new ModelRenderer(this, 0, 20);
        frontRing3.setRotationPoint(-3.4F, 13.0F, -3.4F);
        frontRing3.addBox(-1.5F, -2.0F, -0.4F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing3, 1.5707963267948966F, 0.7853981633974483F, 0.0F);
        frontRing6_1 = new ModelRenderer(this, 0, 17);
        frontRing6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing6_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing6_1, 0.0F, -2.356194490192345F, 0.0F);
        frontRing4_3 = new ModelRenderer(this, 0, 20);
        frontRing4_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing4_3.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing4_3, 0.0F, 2.356194490192345F, 0.0F);
        body6 = new ModelRenderer(this, 8, 0);
        body6.setRotationPoint(0.0F, 8.3F, 2.6F);
        body6.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        body14 = new ModelRenderer(this, 0, 0);
        body14.setRotationPoint(0.0F, 0.0F, 0.0F);
        body14.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body14, 0.0F, -2.356194490192345F, 0.0F);
        body12 = new ModelRenderer(this, 8, 0);
        body12.setRotationPoint(0.0F, 8.3F, 2.6F);
        body12.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        body21 = new ModelRenderer(this, 8, 0);
        body21.setRotationPoint(0.0F, 8.3F, 2.6F);
        body21.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        frontRing2_2 = new ModelRenderer(this, 0, 17);
        frontRing2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing2_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing2_2, 0.0F, 0.7853981633974483F, 0.0F);
        body24 = new ModelRenderer(this, 14, 0);
        body24.setRotationPoint(0.0F, 0.0F, 0.6F);
        body24.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        frontRing5_1 = new ModelRenderer(this, 0, 17);
        frontRing5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing5_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing5_1, 0.0F, 3.141592653589793F, 0.0F);
        frontRing7_1 = new ModelRenderer(this, 0, 17);
        frontRing7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing7_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing7_1, 0.0F, -1.5707963267948966F, 0.0F);
        frontRing6_3 = new ModelRenderer(this, 0, 17);
        frontRing6_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing6_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing6_3, 0.0F, -2.356194490192345F, 0.0F);
        body9 = new ModelRenderer(this, 8, 0);
        body9.setRotationPoint(0.0F, 8.3F, 2.6F);
        body9.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        frontRing6_2 = new ModelRenderer(this, 0, 20);
        frontRing6_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing6_2.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing6_2, 0.0F, -2.356194490192345F, 0.0F);
        body17 = new ModelRenderer(this, 0, 0);
        body17.setRotationPoint(0.0F, 0.0F, 0.0F);
        body17.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body17, 0.0F, -1.5707963267948966F, 0.0F);
        frontRing5 = new ModelRenderer(this, 0, 26);
        frontRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing5, 0.0F, 3.141592653589793F, 0.0F);
        frontRing8_1 = new ModelRenderer(this, 0, 17);
        frontRing8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing8_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing8_1, 0.0F, -0.7853981633974483F, 0.0F);
        frontRing2 = new ModelRenderer(this, 0, 17);
        frontRing2.setRotationPoint(-3.0F, 13.0F, -3.0F);
        frontRing2.addBox(-1.5F, -2.0F, 2.6F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing2, 1.5707963267948966F, 0.7853981633974483F, 0.0F);
        frontRing7_3 = new ModelRenderer(this, 0, 17);
        frontRing7_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing7_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing7_3, 0.0F, -1.5707963267948966F, 0.0F);
        frontRing8_2 = new ModelRenderer(this, 0, 20);
        frontRing8_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing8_2.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing8_2, 0.0F, -0.7853981633974483F, 0.0F);
        frontRing5_2 = new ModelRenderer(this, 0, 20);
        frontRing5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing5_2.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing5_2, 0.0F, 3.141592653589793F, 0.0F);
        frontRing3_4 = new ModelRenderer(this, 0, 17);
        frontRing3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing3_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing3_4, 0.0F, 1.5707963267948966F, 0.0F);
        body11 = new ModelRenderer(this, 0, 0);
        body11.setRotationPoint(0.0F, 0.0F, 0.0F);
        body11.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body11, 0.0F, 3.141592653589793F, 0.0F);
        body8 = new ModelRenderer(this, 0, 0);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body8, 0.0F, 2.356194490192345F, 0.0F);
        body13 = new ModelRenderer(this, 14, 0);
        body13.setRotationPoint(0.0F, 0.0F, 0.6F);
        body13.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        body15 = new ModelRenderer(this, 8, 0);
        body15.setRotationPoint(0.0F, 8.3F, 2.6F);
        body15.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        body19 = new ModelRenderer(this, 14, 0);
        body19.setRotationPoint(0.0F, 0.0F, 0.6F);
        body19.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        frontRing2_4 = new ModelRenderer(this, 0, 17);
        frontRing2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing2_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing2_4, 0.0F, 0.7853981633974483F, 0.0F);
        body3 = new ModelRenderer(this, 8, 0);
        body3.setRotationPoint(0.0F, 8.3F, 2.6F);
        body3.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        frontRing8 = new ModelRenderer(this, 0, 26);
        frontRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing8, 0.0F, -0.7853981633974483F, 0.0F);
        body10 = new ModelRenderer(this, 14, 0);
        body10.setRotationPoint(0.0F, 0.0F, 0.6F);
        body10.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        frontRing2_3 = new ModelRenderer(this, 0, 20);
        frontRing2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing2_3.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing2_3, 0.0F, 0.7853981633974483F, 0.0F);
        frontRing5_3 = new ModelRenderer(this, 0, 17);
        frontRing5_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing5_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing5_3, 0.0F, 3.141592653589793F, 0.0F);
        body20 = new ModelRenderer(this, 0, 0);
        body20.setRotationPoint(0.0F, 0.0F, 0.0F);
        body20.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body20, 0.0F, -0.7853981633974483F, 0.0F);
        frontRing8_3 = new ModelRenderer(this, 0, 17);
        frontRing8_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing8_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing8_3, 0.0F, -0.7853981633974483F, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        setRotateAngle(body5, 0.0F, 1.5707963267948966F, 0.0F);
        frontRing4_1 = new ModelRenderer(this, 0, 26);
        frontRing4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing4_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing4_1, 0.0F, 2.356194490192345F, 0.0F);
        frontRing3_1 = new ModelRenderer(this, 0, 26);
        frontRing3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing3_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing3_1, 0.0F, 1.5707963267948966F, 0.0F);
        frontRing7_2 = new ModelRenderer(this, 0, 20);
        frontRing7_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing7_2.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing7_2, 0.0F, -1.5707963267948966F, 0.0F);
        frontRing7 = new ModelRenderer(this, 0, 26);
        frontRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing7, 0.0F, -1.5707963267948966F, 0.0F);
        frontRing4 = new ModelRenderer(this, 0, 26);
        frontRing4.setRotationPoint(-3.7F, 13.0F, -3.7F);
        frontRing4.addBox(-1.5F, -2.0F, 2.6F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing4, 1.5707963267948966F, 0.7853981633974483F, 0.0F);
        frontRing2_1 = new ModelRenderer(this, 0, 26);
        frontRing2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing2_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing2_1, 0.0F, 0.7853981633974483F, 0.0F);
        frontRing1 = new ModelRenderer(this, 0, 17);
        frontRing1.setRotationPoint(-2.5F, 13.0F, -2.5F);
        frontRing1.addBox(-1.5F, -2.0F, 2.6F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing1, 1.5707963267948966F, 0.7853981633974483F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, 0.0F, 2.62F, 3, 16, 1, 0.0F);
        body18 = new ModelRenderer(this, 8, 0);
        body18.setRotationPoint(0.0F, 8.3F, 2.6F);
        body18.addBox(-1.0F, -7.5F, 0.5F, 2, 15, 1, 0.0F);
        body16 = new ModelRenderer(this, 14, 0);
        body16.setRotationPoint(0.0F, 0.0F, 0.6F);
        body16.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        frontRing4_4 = new ModelRenderer(this, 0, 17);
        frontRing4_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing4_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing4_4, 0.0F, 2.356194490192345F, 0.0F);
        body4 = new ModelRenderer(this, 14, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.6F);
        body4.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        body7 = new ModelRenderer(this, 14, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.6F);
        body7.addBox(-0.5F, -7.5F, 0.5F, 1, 15, 1, 0.0F);
        frontRing3_3 = new ModelRenderer(this, 0, 20);
        frontRing3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing3_3.addBox(-1.5F, -2.0F, -0.38F, 3, 2, 4, 0.0F);
        setRotateAngle(frontRing3_3, 0.0F, 1.5707963267948966F, 0.0F);
        frontRing6 = new ModelRenderer(this, 0, 26);
        frontRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontRing6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(frontRing6, 0.0F, -2.356194490192345F, 0.0F);
        body1.addChild(body23);
        body1.addChild(body2);
        frontRing1.addChild(frontRing3_2);
        body21.addChild(body22);
        frontRing1.addChild(frontRing4_2);
        frontRing1.addChild(frontRing6_1);
        frontRing3.addChild(frontRing4_3);
        body5.addChild(body6);
        body1.addChild(body14);
        body11.addChild(body12);
        body20.addChild(body21);
        frontRing1.addChild(frontRing2_2);
        body23.addChild(body24);
        frontRing1.addChild(frontRing5_1);
        frontRing1.addChild(frontRing7_1);
        frontRing2.addChild(frontRing6_3);
        body8.addChild(body9);
        frontRing3.addChild(frontRing6_2);
        body1.addChild(body17);
        frontRing4.addChild(frontRing5);
        frontRing1.addChild(frontRing8_1);
        frontRing2.addChild(frontRing7_3);
        frontRing3.addChild(frontRing8_2);
        frontRing3.addChild(frontRing5_2);
        frontRing2.addChild(frontRing3_4);
        body1.addChild(body11);
        body1.addChild(body8);
        body12.addChild(body13);
        body14.addChild(body15);
        body18.addChild(body19);
        frontRing2.addChild(frontRing2_4);
        body2.addChild(body3);
        frontRing4.addChild(frontRing8);
        body9.addChild(body10);
        frontRing3.addChild(frontRing2_3);
        frontRing2.addChild(frontRing5_3);
        body1.addChild(body20);
        frontRing2.addChild(frontRing8_3);
        body1.addChild(body5);
        frontRing4.addChild(frontRing4_1);
        frontRing4.addChild(frontRing3_1);
        frontRing3.addChild(frontRing7_2);
        frontRing4.addChild(frontRing7);
        frontRing4.addChild(frontRing2_1);
        body17.addChild(body18);
        body15.addChild(body16);
        frontRing2.addChild(frontRing4_4);
        body3.addChild(body4);
        body6.addChild(body7);
        frontRing3.addChild(frontRing3_3);
        frontRing4.addChild(frontRing6);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(frontRing3.offsetX, frontRing3.offsetY, frontRing3.offsetZ);
        GL11.glTranslatef(
            frontRing3.rotationPointX * f5,
            frontRing3.rotationPointY * f5,
            frontRing3.rotationPointZ * f5);
        GL11.glScaled(0.4D, 0.4D, 0.4D);
        GL11.glTranslatef(-frontRing3.offsetX, -frontRing3.offsetY, -frontRing3.offsetZ);
        GL11.glTranslatef(
            -frontRing3.rotationPointX * f5,
            -frontRing3.rotationPointY * f5,
            -frontRing3.rotationPointZ * f5);
        frontRing3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(frontRing2.offsetX, frontRing2.offsetY, frontRing2.offsetZ);
        GL11.glTranslatef(
            frontRing2.rotationPointX * f5,
            frontRing2.rotationPointY * f5,
            frontRing2.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-frontRing2.offsetX, -frontRing2.offsetY, -frontRing2.offsetZ);
        GL11.glTranslatef(
            -frontRing2.rotationPointX * f5,
            -frontRing2.rotationPointY * f5,
            -frontRing2.rotationPointZ * f5);
        frontRing2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(frontRing4.offsetX, frontRing4.offsetY, frontRing4.offsetZ);
        GL11.glTranslatef(
            frontRing4.rotationPointX * f5,
            frontRing4.rotationPointY * f5,
            frontRing4.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-frontRing4.offsetX, -frontRing4.offsetY, -frontRing4.offsetZ);
        GL11.glTranslatef(
            -frontRing4.rotationPointX * f5,
            -frontRing4.rotationPointY * f5,
            -frontRing4.rotationPointZ * f5);
        frontRing4.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(frontRing1.offsetX, frontRing1.offsetY, frontRing1.offsetZ);
        GL11.glTranslatef(
            frontRing1.rotationPointX * f5,
            frontRing1.rotationPointY * f5,
            frontRing1.rotationPointZ * f5);
        GL11.glScaled(0.4D, 0.4D, 0.4D);
        GL11.glTranslatef(-frontRing1.offsetX, -frontRing1.offsetY, -frontRing1.offsetZ);
        GL11.glTranslatef(
            -frontRing1.rotationPointX * f5,
            -frontRing1.rotationPointY * f5,
            -frontRing1.rotationPointZ * f5);
        frontRing1.render(f5);
        GL11.glPopMatrix();
        body1.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
