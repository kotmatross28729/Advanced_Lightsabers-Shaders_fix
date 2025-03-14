package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelPommelMechanical extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer top1;
    public ModelRenderer body1_1;
    public ModelRenderer top1_1;
    public ModelRenderer body1_2;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer top2;
    public ModelRenderer top3;
    public ModelRenderer top4;
    public ModelRenderer top5;
    public ModelRenderer top6;
    public ModelRenderer top7;
    public ModelRenderer top8;
    public ModelRenderer body2_1;
    public ModelRenderer body3_1;
    public ModelRenderer body4_1;
    public ModelRenderer body5_1;
    public ModelRenderer body6_1;
    public ModelRenderer body7_1;
    public ModelRenderer body8_1;
    public ModelRenderer top2_1;
    public ModelRenderer top3_1;
    public ModelRenderer top4_1;
    public ModelRenderer top5_1;
    public ModelRenderer top6_1;
    public ModelRenderer top7_1;
    public ModelRenderer top8_1;
    public ModelRenderer body2_2;
    public ModelRenderer body3_2;
    public ModelRenderer body4_2;
    public ModelRenderer body5_2;
    public ModelRenderer body6_2;
    public ModelRenderer body7_2;
    public ModelRenderer body8_2;

    public ModelPommelMechanical() {
        textureWidth = 64;
        textureHeight = 32;
        body5_2 = new ModelRenderer(this, 0, 0);
        body5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body5_2, 0.0F, 3.141592653589793F, 0.0F);
        top4_1 = new ModelRenderer(this, 10, 0);
        top4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top4_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top4_1, 0.0F, 2.356194490192345F, 0.0F);
        body4_1 = new ModelRenderer(this, 0, 0);
        body4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body4_1, 0.0F, 2.356194490192345F, 0.0F);
        body8_1 = new ModelRenderer(this, 0, 0);
        body8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body8_1, 0.0F, -0.7853981633974483F, 0.0F);
        body6_1 = new ModelRenderer(this, 0, 0);
        body6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body6_1, 0.0F, -2.356194490192345F, 0.0F);
        top3_1 = new ModelRenderer(this, 10, 0);
        top3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top3_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top3_1, 0.0F, 1.5707963267948966F, 0.0F);
        body7_2 = new ModelRenderer(this, 0, 0);
        body7_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body7_2, 0.0F, -1.5707963267948966F, 0.0F);
        body1_1 = new ModelRenderer(this, 0, 0);
        body1_1.setRotationPoint(0.0F, 2.0F, 0.0F);
        body1_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        top6 = new ModelRenderer(this, 10, 0);
        top6.setRotationPoint(0.0F, 0.0F, 0.0F);
        top6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top6, 0.0F, -2.356194490192345F, 0.0F);
        top3 = new ModelRenderer(this, 10, 0);
        top3.setRotationPoint(0.0F, 0.0F, 0.0F);
        top3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top3, 0.0F, 1.5707963267948966F, 0.0F);
        body4 = new ModelRenderer(this, 0, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        body8 = new ModelRenderer(this, 0, 0);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        top2 = new ModelRenderer(this, 10, 0);
        top2.setRotationPoint(0.0F, 0.0F, 0.0F);
        top2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top2, 0.0F, 0.7853981633974483F, 0.0F);
        top7 = new ModelRenderer(this, 10, 0);
        top7.setRotationPoint(0.0F, 0.0F, 0.0F);
        top7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top7, 0.0F, -1.5707963267948966F, 0.0F);
        body1_2 = new ModelRenderer(this, 0, 0);
        body1_2.setRotationPoint(0.0F, 1.0F, 0.0F);
        body1_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        body3_1 = new ModelRenderer(this, 0, 0);
        body3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body3_1, 0.0F, 1.5707963267948966F, 0.0F);
        body8_2 = new ModelRenderer(this, 0, 0);
        body8_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body8_2, 0.0F, -0.7853981633974483F, 0.0F);
        top6_1 = new ModelRenderer(this, 10, 0);
        top6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top6_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top6_1, 0.0F, -2.356194490192345F, 0.0F);
        top1_1 = new ModelRenderer(this, 10, 0);
        top1_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        top1_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        body2_2 = new ModelRenderer(this, 0, 0);
        body2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body2_2, 0.0F, 0.7853981633974483F, 0.0F);
        top5 = new ModelRenderer(this, 10, 0);
        top5.setRotationPoint(0.0F, 0.0F, 0.0F);
        top5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top5, 0.0F, 3.141592653589793F, 0.0F);
        top8 = new ModelRenderer(this, 10, 0);
        top8.setRotationPoint(0.0F, 0.0F, 0.0F);
        top8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top8, 0.0F, -0.7853981633974483F, 0.0F);
        body3 = new ModelRenderer(this, 0, 0);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        body7_1 = new ModelRenderer(this, 0, 0);
        body7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body7_1, 0.0F, -1.5707963267948966F, 0.0F);
        top8_1 = new ModelRenderer(this, 10, 0);
        top8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top8_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top8_1, 0.0F, -0.7853981633974483F, 0.0F);
        top5_1 = new ModelRenderer(this, 10, 0);
        top5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top5_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top5_1, 0.0F, 3.141592653589793F, 0.0F);
        body4_2 = new ModelRenderer(this, 0, 0);
        body4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body4_2, 0.0F, 2.356194490192345F, 0.0F);
        top4 = new ModelRenderer(this, 10, 0);
        top4.setRotationPoint(0.0F, 0.0F, 0.0F);
        top4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top4, 0.0F, 2.356194490192345F, 0.0F);
        body5_1 = new ModelRenderer(this, 0, 0);
        body5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body5_1, 0.0F, 3.141592653589793F, 0.0F);
        body6_2 = new ModelRenderer(this, 0, 0);
        body6_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body6_2, 0.0F, -2.356194490192345F, 0.0F);
        top7_1 = new ModelRenderer(this, 10, 0);
        top7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top7_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top7_1, 0.0F, -1.5707963267948966F, 0.0F);
        body2_1 = new ModelRenderer(this, 0, 0);
        body2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2_1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body2_1, 0.0F, 0.7853981633974483F, 0.0F);
        top1 = new ModelRenderer(this, 10, 0);
        top1.setRotationPoint(0.0F, 2.0F, 0.0F);
        top1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        top2_1 = new ModelRenderer(this, 10, 0);
        top2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top2_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top2_1, 0.0F, 0.7853981633974483F, 0.0F);
        body6 = new ModelRenderer(this, 0, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        body7 = new ModelRenderer(this, 0, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        body3_2 = new ModelRenderer(this, 0, 0);
        body3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3_2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(body3_2, 0.0F, 1.5707963267948966F, 0.0F);
        body1_2.addChild(body5_2);
        top1_1.addChild(top4_1);
        body1_1.addChild(body4_1);
        body1_1.addChild(body8_1);
        body1_1.addChild(body6_1);
        top1_1.addChild(top3_1);
        body1_2.addChild(body7_2);
        body1.addChild(body5);
        top1.addChild(top6);
        top1.addChild(top3);
        body1.addChild(body4);
        body1.addChild(body8);
        top1.addChild(top2);
        top1.addChild(top7);
        body1_1.addChild(body3_1);
        body1_2.addChild(body8_2);
        top1_1.addChild(top6_1);
        body1_2.addChild(body2_2);
        top1.addChild(top5);
        top1.addChild(top8);
        body1.addChild(body3);
        body1_1.addChild(body7_1);
        top1_1.addChild(top8_1);
        top1_1.addChild(top5_1);
        body1_2.addChild(body4_2);
        top1.addChild(top4);
        body1_1.addChild(body5_1);
        body1_2.addChild(body6_2);
        top1_1.addChild(top7_1);
        body1_1.addChild(body2_1);
        body1.addChild(body2);
        top1_1.addChild(top2_1);
        body1.addChild(body6);
        body1.addChild(body7);
        body1_2.addChild(body3_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(body1_1.offsetX, body1_1.offsetY, body1_1.offsetZ);
        GL11.glTranslatef(body1_1.rotationPointX * f5, body1_1.rotationPointY * f5, body1_1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.5D, 1.0D);
        GL11.glTranslatef(-body1_1.offsetX, -body1_1.offsetY, -body1_1.offsetZ);
        GL11.glTranslatef(-body1_1.rotationPointX * f5, -body1_1.rotationPointY * f5, -body1_1.rotationPointZ * f5);
        body1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(body1_2.offsetX, body1_2.offsetY, body1_2.offsetZ);
        GL11.glTranslatef(body1_2.rotationPointX * f5, body1_2.rotationPointY * f5, body1_2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.5D, 1.0D);
        GL11.glTranslatef(-body1_2.offsetX, -body1_2.offsetY, -body1_2.offsetZ);
        GL11.glTranslatef(-body1_2.rotationPointX * f5, -body1_2.rotationPointY * f5, -body1_2.rotationPointZ * f5);
        body1_2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(top1_1.offsetX, top1_1.offsetY, top1_1.offsetZ);
        GL11.glTranslatef(top1_1.rotationPointX * f5, top1_1.rotationPointY * f5, top1_1.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 0.8D);
        GL11.glTranslatef(-top1_1.offsetX, -top1_1.offsetY, -top1_1.offsetZ);
        GL11.glTranslatef(-top1_1.rotationPointX * f5, -top1_1.rotationPointY * f5, -top1_1.rotationPointZ * f5);
        top1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(top1.offsetX, top1.offsetY, top1.offsetZ);
        GL11.glTranslatef(top1.rotationPointX * f5, top1.rotationPointY * f5, top1.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 0.8D);
        GL11.glTranslatef(-top1.offsetX, -top1.offsetY, -top1.offsetZ);
        GL11.glTranslatef(-top1.rotationPointX * f5, -top1.rotationPointY * f5, -top1.rotationPointZ * f5);
        top1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(body1.offsetX, body1.offsetY, body1.offsetZ);
        GL11.glTranslatef(body1.rotationPointX * f5, body1.rotationPointY * f5, body1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.5D, 1.0D);
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
