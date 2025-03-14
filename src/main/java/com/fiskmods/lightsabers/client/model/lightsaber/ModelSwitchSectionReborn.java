package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionReborn extends ModelBase {

    public ModelRenderer ring1;
    public ModelRenderer sideBlade1point1;
    public ModelRenderer sideBlade1point2;
    public ModelRenderer sideBlade1point3;
    public ModelRenderer sideRing1;
    public ModelRenderer button1Point1;
    public ModelRenderer button1Point2;
    public ModelRenderer sideRing2;
    public ModelRenderer topRing9;
    public ModelRenderer topRing10;
    public ModelRenderer topRing11;
    public ModelRenderer topRing12;
    public ModelRenderer topRing12_1;
    public ModelRenderer sideRing2_1;
    public ModelRenderer sideRing2_2;
    public ModelRenderer topRing12_2;
    public ModelRenderer sideRing2_3;
    public ModelRenderer ring2;
    public ModelRenderer ring3;
    public ModelRenderer ring4;
    public ModelRenderer ring5;
    public ModelRenderer ring6;
    public ModelRenderer ring7;
    public ModelRenderer ring8;
    public ModelRenderer sideBlade2;
    public ModelRenderer sideBlade2_1;
    public ModelRenderer sideBlade2_2;
    public ModelRenderer topRing2;
    public ModelRenderer topRing3;
    public ModelRenderer topRing4;
    public ModelRenderer topRing5;
    public ModelRenderer topRing6;
    public ModelRenderer topRing7;
    public ModelRenderer topRing8;
    public ModelRenderer button2;
    public ModelRenderer button3;
    public ModelRenderer button4;
    public ModelRenderer button5;
    public ModelRenderer button6;
    public ModelRenderer button7;
    public ModelRenderer button8;
    public ModelRenderer button2_1;
    public ModelRenderer button3_1;
    public ModelRenderer button4_1;
    public ModelRenderer button5_1;
    public ModelRenderer button6_1;
    public ModelRenderer button7_1;
    public ModelRenderer button8_1;
    public ModelRenderer topRing2_1;
    public ModelRenderer topRing3_1;
    public ModelRenderer topRing4_1;
    public ModelRenderer topRing6_1;
    public ModelRenderer topRing7_1;
    public ModelRenderer topRing8_1;
    public ModelRenderer topRing2_2;
    public ModelRenderer topRing3_2;
    public ModelRenderer topRing4_2;
    public ModelRenderer topRing5_1;
    public ModelRenderer topRing6_2;
    public ModelRenderer topRing7_2;
    public ModelRenderer topRing8_2;
    public ModelRenderer topRing2_3;
    public ModelRenderer topRing3_3;
    public ModelRenderer topRing4_3;
    public ModelRenderer topRing6_3;
    public ModelRenderer topRing7_3;
    public ModelRenderer topRing8_3;
    public ModelRenderer topRing2_4;
    public ModelRenderer topRing3_4;
    public ModelRenderer topRing4_4;
    public ModelRenderer topRing5_2;
    public ModelRenderer topRing6_4;
    public ModelRenderer topRing7_4;
    public ModelRenderer topRing8_4;

    public ModelSwitchSectionReborn() {
        textureWidth = 32;
        textureHeight = 32;
        sideBlade1point1 = new ModelRenderer(this, 0, 11);
        sideBlade1point1.setRotationPoint(2.3F, -10.0F, -2.8F);
        sideBlade1point1.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        setRotateAngle(sideBlade1point1, 0.0F, 0.7853981633974483F, 0.0F);
        sideRing1 = new ModelRenderer(this, 16, 14);
        sideRing1.setRotationPoint(0.0F, -1.0F, 0.0F);
        sideRing1.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        topRing3_3 = new ModelRenderer(this, 16, 15);
        topRing3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3_3, 0.0F, 1.5707963267948966F, 0.0F);
        topRing12_1 = new ModelRenderer(this, 17, 19);
        topRing12_1.setRotationPoint(0.0F, -6.2F, -3.15F);
        topRing12_1.addBox(-0.5F, -1.5F, -1.0F, 1, 3, 1, 0.0F);
        ring8 = new ModelRenderer(this, 0, 0);
        ring8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring8.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing5 = new ModelRenderer(this, 16, 14);
        topRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing5, 0.0F, 3.141592653589793F, 0.0F);
        button8_1 = new ModelRenderer(this, 8, 0);
        button8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button8_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button8_1, 0.0F, -0.7853981633974483F, 0.0F);
        topRing8 = new ModelRenderer(this, 16, 14);
        topRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing11 = new ModelRenderer(this, 16, 15);
        topRing11.setRotationPoint(0.67F, -5.55F, 0.0F);
        topRing11.addBox(-5.0F, -3.0F, 2.65F, 4, 1, 1, 0.0F);
        setRotateAngle(topRing11, 0.0F, 3.141592653589793F, 2.2689280275926285F);
        topRing8_3 = new ModelRenderer(this, 16, 15);
        topRing8_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8_3, 0.0F, -0.7853981633974483F, 0.0F);
        button1Point2 = new ModelRenderer(this, 8, 0);
        button1Point2.setRotationPoint(0.0F, -5.0F, -3.0F);
        button1Point2.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button1Point2, 1.5707963267948966F, 0.0F, 0.0F);
        topRing3_2 = new ModelRenderer(this, 16, 15);
        topRing3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3_2, 0.0F, 1.5707963267948966F, 0.0F);
        topRing2 = new ModelRenderer(this, 16, 14);
        topRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing2, 0.0F, 0.7853981633974483F, 0.0F);
        sideBlade1point3 = new ModelRenderer(this, 0, 11);
        sideBlade1point3.setRotationPoint(0.5F, -10.0F, 3.6F);
        sideBlade1point3.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        setRotateAngle(sideBlade1point3, 0.0F, -1.5707963267948966F, 0.0F);
        topRing7_1 = new ModelRenderer(this, 16, 15);
        topRing7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7_1, 0.0F, -1.5707963267948966F, 0.0F);
        sideRing2_1 = new ModelRenderer(this, 16, 15);
        sideRing2_1.setRotationPoint(0.0F, -9.0F, 0.0F);
        sideRing2_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        ring6 = new ModelRenderer(this, 0, 0);
        ring6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring6.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring6, 0.0F, -2.356194490192345F, 0.0F);
        topRing6 = new ModelRenderer(this, 16, 14);
        topRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing6, 0.0F, -2.356194490192345F, 0.0F);
        topRing7_4 = new ModelRenderer(this, 16, 15);
        topRing7_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7_4, 0.0F, -1.5707963267948966F, 0.0F);
        button8 = new ModelRenderer(this, 2, 23);
        button8.setRotationPoint(0.0F, 0.0F, 0.0F);
        button8.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing9 = new ModelRenderer(this, 16, 15);
        topRing9.setRotationPoint(0.0F, -9.2F, 0.0F);
        topRing9.addBox(-5.0F, 2.0F, 2.65F, 4, 1, 1, 0.0F);
        setRotateAngle(topRing9, 0.0F, 3.141592653589793F, 1.5707963267948966F);
        topRing2_2 = new ModelRenderer(this, 16, 15);
        topRing2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2_2, 0.0F, 0.7853981633974483F, 0.0F);
        topRing4_4 = new ModelRenderer(this, 16, 15);
        topRing4_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4_4, 0.0F, 2.356194490192345F, 0.0F);
        button5 = new ModelRenderer(this, 2, 23);
        button5.setRotationPoint(0.0F, 0.0F, 0.0F);
        button5.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button5, 0.0F, 3.141592653589793F, 0.0F);
        button5_1 = new ModelRenderer(this, 8, 0);
        button5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button5_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button5_1, 0.0F, 3.141592653589793F, 0.0F);
        topRing3_4 = new ModelRenderer(this, 16, 15);
        topRing3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3_4, 0.0F, 1.5707963267948966F, 0.0F);
        topRing10 = new ModelRenderer(this, 16, 15);
        topRing10.setRotationPoint(0.0F, -9.2F, 0.0F);
        topRing10.addBox(-5.0F, -3.0F, 2.65F, 4, 1, 1, 0.0F);
        setRotateAngle(topRing10, 0.0F, 3.141592653589793F, 1.5707963267948966F);
        topRing8_4 = new ModelRenderer(this, 16, 15);
        topRing8_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8_4, 0.0F, -0.7853981633974483F, 0.0F);
        button7_1 = new ModelRenderer(this, 8, 0);
        button7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button7_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button7_1, 0.0F, -1.5707963267948966F, 0.0F);
        topRing6_2 = new ModelRenderer(this, 16, 15);
        topRing6_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6_2, 0.0F, -2.356194490192345F, 0.0F);
        button4 = new ModelRenderer(this, 2, 23);
        button4.setRotationPoint(0.0F, 0.0F, 0.0F);
        button4.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button4, 0.0F, 2.356194490192345F, 0.0F);
        sideRing2 = new ModelRenderer(this, 16, 15);
        sideRing2.setRotationPoint(0.0F, -5.3F, 0.0F);
        sideRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        sideRing2_2 = new ModelRenderer(this, 16, 15);
        sideRing2_2.setRotationPoint(0.0F, -4.3F, 0.0F);
        sideRing2_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        button3 = new ModelRenderer(this, 2, 23);
        button3.setRotationPoint(0.0F, 0.0F, 0.0F);
        button3.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button3, 0.0F, 1.5707963267948966F, 0.0F);
        topRing6_4 = new ModelRenderer(this, 16, 15);
        topRing6_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6_4, 0.0F, -2.356194490192345F, 0.0F);
        topRing6_3 = new ModelRenderer(this, 16, 15);
        topRing6_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6_3, 0.0F, -2.356194490192345F, 0.0F);
        sideBlade1point2 = new ModelRenderer(this, 0, 11);
        sideBlade1point2.setRotationPoint(-3.6F, -10.0F, -4.3F);
        sideBlade1point2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        setRotateAngle(sideBlade1point2, 0.0F, -0.7853981633974483F, 0.0F);
        topRing6_1 = new ModelRenderer(this, 16, 15);
        topRing6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6_1, 0.0F, -2.356194490192345F, 0.0F);
        topRing7_2 = new ModelRenderer(this, 16, 15);
        topRing7_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7_2, 0.0F, -1.5707963267948966F, 0.0F);
        button7 = new ModelRenderer(this, 2, 23);
        button7.setRotationPoint(0.0F, 0.0F, 0.0F);
        button7.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button7, 0.0F, -1.5707963267948966F, 0.0F);
        topRing12_2 = new ModelRenderer(this, 16, 15);
        topRing12_2.setRotationPoint(-0.9F, -0.41999999999999993F, -4.94F);
        topRing12_2.addBox(1.3F, -5.5F, 2.63F, 1, 1, 1, 0.0F);
        topRing7_3 = new ModelRenderer(this, 16, 15);
        topRing7_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7_3, 0.0F, -1.5707963267948966F, 0.0F);
        button6_1 = new ModelRenderer(this, 8, 0);
        button6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button6_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button6_1, 0.0F, -2.356194490192345F, 0.0F);
        sideBlade2 = new ModelRenderer(this, 0, 11);
        sideBlade2.setRotationPoint(0.9F, 0.0F, 0.0F);
        sideBlade2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        ring5 = new ModelRenderer(this, 0, 0);
        ring5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring5.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring5, 0.0F, 3.141592653589793F, 0.0F);
        topRing4 = new ModelRenderer(this, 16, 14);
        topRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing4, 0.0F, 2.356194490192345F, 0.0F);
        topRing4_3 = new ModelRenderer(this, 16, 15);
        topRing4_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4_3, 0.0F, 2.356194490192345F, 0.0F);
        topRing12 = new ModelRenderer(this, 16, 15);
        topRing12.setRotationPoint(-0.66F, -5.54F, 0.0F);
        topRing12.addBox(1.0F, -3.0F, 2.65F, 4, 1, 1, 0.0F);
        setRotateAngle(topRing12, 0.0F, -3.141592653589793F, -2.2689280275926285F);
        button2 = new ModelRenderer(this, 2, 23);
        button2.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button2, 0.0F, 0.7853981633974483F, 0.0F);
        topRing5_1 = new ModelRenderer(this, 16, 15);
        topRing5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing5_1, 0.0F, 3.141592653589793F, 0.0F);
        button4_1 = new ModelRenderer(this, 8, 0);
        button4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button4_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button4_1, 0.0F, 2.356194490192345F, 0.0F);
        topRing3_1 = new ModelRenderer(this, 16, 15);
        topRing3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3_1, 0.0F, 1.5707963267948966F, 0.0F);
        button1Point1 = new ModelRenderer(this, 2, 23);
        button1Point1.setRotationPoint(0.0F, -7.5F, -3.0F);
        button1Point1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button1Point1, 1.5707963267948966F, 0.0F, 0.0F);
        topRing2_3 = new ModelRenderer(this, 16, 15);
        topRing2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2_3, 0.0F, 0.7853981633974483F, 0.0F);
        topRing8_2 = new ModelRenderer(this, 16, 15);
        topRing8_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8_2, 0.0F, -0.7853981633974483F, 0.0F);
        topRing3 = new ModelRenderer(this, 16, 14);
        topRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing3, 0.0F, 1.5707963267948966F, 0.0F);
        topRing4_2 = new ModelRenderer(this, 16, 15);
        topRing4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4_2, 0.0F, 2.356194490192345F, 0.0F);
        ring2 = new ModelRenderer(this, 0, 0);
        ring2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring2, 0.0F, 0.7853981633974483F, 0.0F);
        ring3 = new ModelRenderer(this, 0, 0);
        ring3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring3, 0.0F, 1.5707963267948966F, 0.0F);
        topRing7 = new ModelRenderer(this, 16, 14);
        topRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing7, 0.0F, -1.5707963267948966F, 0.0F);
        sideBlade2_1 = new ModelRenderer(this, 0, 11);
        sideBlade2_1.setRotationPoint(1.0F, 0.0F, 0.0F);
        sideBlade2_1.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        button6 = new ModelRenderer(this, 2, 23);
        button6.setRotationPoint(0.0F, 0.0F, 0.0F);
        button6.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button6, 0.0F, -2.356194490192345F, 0.0F);
        ring1 = new ModelRenderer(this, 0, 0);
        ring1.setRotationPoint(0.0F, -9.2F, 0.0F);
        ring1.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        topRing2_4 = new ModelRenderer(this, 16, 15);
        topRing2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2_4, 0.0F, 0.7853981633974483F, 0.0F);
        sideBlade2_2 = new ModelRenderer(this, 0, 11);
        sideBlade2_2.setRotationPoint(1.0F, 0.0F, 0.0F);
        sideBlade2_2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        ring4 = new ModelRenderer(this, 0, 0);
        ring4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring4, 0.0F, 2.356194490192345F, 0.0F);
        topRing2_1 = new ModelRenderer(this, 16, 15);
        topRing2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2_1, 0.0F, 0.7853981633974483F, 0.0F);
        topRing5_2 = new ModelRenderer(this, 16, 15);
        topRing5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing5_2, 0.0F, 3.141592653589793F, 0.0F);
        button3_1 = new ModelRenderer(this, 8, 0);
        button3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button3_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button3_1, 0.0F, 1.5707963267948966F, 0.0F);
        ring7 = new ModelRenderer(this, 0, 0);
        ring7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring7.addBox(-1.5F, -1.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(ring7, 0.0F, -1.5707963267948966F, 0.0F);
        button2_1 = new ModelRenderer(this, 8, 0);
        button2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        button2_1.addBox(-1.5F, -5.0F, -0.38F, 3, 5, 4, 0.0F);
        setRotateAngle(button2_1, 0.0F, 0.7853981633974483F, 0.0F);
        sideRing2_3 = new ModelRenderer(this, 16, 15);
        sideRing2_3.setRotationPoint(0.0F, -8.0F, 0.0F);
        sideRing2_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        topRing4_1 = new ModelRenderer(this, 16, 15);
        topRing4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4_1, 0.0F, 2.356194490192345F, 0.0F);
        topRing8_1 = new ModelRenderer(this, 16, 15);
        topRing8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8_1, 0.0F, -0.7853981633974483F, 0.0F);
        sideRing2_2.addChild(topRing3_3);
        ring1.addChild(ring8);
        sideRing1.addChild(topRing5);
        button1Point2.addChild(button8_1);
        sideRing1.addChild(topRing8);
        sideRing2_2.addChild(topRing8_3);
        sideRing2_1.addChild(topRing3_2);
        sideRing1.addChild(topRing2);
        sideRing2.addChild(topRing7_1);
        ring1.addChild(ring6);
        sideRing1.addChild(topRing6);
        sideRing2_3.addChild(topRing7_4);
        button1Point1.addChild(button8);
        sideRing2_1.addChild(topRing2_2);
        sideRing2_3.addChild(topRing4_4);
        button1Point1.addChild(button5);
        button1Point2.addChild(button5_1);
        sideRing2_3.addChild(topRing3_4);
        sideRing2_3.addChild(topRing8_4);
        button1Point2.addChild(button7_1);
        sideRing2_1.addChild(topRing6_2);
        button1Point1.addChild(button4);
        button1Point1.addChild(button3);
        sideRing2_3.addChild(topRing6_4);
        sideRing2_2.addChild(topRing6_3);
        sideRing2.addChild(topRing6_1);
        sideRing2_1.addChild(topRing7_2);
        button1Point1.addChild(button7);
        sideRing2_2.addChild(topRing7_3);
        button1Point2.addChild(button6_1);
        sideBlade1point1.addChild(sideBlade2);
        ring1.addChild(ring5);
        sideRing1.addChild(topRing4);
        sideRing2_2.addChild(topRing4_3);
        button1Point1.addChild(button2);
        sideRing2_1.addChild(topRing5_1);
        button1Point2.addChild(button4_1);
        sideRing2.addChild(topRing3_1);
        sideRing2_2.addChild(topRing2_3);
        sideRing2_1.addChild(topRing8_2);
        sideRing1.addChild(topRing3);
        sideRing2_1.addChild(topRing4_2);
        ring1.addChild(ring2);
        ring1.addChild(ring3);
        sideRing1.addChild(topRing7);
        sideBlade1point2.addChild(sideBlade2_1);
        button1Point1.addChild(button6);
        sideRing2_3.addChild(topRing2_4);
        sideBlade1point3.addChild(sideBlade2_2);
        ring1.addChild(ring4);
        sideRing2.addChild(topRing2_1);
        sideRing2_3.addChild(topRing5_2);
        button1Point2.addChild(button3_1);
        ring1.addChild(ring7);
        button1Point2.addChild(button2_1);
        sideRing2.addChild(topRing4_1);
        sideRing2.addChild(topRing8_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing1.offsetX, sideRing1.offsetY, sideRing1.offsetZ);
        GL11.glTranslatef(sideRing1.rotationPointX * f5, sideRing1.rotationPointY * f5, sideRing1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.0D, 1.1D);
        GL11.glTranslatef(-sideRing1.offsetX, -sideRing1.offsetY, -sideRing1.offsetZ);
        GL11.glTranslatef(
            -sideRing1.rotationPointX * f5,
            -sideRing1.rotationPointY * f5,
            -sideRing1.rotationPointZ * f5);
        sideRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing2_2.offsetX, sideRing2_2.offsetY, sideRing2_2.offsetZ);
        GL11.glTranslatef(
            sideRing2_2.rotationPointX * f5,
            sideRing2_2.rotationPointY * f5,
            sideRing2_2.rotationPointZ * f5);
        GL11.glScaled(1.01D, 0.5D, 1.01D);
        GL11.glTranslatef(-sideRing2_2.offsetX, -sideRing2_2.offsetY, -sideRing2_2.offsetZ);
        GL11.glTranslatef(
            -sideRing2_2.rotationPointX * f5,
            -sideRing2_2.rotationPointY * f5,
            -sideRing2_2.rotationPointZ * f5);
        sideRing2_2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing2.offsetX, sideRing2.offsetY, sideRing2.offsetZ);
        GL11.glTranslatef(sideRing2.rotationPointX * f5, sideRing2.rotationPointY * f5, sideRing2.rotationPointZ * f5);
        GL11.glScaled(1.01D, 0.5D, 1.01D);
        GL11.glTranslatef(-sideRing2.offsetX, -sideRing2.offsetY, -sideRing2.offsetZ);
        GL11.glTranslatef(
            -sideRing2.rotationPointX * f5,
            -sideRing2.rotationPointY * f5,
            -sideRing2.rotationPointZ * f5);
        sideRing2.render(f5);
        GL11.glPopMatrix();
        sideBlade1point2.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(ring1.offsetX, ring1.offsetY, ring1.offsetZ);
        GL11.glTranslatef(ring1.rotationPointX * f5, ring1.rotationPointY * f5, ring1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.8D, 1.0D);
        GL11.glTranslatef(-ring1.offsetX, -ring1.offsetY, -ring1.offsetZ);
        GL11.glTranslatef(-ring1.rotationPointX * f5, -ring1.rotationPointY * f5, -ring1.rotationPointZ * f5);
        ring1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing12.offsetX, topRing12.offsetY, topRing12.offsetZ);
        GL11.glTranslatef(topRing12.rotationPointX * f5, topRing12.rotationPointY * f5, topRing12.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 1.0D);
        GL11.glTranslatef(-topRing12.offsetX, -topRing12.offsetY, -topRing12.offsetZ);
        GL11.glTranslatef(
            -topRing12.rotationPointX * f5,
            -topRing12.rotationPointY * f5,
            -topRing12.rotationPointZ * f5);
        topRing12.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(button1Point2.offsetX, button1Point2.offsetY, button1Point2.offsetZ);
        GL11.glTranslatef(
            button1Point2.rotationPointX * f5,
            button1Point2.rotationPointY * f5,
            button1Point2.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.25D);
        GL11.glTranslatef(-button1Point2.offsetX, -button1Point2.offsetY, -button1Point2.offsetZ);
        GL11.glTranslatef(
            -button1Point2.rotationPointX * f5,
            -button1Point2.rotationPointY * f5,
            -button1Point2.rotationPointZ * f5);
        button1Point2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing12_2.offsetX, topRing12_2.offsetY, topRing12_2.offsetZ);
        GL11.glTranslatef(
            topRing12_2.rotationPointX * f5,
            topRing12_2.rotationPointY * f5,
            topRing12_2.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-topRing12_2.offsetX, -topRing12_2.offsetY, -topRing12_2.offsetZ);
        GL11.glTranslatef(
            -topRing12_2.rotationPointX * f5,
            -topRing12_2.rotationPointY * f5,
            -topRing12_2.rotationPointZ * f5);
        topRing12_2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing12_1.offsetX, topRing12_1.offsetY, topRing12_1.offsetZ);
        GL11.glTranslatef(
            topRing12_1.rotationPointX * f5,
            topRing12_1.rotationPointY * f5,
            topRing12_1.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-topRing12_1.offsetX, -topRing12_1.offsetY, -topRing12_1.offsetZ);
        GL11.glTranslatef(
            -topRing12_1.rotationPointX * f5,
            -topRing12_1.rotationPointY * f5,
            -topRing12_1.rotationPointZ * f5);
        topRing12_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing10.offsetX, topRing10.offsetY, topRing10.offsetZ);
        GL11.glTranslatef(topRing10.rotationPointX * f5, topRing10.rotationPointY * f5, topRing10.rotationPointZ * f5);
        GL11.glScaled(0.5D, 1.0D, 1.0D);
        GL11.glTranslatef(-topRing10.offsetX, -topRing10.offsetY, -topRing10.offsetZ);
        GL11.glTranslatef(
            -topRing10.rotationPointX * f5,
            -topRing10.rotationPointY * f5,
            -topRing10.rotationPointZ * f5);
        topRing10.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(button1Point1.offsetX, button1Point1.offsetY, button1Point1.offsetZ);
        GL11.glTranslatef(
            button1Point1.rotationPointX * f5,
            button1Point1.rotationPointY * f5,
            button1Point1.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-button1Point1.offsetX, -button1Point1.offsetY, -button1Point1.offsetZ);
        GL11.glTranslatef(
            -button1Point1.rotationPointX * f5,
            -button1Point1.rotationPointY * f5,
            -button1Point1.rotationPointZ * f5);
        button1Point1.render(f5);
        GL11.glPopMatrix();
        sideBlade1point1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing11.offsetX, topRing11.offsetY, topRing11.offsetZ);
        GL11.glTranslatef(topRing11.rotationPointX * f5, topRing11.rotationPointY * f5, topRing11.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 1.0D);
        GL11.glTranslatef(-topRing11.offsetX, -topRing11.offsetY, -topRing11.offsetZ);
        GL11.glTranslatef(
            -topRing11.rotationPointX * f5,
            -topRing11.rotationPointY * f5,
            -topRing11.rotationPointZ * f5);
        topRing11.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing2_1.offsetX, sideRing2_1.offsetY, sideRing2_1.offsetZ);
        GL11.glTranslatef(
            sideRing2_1.rotationPointX * f5,
            sideRing2_1.rotationPointY * f5,
            sideRing2_1.rotationPointZ * f5);
        GL11.glScaled(1.01D, 0.5D, 1.01D);
        GL11.glTranslatef(-sideRing2_1.offsetX, -sideRing2_1.offsetY, -sideRing2_1.offsetZ);
        GL11.glTranslatef(
            -sideRing2_1.rotationPointX * f5,
            -sideRing2_1.rotationPointY * f5,
            -sideRing2_1.rotationPointZ * f5);
        sideRing2_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing2_3.offsetX, sideRing2_3.offsetY, sideRing2_3.offsetZ);
        GL11.glTranslatef(
            sideRing2_3.rotationPointX * f5,
            sideRing2_3.rotationPointY * f5,
            sideRing2_3.rotationPointZ * f5);
        GL11.glScaled(1.01D, 0.5D, 1.01D);
        GL11.glTranslatef(-sideRing2_3.offsetX, -sideRing2_3.offsetY, -sideRing2_3.offsetZ);
        GL11.glTranslatef(
            -sideRing2_3.rotationPointX * f5,
            -sideRing2_3.rotationPointY * f5,
            -sideRing2_3.rotationPointZ * f5);
        sideRing2_3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing9.offsetX, topRing9.offsetY, topRing9.offsetZ);
        GL11.glTranslatef(topRing9.rotationPointX * f5, topRing9.rotationPointY * f5, topRing9.rotationPointZ * f5);
        GL11.glScaled(0.5D, 1.0D, 1.0D);
        GL11.glTranslatef(-topRing9.offsetX, -topRing9.offsetY, -topRing9.offsetZ);
        GL11.glTranslatef(-topRing9.rotationPointX * f5, -topRing9.rotationPointY * f5, -topRing9.rotationPointZ * f5);
        topRing9.render(f5);
        GL11.glPopMatrix();
        sideBlade1point3.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
