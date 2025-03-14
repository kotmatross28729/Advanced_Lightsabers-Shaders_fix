package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelEmitterFury extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer upperRing1;
    public ModelRenderer backPlate1;
    public ModelRenderer innerRing1;
    public ModelRenderer emitterRing1;
    public ModelRenderer darkInnerRing1;
    public ModelRenderer topRing1;
    public ModelRenderer topDetail1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body6;
    public ModelRenderer body8;
    public ModelRenderer body10;
    public ModelRenderer body11;
    public ModelRenderer body12;
    public ModelRenderer body14;
    public ModelRenderer body16;
    public ModelRenderer body5;
    public ModelRenderer body7;
    public ModelRenderer body9;
    public ModelRenderer body13;
    public ModelRenderer body15;
    public ModelRenderer body17;
    public ModelRenderer upperRing2;
    public ModelRenderer upperRing3;
    public ModelRenderer upperRing4;
    public ModelRenderer upperRing5;
    public ModelRenderer upperRing6;
    public ModelRenderer upperRing7;
    public ModelRenderer upperRing8;
    public ModelRenderer backPlate2;
    public ModelRenderer backPlate4;
    public ModelRenderer backPlate6;
    public ModelRenderer backPlate3;
    public ModelRenderer backPlate5;
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
    public ModelRenderer darkInnerRing2;
    public ModelRenderer darkInnerRing3;
    public ModelRenderer darkInnerRing4;
    public ModelRenderer darkInnerRing5;
    public ModelRenderer darkInnerRing6;
    public ModelRenderer darkInnerRing7;
    public ModelRenderer darkInnerRing8;
    public ModelRenderer topRing2;
    public ModelRenderer topRing3;
    public ModelRenderer topRing4;
    public ModelRenderer topRing5;
    public ModelRenderer topRing6;
    public ModelRenderer topRing7;
    public ModelRenderer topRing8;
    public ModelRenderer topDetail2;
    public ModelRenderer topDetail3;

    public ModelEmitterFury() {
        textureWidth = 64;
        textureHeight = 32;
        innerRing5 = new ModelRenderer(this, 16, 14);
        innerRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing5.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing5, 0.29496064358704166F, 2.356194490192345F, 0.0F);
        darkInnerRing3 = new ModelRenderer(this, 16, 18);
        darkInnerRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing3, 0.0F, 1.5707963267948966F, 0.0F);
        darkInnerRing5 = new ModelRenderer(this, 16, 18);
        darkInnerRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing5, 0.0F, 3.141592653589793F, 0.0F);
        topDetail3 = new ModelRenderer(this, 24, 13);
        topDetail3.mirror = true;
        topDetail3.setRotationPoint(-1.5F, -1.5F, 1.0F);
        topDetail3.addBox(-3.0F, -2.5F, -1.0F, 3, 5, 1, 0.0F);
        setRotateAngle(topDetail3, 0.0F, -0.7853981633974483F, 0.0F);
        emitterRing3 = new ModelRenderer(this, 16, 23);
        emitterRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing3, 0.0F, 1.5707963267948966F, 0.0F);
        backPlate1 = new ModelRenderer(this, 8, 14);
        backPlate1.setRotationPoint(0.0F, 0.0F, -0.45F);
        backPlate1.addBox(-1.5F, -12.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(backPlate1, 0.0F, -3.1429889169913885F, 0.0F);
        body17 = new ModelRenderer(this, 24, 5);
        body17.setRotationPoint(0.0F, -11.0F, 3.62F);
        body17.addBox(-1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F);
        setRotateAngle(body17, -0.33161255787892263F, 0.0F, 0.0F);
        innerRing6 = new ModelRenderer(this, 16, 14);
        innerRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing6.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing6, 0.29496064358704166F, 3.141592653589793F, 0.0F);
        body6 = new ModelRenderer(this, 32, 3);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(body6, 0.0F, 3.141592653589793F, 0.0F);
        emitterRing4 = new ModelRenderer(this, 16, 23);
        emitterRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing4, 0.0F, 2.356194490192345F, 0.0F);
        upperRing3 = new ModelRenderer(this, 24, 10);
        upperRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing3.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing3, 0.0F, 1.5707963267948966F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -13.0F, 2.62F, 3, 13, 1, 0.0F);
        innerRing1 = new ModelRenderer(this, 0, 10);
        innerRing1.setRotationPoint(0.0F, -11.64F, 0.0F);
        innerRing1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        topRing8 = new ModelRenderer(this, 16, 21);
        topRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8, 0.0F, -0.7853981633974483F, 0.0F);
        body11 = new ModelRenderer(this, 8, 0);
        body11.setRotationPoint(0.0F, 0.0F, 0.0F);
        body11.addBox(-1.5F, -13.0F, 2.62F, 3, 13, 1, 0.0F);
        setRotateAngle(body11, 0.0F, -0.7853981633974483F, 0.0F);
        darkInnerRing7 = new ModelRenderer(this, 16, 18);
        darkInnerRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing7, 0.0F, -1.5707963267948966F, 0.0F);
        body5 = new ModelRenderer(this, 24, 8);
        body5.setRotationPoint(0.0F, -1.0F, 3.62F);
        body5.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        setRotateAngle(body5, 0.6108652381980153F, 0.0F, 0.0F);
        innerRing9 = new ModelRenderer(this, 16, 14);
        innerRing9.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing9.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing9, 0.29496064358704166F, -0.7853981633974483F, 0.0F);
        topRing1 = new ModelRenderer(this, 16, 21);
        topRing1.setRotationPoint(0.0F, -16.9F, 0.0F);
        topRing1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        emitterRing8 = new ModelRenderer(this, 16, 23);
        emitterRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing8, 0.0F, -0.7853981633974483F, 0.0F);
        topRing3 = new ModelRenderer(this, 16, 21);
        topRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3, 0.0F, 1.5707963267948966F, 0.0F);
        emitterRing6 = new ModelRenderer(this, 16, 23);
        emitterRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing6, 0.0F, -2.356194490192345F, 0.0F);
        topRing4 = new ModelRenderer(this, 16, 21);
        topRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4, 0.0F, 2.356194490192345F, 0.0F);
        body12 = new ModelRenderer(this, 24, 0);
        body12.setRotationPoint(0.0F, 0.0F, 0.0F);
        body12.addBox(-1.5F, -13.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(body12, 0.0F, -2.356194490192345F, 0.0F);
        topDetail2 = new ModelRenderer(this, 24, 13);
        topDetail2.setRotationPoint(1.5F, -1.5F, 1.0F);
        topDetail2.addBox(0.0F, -2.5F, -1.0F, 3, 5, 1, 0.0F);
        setRotateAngle(topDetail2, 0.0F, 0.7853981633974483F, 0.0F);
        body16 = new ModelRenderer(this, 24, 0);
        body16.mirror = true;
        body16.setRotationPoint(0.0F, 0.0F, 0.0F);
        body16.addBox(-1.5F, -13.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(body16, 0.0F, 2.356194490192345F, 0.0F);
        body15 = new ModelRenderer(this, 32, 5);
        body15.setRotationPoint(0.0F, -11.0F, 3.62F);
        body15.addBox(-1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F);
        setRotateAngle(body15, -0.33161255787892263F, 0.0F, 0.0F);
        darkInnerRing1 = new ModelRenderer(this, 16, 18);
        darkInnerRing1.setRotationPoint(0.0F, -15.7F, 0.0F);
        darkInnerRing1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        body2 = new ModelRenderer(this, 8, 0);
        body2.mirror = true;
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -13.0F, 2.62F, 3, 13, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        topRing7 = new ModelRenderer(this, 16, 21);
        topRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7, 0.0F, -1.5707963267948966F, 0.0F);
        innerRing2 = new ModelRenderer(this, 16, 14);
        innerRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing2.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing2, 0.29496064358704166F, 0.0F, 0.0F);
        innerRing3 = new ModelRenderer(this, 16, 14);
        innerRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing3.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing3, 0.29496064358704166F, 0.7853981633974483F, 0.0F);
        topDetail1 = new ModelRenderer(this, 32, 10);
        topDetail1.setRotationPoint(0.0F, -8.3F, -2.7F);
        topDetail1.addBox(-1.5F, -4.0F, 0.0F, 3, 5, 1, 0.0F);
        setRotateAngle(topDetail1, -0.17453292519943295F, -3.141592653589793F, 0.0017453292519943296F);
        backPlate6 = new ModelRenderer(this, 0, 25);
        backPlate6.setRotationPoint(0.0F, -5.7F, 3.22F);
        backPlate6.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 1, 0.0F);
        body7 = new ModelRenderer(this, 32, 8);
        body7.setRotationPoint(0.0F, -1.0F, 3.62F);
        body7.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        setRotateAngle(body7, 0.6108652381980153F, 0.0F, 0.0F);
        innerRing8 = new ModelRenderer(this, 16, 14);
        innerRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing8.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing8, 0.29496064358704166F, -1.5707963267948966F, 0.0F);
        emitterRing2 = new ModelRenderer(this, 16, 23);
        emitterRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing2, 0.0F, 0.7853981633974483F, 0.0F);
        upperRing6 = new ModelRenderer(this, 24, 10);
        upperRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing6.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing6, 0.0F, -2.356194490192345F, 0.0F);
        backPlate4 = new ModelRenderer(this, 0, 14);
        backPlate4.setRotationPoint(0.0F, 0.0F, 0.0F);
        backPlate4.addBox(-1.5F, -12.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(backPlate4, 0.0F, -0.7853981633974483F, 0.0F);
        upperRing7 = new ModelRenderer(this, 24, 10);
        upperRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing7.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing7, 0.0F, -1.5707963267948966F, 0.0F);
        topRing2 = new ModelRenderer(this, 16, 21);
        topRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2, 0.0F, 0.7853981633974483F, 0.0F);
        emitterRing1 = new ModelRenderer(this, 16, 23);
        emitterRing1.setRotationPoint(0.0F, -17.5F, 0.0F);
        emitterRing1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        body13 = new ModelRenderer(this, 24, 5);
        body13.setRotationPoint(0.0F, -11.0F, 3.62F);
        body13.addBox(-1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F);
        setRotateAngle(body13, -0.33161255787892263F, 0.0F, 0.0F);
        upperRing2 = new ModelRenderer(this, 24, 10);
        upperRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing2.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing2, 0.0F, 0.7853981633974483F, 0.0F);
        body8 = new ModelRenderer(this, 24, 3);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(body8, 0.0F, -2.356194490192345F, 0.0F);
        darkInnerRing8 = new ModelRenderer(this, 16, 18);
        darkInnerRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing8, 0.0F, -0.7853981633974483F, 0.0F);
        body9 = new ModelRenderer(this, 24, 8);
        body9.setRotationPoint(0.0F, -1.0F, 3.62F);
        body9.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        setRotateAngle(body9, 0.6108652381980153F, 0.0F, 0.0F);
        upperRing8 = new ModelRenderer(this, 24, 10);
        upperRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing8.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing8, 0.0F, -0.7853981633974483F, 0.0F);
        upperRing4 = new ModelRenderer(this, 24, 10);
        upperRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing4.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing4, 0.0F, 2.356194490192345F, 0.0F);
        darkInnerRing4 = new ModelRenderer(this, 16, 18);
        darkInnerRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing4, 0.0F, 2.356194490192345F, 0.0F);
        backPlate3 = new ModelRenderer(this, 0, 25);
        backPlate3.setRotationPoint(-0.3F, -5.7F, 3.22F);
        backPlate3.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 1, 0.0F);
        upperRing5 = new ModelRenderer(this, 24, 10);
        upperRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        upperRing5.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        setRotateAngle(upperRing5, 0.0F, 3.141592653589793F, 0.0F);
        upperRing1 = new ModelRenderer(this, 24, 10);
        upperRing1.setRotationPoint(0.0F, -15.86F, 0.0F);
        upperRing1.addBox(-1.0F, -2.0F, 2.64F, 2, 2, 1, 0.0F);
        innerRing4 = new ModelRenderer(this, 16, 14);
        innerRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing4.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing4, 0.29496064358704166F, 1.5707963267948966F, 0.0F);
        emitterRing7 = new ModelRenderer(this, 16, 23);
        emitterRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing7, 0.0F, -1.5707963267948966F, 0.0F);
        darkInnerRing2 = new ModelRenderer(this, 16, 18);
        darkInnerRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing2, 0.0F, 0.7853981633974483F, 0.0F);
        backPlate5 = new ModelRenderer(this, 0, 25);
        backPlate5.setRotationPoint(0.3F, -5.7F, 3.22F);
        backPlate5.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 1, 0.0F);
        topRing6 = new ModelRenderer(this, 16, 21);
        topRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6, 0.0F, -2.356194490192345F, 0.0F);
        body10 = new ModelRenderer(this, 16, 0);
        body10.setRotationPoint(0.0F, 0.0F, 0.0F);
        body10.addBox(-1.5F, -13.0F, 2.62F, 3, 13, 1, 0.0F);
        setRotateAngle(body10, 0.0F, -1.5707963267948966F, 0.0F);
        innerRing7 = new ModelRenderer(this, 16, 14);
        innerRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing7.addBox(-1.5F, -3.0F, 3.67F, 3, 3, 1, 0.0F);
        setRotateAngle(innerRing7, 0.29496064358704166F, -2.356194490192345F, 0.0F);
        emitterRing5 = new ModelRenderer(this, 16, 23);
        emitterRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterRing5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(emitterRing5, 0.0F, 3.141592653589793F, 0.0F);
        backPlate2 = new ModelRenderer(this, 0, 14);
        backPlate2.setRotationPoint(0.0F, 0.0F, 0.0F);
        backPlate2.addBox(-1.5F, -12.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(backPlate2, 0.0F, 0.7853981633974483F, 0.0F);
        darkInnerRing6 = new ModelRenderer(this, 16, 18);
        darkInnerRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(darkInnerRing6, 0.0F, -2.356194490192345F, 0.0F);
        body14 = new ModelRenderer(this, 32, 0);
        body14.setRotationPoint(0.0F, 0.0F, 0.0F);
        body14.addBox(-1.5F, -13.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(body14, 0.0F, 3.141592653589793F, 0.0F);
        body3 = new ModelRenderer(this, 16, 0);
        body3.mirror = true;
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -13.0F, 2.62F, 3, 13, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        body4 = new ModelRenderer(this, 24, 3);
        body4.mirror = true;
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        topRing5 = new ModelRenderer(this, 16, 21);
        topRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing5, 0.0F, 3.141592653589793F, 0.0F);
        innerRing1.addChild(innerRing5);
        darkInnerRing1.addChild(darkInnerRing3);
        darkInnerRing1.addChild(darkInnerRing5);
        topDetail1.addChild(topDetail3);
        emitterRing1.addChild(emitterRing3);
        body16.addChild(body17);
        innerRing1.addChild(innerRing6);
        body1.addChild(body6);
        emitterRing1.addChild(emitterRing4);
        upperRing1.addChild(upperRing3);
        topRing1.addChild(topRing8);
        body1.addChild(body11);
        darkInnerRing1.addChild(darkInnerRing7);
        body4.addChild(body5);
        innerRing1.addChild(innerRing9);
        emitterRing1.addChild(emitterRing8);
        topRing1.addChild(topRing3);
        emitterRing1.addChild(emitterRing6);
        topRing1.addChild(topRing4);
        body1.addChild(body12);
        topDetail1.addChild(topDetail2);
        body1.addChild(body16);
        body14.addChild(body15);
        body1.addChild(body2);
        topRing1.addChild(topRing7);
        innerRing1.addChild(innerRing2);
        innerRing1.addChild(innerRing3);
        backPlate1.addChild(backPlate6);
        body6.addChild(body7);
        innerRing1.addChild(innerRing8);
        emitterRing1.addChild(emitterRing2);
        upperRing1.addChild(upperRing6);
        backPlate1.addChild(backPlate4);
        upperRing1.addChild(upperRing7);
        topRing1.addChild(topRing2);
        body12.addChild(body13);
        upperRing1.addChild(upperRing2);
        body1.addChild(body8);
        darkInnerRing1.addChild(darkInnerRing8);
        body8.addChild(body9);
        upperRing1.addChild(upperRing8);
        upperRing1.addChild(upperRing4);
        darkInnerRing1.addChild(darkInnerRing4);
        backPlate2.addChild(backPlate3);
        upperRing1.addChild(upperRing5);
        innerRing1.addChild(innerRing4);
        emitterRing1.addChild(emitterRing7);
        darkInnerRing1.addChild(darkInnerRing2);
        backPlate4.addChild(backPlate5);
        topRing1.addChild(topRing6);
        body1.addChild(body10);
        innerRing1.addChild(innerRing7);
        emitterRing1.addChild(emitterRing5);
        backPlate1.addChild(backPlate2);
        darkInnerRing1.addChild(darkInnerRing6);
        body1.addChild(body14);
        body1.addChild(body3);
        body1.addChild(body4);
        topRing1.addChild(topRing5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(backPlate1.offsetX, backPlate1.offsetY, backPlate1.offsetZ);
        GL11.glTranslatef(
            backPlate1.rotationPointX * f5,
            backPlate1.rotationPointY * f5,
            backPlate1.rotationPointZ * f5);
        GL11.glScaled(0.82D, 0.82D, 0.7D);
        GL11.glTranslatef(-backPlate1.offsetX, -backPlate1.offsetY, -backPlate1.offsetZ);
        GL11.glTranslatef(
            -backPlate1.rotationPointX * f5,
            -backPlate1.rotationPointY * f5,
            -backPlate1.rotationPointZ * f5);
        backPlate1.render(f5);
        GL11.glPopMatrix();
        body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(innerRing1.offsetX, innerRing1.offsetY, innerRing1.offsetZ);
        GL11.glTranslatef(
            innerRing1.rotationPointX * f5,
            innerRing1.rotationPointY * f5,
            innerRing1.rotationPointZ * f5);
        GL11.glScaled(0.81D, 1.0D, 0.81D);
        GL11.glTranslatef(-innerRing1.offsetX, -innerRing1.offsetY, -innerRing1.offsetZ);
        GL11.glTranslatef(
            -innerRing1.rotationPointX * f5,
            -innerRing1.rotationPointY * f5,
            -innerRing1.rotationPointZ * f5);
        innerRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topRing1.offsetX, topRing1.offsetY, topRing1.offsetZ);
        GL11.glTranslatef(topRing1.rotationPointX * f5, topRing1.rotationPointY * f5, topRing1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-topRing1.offsetX, -topRing1.offsetY, -topRing1.offsetZ);
        GL11.glTranslatef(-topRing1.rotationPointX * f5, -topRing1.rotationPointY * f5, -topRing1.rotationPointZ * f5);
        topRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(darkInnerRing1.offsetX, darkInnerRing1.offsetY, darkInnerRing1.offsetZ);
        GL11.glTranslatef(
            darkInnerRing1.rotationPointX * f5,
            darkInnerRing1.rotationPointY * f5,
            darkInnerRing1.rotationPointZ * f5);
        GL11.glScaled(0.7D, 0.7D, 0.7D);
        GL11.glTranslatef(-darkInnerRing1.offsetX, -darkInnerRing1.offsetY, -darkInnerRing1.offsetZ);
        GL11.glTranslatef(
            -darkInnerRing1.rotationPointX * f5,
            -darkInnerRing1.rotationPointY * f5,
            -darkInnerRing1.rotationPointZ * f5);
        darkInnerRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(topDetail1.offsetX, topDetail1.offsetY, topDetail1.offsetZ);
        GL11.glTranslatef(
            topDetail1.rotationPointX * f5,
            topDetail1.rotationPointY * f5,
            topDetail1.rotationPointZ * f5);
        GL11.glScaled(0.77D, 0.5D, 0.7D);
        GL11.glTranslatef(-topDetail1.offsetX, -topDetail1.offsetY, -topDetail1.offsetZ);
        GL11.glTranslatef(
            -topDetail1.rotationPointX * f5,
            -topDetail1.rotationPointY * f5,
            -topDetail1.rotationPointZ * f5);
        topDetail1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(emitterRing1.offsetX, emitterRing1.offsetY, emitterRing1.offsetZ);
        GL11.glTranslatef(
            emitterRing1.rotationPointX * f5,
            emitterRing1.rotationPointY * f5,
            emitterRing1.rotationPointZ * f5);
        GL11.glScaled(0.65D, 0.65D, 0.65D);
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
        GL11.glScaled(0.8D, 0.8D, 0.8D);
        GL11.glTranslatef(-upperRing1.offsetX, -upperRing1.offsetY, -upperRing1.offsetZ);
        GL11.glTranslatef(
            -upperRing1.rotationPointX * f5,
            -upperRing1.rotationPointY * f5,
            -upperRing1.rotationPointZ * f5);
        upperRing1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
