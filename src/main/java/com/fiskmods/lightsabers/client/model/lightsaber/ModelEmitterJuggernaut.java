package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelEmitterJuggernaut extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer ring1_1;
    public ModelRenderer ring2_1;
    public ModelRenderer ring3_1;
    public ModelRenderer ring4_1;
    public ModelRenderer rightGuard1;
    public ModelRenderer rightGuardEdge1;
    public ModelRenderer leftGuard1;
    public ModelRenderer leftGuardEdge1;
    public ModelRenderer frontButtonRing1;
    public ModelRenderer frontButton1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer ring1_2;
    public ModelRenderer ring1_3;
    public ModelRenderer ring1_4;
    public ModelRenderer ring1_5;
    public ModelRenderer ring1_6;
    public ModelRenderer ring1_7;
    public ModelRenderer ring1_8;
    public ModelRenderer ring2_2;
    public ModelRenderer ring2_3;
    public ModelRenderer ring2_4;
    public ModelRenderer ring2_5;
    public ModelRenderer ring2_6;
    public ModelRenderer ring2_7;
    public ModelRenderer ring2_8;
    public ModelRenderer ring3_2;
    public ModelRenderer ring3_3;
    public ModelRenderer ring3_4;
    public ModelRenderer ring3_5;
    public ModelRenderer ring3_6;
    public ModelRenderer ring3_7;
    public ModelRenderer ring3_8;
    public ModelRenderer ring4_2;
    public ModelRenderer ring4_3;
    public ModelRenderer ring4_4;
    public ModelRenderer ring4_5;
    public ModelRenderer ring4_6;
    public ModelRenderer ring4_7;
    public ModelRenderer ring4_8;
    public ModelRenderer rightGuard2;
    public ModelRenderer rightGuard3;
    public ModelRenderer rightGuard4;
    public ModelRenderer rightGuard5;
    public ModelRenderer rightGuardEdge2;
    public ModelRenderer rightGuardEdge3;
    public ModelRenderer rightGuardEdge4;
    public ModelRenderer rightGuardEdge5;
    public ModelRenderer rightGuardEdge6;
    public ModelRenderer rightGuardEdge7;
    public ModelRenderer leftGuard2;
    public ModelRenderer leftGuard3;
    public ModelRenderer leftGuard4;
    public ModelRenderer leftGuard5;
    public ModelRenderer leftGuardEdge2;
    public ModelRenderer leftGuardEdge3;
    public ModelRenderer leftGuardEdge4;
    public ModelRenderer leftGuardEdge5;
    public ModelRenderer leftGuardEdge6;
    public ModelRenderer leftGuardEdge7;
    public ModelRenderer frontButtonRing2;
    public ModelRenderer frontButtonRing3;
    public ModelRenderer frontButtonRing4;
    public ModelRenderer frontButtonRing5;
    public ModelRenderer frontButtonRing6;
    public ModelRenderer frontButtonRing7;
    public ModelRenderer frontButtonRing8;
    public ModelRenderer frontButton2;
    public ModelRenderer frontButton3;
    public ModelRenderer frontButton4;
    public ModelRenderer frontButton5;
    public ModelRenderer frontButton6;
    public ModelRenderer frontButton7;
    public ModelRenderer frontButton8;

    public ModelEmitterJuggernaut() {
        textureWidth = 64;
        textureHeight = 32;
        ring3_5 = new ModelRenderer(this, 0, 16);
        ring3_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_5, 0.0F, 3.141592653589793F, 0.0F);
        frontButtonRing7 = new ModelRenderer(this, 26, 0);
        frontButtonRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing7, 0.0F, -1.5707963267948966F, 0.0F);
        rightGuard4 = new ModelRenderer(this, 22, 0);
        rightGuard4.setRotationPoint(-2.0F, -0.58F, 0.0F);
        rightGuard4.addBox(-1.0F, -14.0F, -0.5F, 1, 14, 1, 0.0F);
        rightGuardEdge2 = new ModelRenderer(this, 24, 16);
        rightGuardEdge2.setRotationPoint(1.0F, -7.0F, 0.0F);
        rightGuardEdge2.addBox(-1.0F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        setRotateAngle(rightGuardEdge2, 0.0F, 0.0F, -0.6981317007977318F);
        leftGuardEdge4 = new ModelRenderer(this, 20, 17);
        leftGuardEdge4.mirror = true;
        leftGuardEdge4.setRotationPoint(0.0F, -13.0F, 0.0F);
        leftGuardEdge4.addBox(-1.0F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        setRotateAngle(leftGuardEdge4, 0.0F, 0.0F, -0.40142572795869574F);
        frontButton6 = new ModelRenderer(this, 0, 21);
        frontButton6.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton6.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton6, 0.0F, -2.356194490192345F, 0.0F);
        ring4_4 = new ModelRenderer(this, 0, 18);
        ring4_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_4, 0.0F, 2.356194490192345F, 0.0F);
        ring1_3 = new ModelRenderer(this, 0, 10);
        ring1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_3, 0.0F, 1.5707963267948966F, 0.0F);
        ring3_6 = new ModelRenderer(this, 0, 16);
        ring3_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_6, 0.0F, -2.356194490192345F, 0.0F);
        frontButton8 = new ModelRenderer(this, 0, 21);
        frontButton8.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton8.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton8, 0.0F, -0.7853981633974483F, 0.0F);
        leftGuard1 = new ModelRenderer(this, 12, 0);
        leftGuard1.mirror = true;
        leftGuard1.setRotationPoint(3.62F, -4.4F, 0.0F);
        leftGuard1.addBox(0.0F, -23.0F, -0.5F, 1, 23, 1, 0.0F);
        frontButton5 = new ModelRenderer(this, 0, 21);
        frontButton5.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton5.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton5, 0.0F, 3.141592653589793F, 0.0F);
        ring4_5 = new ModelRenderer(this, 0, 18);
        ring4_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_5, 0.0F, 3.141592653589793F, 0.0F);
        ring1_5 = new ModelRenderer(this, 0, 10);
        ring1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_5, 0.0F, 3.141592653589793F, 0.0F);
        frontButtonRing2 = new ModelRenderer(this, 26, 0);
        frontButtonRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing2, 0.0F, 0.7853981633974483F, 0.0F);
        leftGuardEdge2 = new ModelRenderer(this, 24, 16);
        leftGuardEdge2.mirror = true;
        leftGuardEdge2.setRotationPoint(-1.0F, -7.0F, 0.0F);
        leftGuardEdge2.addBox(0.0F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        setRotateAngle(leftGuardEdge2, 0.0F, 0.0F, 0.6981317007977318F);
        frontButton1 = new ModelRenderer(this, 0, 21);
        frontButton1.setRotationPoint(0.0F, -3.5F, -3.2F);
        frontButton1.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton1, 1.5707963267948966F, 0.0F, 0.0F);
        frontButtonRing3 = new ModelRenderer(this, 26, 0);
        frontButtonRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing3, 0.0F, 1.5707963267948966F, 0.0F);
        rightGuardEdge4 = new ModelRenderer(this, 20, 17);
        rightGuardEdge4.setRotationPoint(0.0F, -13.0F, 0.0F);
        rightGuardEdge4.addBox(0.0F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        setRotateAngle(rightGuardEdge4, 0.0F, 0.0F, 0.40142572795869574F);
        frontButtonRing4 = new ModelRenderer(this, 26, 0);
        frontButtonRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing4, 0.0F, 2.356194490192345F, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        ring4_2 = new ModelRenderer(this, 0, 18);
        ring4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_2, 0.0F, 0.7853981633974483F, 0.0F);
        ring2_1 = new ModelRenderer(this, 0, 13);
        ring2_1.setRotationPoint(0.0F, -10.2F, 0.0F);
        ring2_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        rightGuard2 = new ModelRenderer(this, 8, 0);
        rightGuard2.setRotationPoint(-1.0F, -2.6F, 0.0F);
        rightGuard2.addBox(-1.0F, -20.0F, -0.5F, 1, 20, 1, 0.0F);
        rightGuardEdge7 = new ModelRenderer(this, 24, 29);
        rightGuardEdge7.setRotationPoint(0.0F, -2.0F, 0.0F);
        rightGuardEdge7.addBox(0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(rightGuardEdge7, 0.0F, 0.0F, 0.41887902047863906F);
        ring4_7 = new ModelRenderer(this, 0, 18);
        ring4_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_7, 0.0F, -1.5707963267948966F, 0.0F);
        leftGuard2 = new ModelRenderer(this, 8, 0);
        leftGuard2.mirror = true;
        leftGuard2.setRotationPoint(1.0F, -2.6F, 0.0F);
        leftGuard2.addBox(0.0F, -20.0F, -0.5F, 1, 20, 1, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.mirror = true;
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        leftGuardEdge3 = new ModelRenderer(this, 16, 17);
        leftGuardEdge3.mirror = true;
        leftGuardEdge3.setRotationPoint(1.0F, -4.0F, 0.0F);
        leftGuardEdge3.addBox(-1.0F, -13.0F, -0.5F, 1, 13, 1, 0.0F);
        setRotateAngle(leftGuardEdge3, 0.0F, 0.0F, -1.0471975511965976F);
        body4 = new ModelRenderer(this, 0, 0);
        body4.mirror = true;
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        ring1_2 = new ModelRenderer(this, 0, 10);
        ring1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_2, 0.0F, 0.7853981633974483F, 0.0F);
        frontButtonRing8 = new ModelRenderer(this, 26, 0);
        frontButtonRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing8, 0.0F, -0.7853981633974483F, 0.0F);
        frontButtonRing5 = new ModelRenderer(this, 26, 0);
        frontButtonRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing5, 0.0F, 3.141592653589793F, 0.0F);
        ring1_1 = new ModelRenderer(this, 0, 10);
        ring1_1.setRotationPoint(0.0F, -9.0F, 0.0F);
        ring1_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        ring4_1 = new ModelRenderer(this, 0, 18);
        ring4_1.setRotationPoint(0.0F, -12.5F, 0.0F);
        ring4_1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        frontButtonRing6 = new ModelRenderer(this, 26, 0);
        frontButtonRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButtonRing6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing6, 0.0F, -2.356194490192345F, 0.0F);
        leftGuard5 = new ModelRenderer(this, 20, 21);
        leftGuard5.mirror = true;
        leftGuard5.setRotationPoint(0.0F, -17.3F, 0.0F);
        leftGuard5.addBox(0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(leftGuard5, 0.0F, 0.0F, 0.7155849933176751F);
        ring3_2 = new ModelRenderer(this, 0, 16);
        ring3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_2, 0.0F, 0.7853981633974483F, 0.0F);
        ring3_3 = new ModelRenderer(this, 0, 16);
        ring3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_3, 0.0F, 1.5707963267948966F, 0.0F);
        ring3_1 = new ModelRenderer(this, 0, 16);
        ring3_1.setRotationPoint(0.0F, -11.9F, 0.0F);
        ring3_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        ring2_6 = new ModelRenderer(this, 0, 13);
        ring2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_6, 0.0F, -2.356194490192345F, 0.0F);
        body6 = new ModelRenderer(this, 0, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        ring3_8 = new ModelRenderer(this, 0, 16);
        ring3_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_8, 0.0F, -0.7853981633974483F, 0.0F);
        ring4_3 = new ModelRenderer(this, 0, 18);
        ring4_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_3, 0.0F, 1.5707963267948966F, 0.0F);
        ring1_8 = new ModelRenderer(this, 0, 10);
        ring1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_8, 0.0F, -0.7853981633974483F, 0.0F);
        leftGuardEdge6 = new ModelRenderer(this, 24, 26);
        leftGuardEdge6.mirror = true;
        leftGuardEdge6.setRotationPoint(0.0F, -2.0F, 0.0F);
        leftGuardEdge6.addBox(-1.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(leftGuardEdge6, 0.0F, 0.0F, -0.33161255787892263F);
        ring2_5 = new ModelRenderer(this, 0, 13);
        ring2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_5, 0.0F, 3.141592653589793F, 0.0F);
        ring2_2 = new ModelRenderer(this, 0, 13);
        ring2_2.mirror = true;
        ring2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_2, 0.0F, 0.7853981633974483F, 0.0F);
        rightGuardEdge6 = new ModelRenderer(this, 24, 26);
        rightGuardEdge6.setRotationPoint(0.0F, -2.0F, 0.0F);
        rightGuardEdge6.addBox(0.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(rightGuardEdge6, 0.0F, 0.0F, 0.33161255787892263F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        body8 = new ModelRenderer(this, 0, 0);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        ring1_4 = new ModelRenderer(this, 0, 10);
        ring1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_4, 0.0F, 2.356194490192345F, 0.0F);
        leftGuardEdge1 = new ModelRenderer(this, 20, 23);
        leftGuardEdge1.mirror = true;
        leftGuardEdge1.setRotationPoint(3.62F, -1.5F, 0.0F);
        leftGuardEdge1.addBox(-1.0F, -7.0F, -0.5F, 1, 7, 1, 0.0F);
        setRotateAngle(leftGuardEdge1, 0.0F, 0.0F, 0.3490658503988659F);
        rightGuardEdge5 = new ModelRenderer(this, 24, 23);
        rightGuardEdge5.setRotationPoint(0.0F, -3.0F, 0.0F);
        rightGuardEdge5.addBox(0.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(rightGuardEdge5, 0.0F, 0.0F, 0.41887902047863906F);
        frontButton7 = new ModelRenderer(this, 0, 21);
        frontButton7.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton7.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton7, 0.0F, -1.5707963267948966F, 0.0F);
        body7 = new ModelRenderer(this, 0, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        ring2_3 = new ModelRenderer(this, 0, 13);
        ring2_3.mirror = true;
        ring2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_3, 0.0F, 1.5707963267948966F, 0.0F);
        leftGuardEdge5 = new ModelRenderer(this, 24, 23);
        leftGuardEdge5.mirror = true;
        leftGuardEdge5.setRotationPoint(0.0F, -3.0F, 0.0F);
        leftGuardEdge5.addBox(-1.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(leftGuardEdge5, 0.0F, 0.0F, -0.41887902047863906F);
        ring1_6 = new ModelRenderer(this, 0, 10);
        ring1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_6, 0.0F, -2.356194490192345F, 0.0F);
        rightGuard5 = new ModelRenderer(this, 20, 21);
        rightGuard5.setRotationPoint(0.0F, -17.3F, 0.0F);
        rightGuard5.addBox(-2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        setRotateAngle(rightGuard5, 0.0F, 0.0F, -0.7155849933176751F);
        ring2_7 = new ModelRenderer(this, 0, 13);
        ring2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_7, 0.0F, -1.5707963267948966F, 0.0F);
        ring1_7 = new ModelRenderer(this, 0, 10);
        ring1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring1_7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring1_7, 0.0F, -1.5707963267948966F, 0.0F);
        frontButton2 = new ModelRenderer(this, 0, 21);
        frontButton2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton2.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton2, 0.0F, 0.7853981633974483F, 0.0F);
        ring3_4 = new ModelRenderer(this, 0, 16);
        ring3_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_4, 0.0F, 2.356194490192345F, 0.0F);
        ring4_8 = new ModelRenderer(this, 0, 18);
        ring4_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_8, 0.0F, -0.7853981633974483F, 0.0F);
        rightGuard3 = new ModelRenderer(this, 16, 0);
        rightGuard3.setRotationPoint(-1.0F, -1.75F, 0.0F);
        rightGuard3.addBox(-2.0F, -16.0F, -0.5F, 2, 16, 1, 0.0F);
        ring2_8 = new ModelRenderer(this, 0, 13);
        ring2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_8, 0.0F, -0.7853981633974483F, 0.0F);
        leftGuard4 = new ModelRenderer(this, 22, 0);
        leftGuard4.mirror = true;
        leftGuard4.setRotationPoint(2.0F, -0.58F, 0.0F);
        leftGuard4.addBox(0.0F, -14.0F, -0.5F, 1, 14, 1, 0.0F);
        frontButton4 = new ModelRenderer(this, 0, 21);
        frontButton4.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton4.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton4, 0.0F, 2.356194490192345F, 0.0F);
        frontButtonRing1 = new ModelRenderer(this, 26, 0);
        frontButtonRing1.setRotationPoint(0.0F, -3.5F, -2.9F);
        frontButtonRing1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        setRotateAngle(frontButtonRing1, 1.5707963267948966F, 0.0F, 0.0F);
        ring3_7 = new ModelRenderer(this, 0, 16);
        ring3_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring3_7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(ring3_7, 0.0F, -1.5707963267948966F, 0.0F);
        ring4_6 = new ModelRenderer(this, 0, 18);
        ring4_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring4_6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring4_6, 0.0F, -2.356194490192345F, 0.0F);
        leftGuardEdge7 = new ModelRenderer(this, 24, 29);
        leftGuardEdge7.mirror = true;
        leftGuardEdge7.setRotationPoint(0.0F, -2.0F, 0.0F);
        leftGuardEdge7.addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(leftGuardEdge7, 0.0F, 0.0F, -0.41887902047863906F);
        ring2_4 = new ModelRenderer(this, 0, 13);
        ring2_4.mirror = true;
        ring2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        ring2_4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(ring2_4, 0.0F, 2.356194490192345F, 0.0F);
        rightGuardEdge3 = new ModelRenderer(this, 16, 17);
        rightGuardEdge3.setRotationPoint(-1.0F, -4.0F, 0.0F);
        rightGuardEdge3.addBox(0.0F, -13.0F, -0.5F, 1, 13, 1, 0.0F);
        setRotateAngle(rightGuardEdge3, 0.0F, 0.0F, 1.0471975511965976F);
        body3 = new ModelRenderer(this, 0, 0);
        body3.mirror = true;
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -9.0F, 2.62F, 3, 9, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        frontButton3 = new ModelRenderer(this, 0, 21);
        frontButton3.setRotationPoint(0.0F, 0.0F, 0.0F);
        frontButton3.addBox(-1.5F, -4.0F, -0.38F, 3, 4, 4, 0.0F);
        setRotateAngle(frontButton3, 0.0F, 1.5707963267948966F, 0.0F);
        rightGuard1 = new ModelRenderer(this, 12, 0);
        rightGuard1.setRotationPoint(-3.62F, -4.4F, 0.0F);
        rightGuard1.addBox(-1.0F, -23.0F, -0.5F, 1, 23, 1, 0.0F);
        rightGuardEdge1 = new ModelRenderer(this, 20, 23);
        rightGuardEdge1.setRotationPoint(-3.62F, -1.5F, 0.0F);
        rightGuardEdge1.addBox(0.0F, -7.0F, -0.5F, 1, 7, 1, 0.0F);
        setRotateAngle(rightGuardEdge1, 0.0F, 0.0F, -0.3490658503988659F);
        leftGuard3 = new ModelRenderer(this, 16, 0);
        leftGuard3.mirror = true;
        leftGuard3.setRotationPoint(1.0F, -1.75F, 0.0F);
        leftGuard3.addBox(0.0F, -16.0F, -0.5F, 2, 16, 1, 0.0F);
        ring3_1.addChild(ring3_5);
        frontButtonRing1.addChild(frontButtonRing7);
        rightGuard3.addChild(rightGuard4);
        rightGuardEdge1.addChild(rightGuardEdge2);
        leftGuardEdge3.addChild(leftGuardEdge4);
        frontButton1.addChild(frontButton6);
        ring4_1.addChild(ring4_4);
        ring1_1.addChild(ring1_3);
        ring3_1.addChild(ring3_6);
        frontButton1.addChild(frontButton8);
        frontButton1.addChild(frontButton5);
        ring4_1.addChild(ring4_5);
        ring1_1.addChild(ring1_5);
        frontButtonRing1.addChild(frontButtonRing2);
        leftGuardEdge1.addChild(leftGuardEdge2);
        frontButtonRing1.addChild(frontButtonRing3);
        rightGuardEdge3.addChild(rightGuardEdge4);
        frontButtonRing1.addChild(frontButtonRing4);
        body1.addChild(body5);
        ring4_1.addChild(ring4_2);
        rightGuard1.addChild(rightGuard2);
        rightGuardEdge6.addChild(rightGuardEdge7);
        ring4_1.addChild(ring4_7);
        leftGuard1.addChild(leftGuard2);
        body1.addChild(body2);
        leftGuardEdge2.addChild(leftGuardEdge3);
        body1.addChild(body4);
        ring1_1.addChild(ring1_2);
        frontButtonRing1.addChild(frontButtonRing8);
        frontButtonRing1.addChild(frontButtonRing5);
        frontButtonRing1.addChild(frontButtonRing6);
        leftGuard3.addChild(leftGuard5);
        ring3_1.addChild(ring3_2);
        ring3_1.addChild(ring3_3);
        ring2_1.addChild(ring2_6);
        body1.addChild(body6);
        ring3_1.addChild(ring3_8);
        ring4_1.addChild(ring4_3);
        ring1_1.addChild(ring1_8);
        leftGuardEdge5.addChild(leftGuardEdge6);
        ring2_1.addChild(ring2_5);
        ring2_1.addChild(ring2_2);
        rightGuardEdge5.addChild(rightGuardEdge6);
        body1.addChild(body8);
        ring1_1.addChild(ring1_4);
        rightGuardEdge4.addChild(rightGuardEdge5);
        frontButton1.addChild(frontButton7);
        body1.addChild(body7);
        ring2_1.addChild(ring2_3);
        leftGuardEdge4.addChild(leftGuardEdge5);
        ring1_1.addChild(ring1_6);
        rightGuard3.addChild(rightGuard5);
        ring2_1.addChild(ring2_7);
        ring1_1.addChild(ring1_7);
        frontButton1.addChild(frontButton2);
        ring3_1.addChild(ring3_4);
        ring4_1.addChild(ring4_8);
        rightGuard2.addChild(rightGuard3);
        ring2_1.addChild(ring2_8);
        leftGuard3.addChild(leftGuard4);
        frontButton1.addChild(frontButton4);
        ring3_1.addChild(ring3_7);
        ring4_1.addChild(ring4_6);
        leftGuardEdge6.addChild(leftGuardEdge7);
        ring2_1.addChild(ring2_4);
        rightGuardEdge2.addChild(rightGuardEdge3);
        body1.addChild(body3);
        frontButton1.addChild(frontButton3);
        leftGuard2.addChild(leftGuard3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glRotatef(90, 0, 1, 0);
        leftGuard1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(frontButton1.offsetX, frontButton1.offsetY, frontButton1.offsetZ);
        GL11.glTranslatef(
            frontButton1.rotationPointX * f5,
            frontButton1.rotationPointY * f5,
            frontButton1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-frontButton1.offsetX, -frontButton1.offsetY, -frontButton1.offsetZ);
        GL11.glTranslatef(
            -frontButton1.rotationPointX * f5,
            -frontButton1.rotationPointY * f5,
            -frontButton1.rotationPointZ * f5);
        frontButton1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(ring2_1.offsetX, ring2_1.offsetY, ring2_1.offsetZ);
        GL11.glTranslatef(ring2_1.rotationPointX * f5, ring2_1.rotationPointY * f5, ring2_1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 1.0D);
        GL11.glTranslatef(-ring2_1.offsetX, -ring2_1.offsetY, -ring2_1.offsetZ);
        GL11.glTranslatef(-ring2_1.rotationPointX * f5, -ring2_1.rotationPointY * f5, -ring2_1.rotationPointZ * f5);
        ring2_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(ring1_1.offsetX, ring1_1.offsetY, ring1_1.offsetZ);
        GL11.glTranslatef(ring1_1.rotationPointX * f5, ring1_1.rotationPointY * f5, ring1_1.rotationPointZ * f5);
        GL11.glScaled(0.8D, 0.8D, 0.73D);
        GL11.glTranslatef(-ring1_1.offsetX, -ring1_1.offsetY, -ring1_1.offsetZ);
        GL11.glTranslatef(-ring1_1.rotationPointX * f5, -ring1_1.rotationPointY * f5, -ring1_1.rotationPointZ * f5);
        ring1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(ring4_1.offsetX, ring4_1.offsetY, ring4_1.offsetZ);
        GL11.glTranslatef(ring4_1.rotationPointX * f5, ring4_1.rotationPointY * f5, ring4_1.rotationPointZ * f5);
        GL11.glScaled(0.6D, 0.6D, 0.6D);
        GL11.glTranslatef(-ring4_1.offsetX, -ring4_1.offsetY, -ring4_1.offsetZ);
        GL11.glTranslatef(-ring4_1.rotationPointX * f5, -ring4_1.rotationPointY * f5, -ring4_1.rotationPointZ * f5);
        ring4_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(ring3_1.offsetX, ring3_1.offsetY, ring3_1.offsetZ);
        GL11.glTranslatef(ring3_1.rotationPointX * f5, ring3_1.rotationPointY * f5, ring3_1.rotationPointZ * f5);
        GL11.glScaled(0.8D, 0.8D, 0.73D);
        GL11.glTranslatef(-ring3_1.offsetX, -ring3_1.offsetY, -ring3_1.offsetZ);
        GL11.glTranslatef(-ring3_1.rotationPointX * f5, -ring3_1.rotationPointY * f5, -ring3_1.rotationPointZ * f5);
        ring3_1.render(f5);
        GL11.glPopMatrix();
        body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(leftGuardEdge1.offsetX, leftGuardEdge1.offsetY, leftGuardEdge1.offsetZ);
        GL11.glTranslatef(
            leftGuardEdge1.rotationPointX * f5,
            leftGuardEdge1.rotationPointY * f5,
            leftGuardEdge1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.2D);
        GL11.glTranslatef(-leftGuardEdge1.offsetX, -leftGuardEdge1.offsetY, -leftGuardEdge1.offsetZ);
        GL11.glTranslatef(
            -leftGuardEdge1.rotationPointX * f5,
            -leftGuardEdge1.rotationPointY * f5,
            -leftGuardEdge1.rotationPointZ * f5);
        leftGuardEdge1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(frontButtonRing1.offsetX, frontButtonRing1.offsetY, frontButtonRing1.offsetZ);
        GL11.glTranslatef(
            frontButtonRing1.rotationPointX * f5,
            frontButtonRing1.rotationPointY * f5,
            frontButtonRing1.rotationPointZ * f5);
        GL11.glScaled(0.38D, 0.38D, 0.38D);
        GL11.glTranslatef(-frontButtonRing1.offsetX, -frontButtonRing1.offsetY, -frontButtonRing1.offsetZ);
        GL11.glTranslatef(
            -frontButtonRing1.rotationPointX * f5,
            -frontButtonRing1.rotationPointY * f5,
            -frontButtonRing1.rotationPointZ * f5);
        frontButtonRing1.render(f5);
        GL11.glPopMatrix();
        rightGuard1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(rightGuardEdge1.offsetX, rightGuardEdge1.offsetY, rightGuardEdge1.offsetZ);
        GL11.glTranslatef(
            rightGuardEdge1.rotationPointX * f5,
            rightGuardEdge1.rotationPointY * f5,
            rightGuardEdge1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.2D);
        GL11.glTranslatef(-rightGuardEdge1.offsetX, -rightGuardEdge1.offsetY, -rightGuardEdge1.offsetZ);
        GL11.glTranslatef(
            -rightGuardEdge1.rotationPointX * f5,
            -rightGuardEdge1.rotationPointY * f5,
            -rightGuardEdge1.rotationPointZ * f5);
        rightGuardEdge1.render(f5);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
