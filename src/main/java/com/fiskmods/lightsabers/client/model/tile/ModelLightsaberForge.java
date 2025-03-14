package com.fiskmods.lightsabers.client.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

public class ModelLightsaberForge extends ModelBase {

    public ModelRenderer monitorMain;
    public ModelRenderer hammer;
    public ModelRenderer screwdriver;
    public ModelRenderer welderMain;
    public ModelRenderer wrench;
    public ModelRenderer toolbox;
    public ModelRenderer lightsaberStand;
    public ModelRenderer workbench;
    public ModelRenderer monitorStand;
    public ModelRenderer monitorTrimLeft;
    public ModelRenderer monitorTrimRight;
    public ModelRenderer monitorTrimTop;
    public ModelRenderer monitorTrimBottom;
    public ModelRenderer hammerHead;
    public ModelRenderer welderPipe1;
    public ModelRenderer welderPipe2;
    public ModelRenderer welderPipe;
    public ModelRenderer welderTip;
    public ModelRenderer wrenchRight1;
    public ModelRenderer wrenchLeft1;
    public ModelRenderer wrenchRight2;
    public ModelRenderer wrenchLeft2;
    public ModelRenderer toolboxHandle1;
    public ModelRenderer toolboxLock;
    public ModelRenderer toolboxHandle2;
    public ModelRenderer toolboxHandle3;
    public ModelRenderer lightsaberStandLeft;
    public ModelRenderer lightsaberStandRight;
    public ModelRenderer workbenchPillar1;
    public ModelRenderer workbenchPillar2;
    public ModelRenderer workbenchPillar3;
    public ModelRenderer workbenchPillar4;
    public ModelRenderer workbenchPillar5;
    public ModelRenderer workbenchPillar6;
    public ModelRenderer workbenchTop;
    public ModelRenderer workbenchFrontSideAngle;
    public ModelRenderer leftSiding;
    public ModelRenderer rightSiding;
    public ModelRenderer backSiding;
    public ModelRenderer trimFront;
    public ModelRenderer trimBack;
    public ModelRenderer trimLeft;
    public ModelRenderer trimRight;

    public ModelLightsaberForge() {
        textureWidth = 128;
        textureHeight = 96;
        rightSiding = new ModelRenderer(this, 0, 33);
        rightSiding.setRotationPoint(31.0F, -10.0F, 4.0F);
        rightSiding.addBox(0.0F, 0.0F, 0.0F, 1, 10, 11, 0.0F);
        welderPipe1 = new ModelRenderer(this, 0, 35);
        welderPipe1.setRotationPoint(0.6F, 1.0F, 5.0F);
        welderPipe1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        wrenchRight2 = new ModelRenderer(this, 0, 72);
        wrenchRight2.setRotationPoint(2.0F, 0.0F, 0.0F);
        wrenchRight2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        setRotateAngle(wrenchRight2, 0.0F, -0.7853981633974483F, 0.0F);
        hammerHead = new ModelRenderer(this, 0, 62);
        hammerHead.setRotationPoint(-1.0F, 0.0F, 5.0F);
        hammerHead.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        trimLeft = new ModelRenderer(this, 0, 60);
        trimLeft.setRotationPoint(-0.5F, -11.5F, 0.5F);
        trimLeft.addBox(0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F);
        toolbox = new ModelRenderer(this, 53, 61);
        toolbox.setRotationPoint(-6.0F, 9.0F, 2.0F);
        toolbox.addBox(0.0F, 0.0F, 0.0F, 7, 3, 3, 0.0F);
        setRotateAngle(toolbox, 0.0F, -0.2617993877991494F, 0.0F);
        welderPipe = new ModelRenderer(this, 24, 19);
        welderPipe.setRotationPoint(-6.0F, 0.0F, 4.0F);
        welderPipe.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        workbenchPillar6 = new ModelRenderer(this, 0, 17);
        workbenchPillar6.setRotationPoint(10.0F, -10.0F, 0.0F);
        workbenchPillar6.addBox(0.0F, 0.0F, 0.0F, 2, 10, 4, 0.0F);
        wrenchRight1 = new ModelRenderer(this, 0, 41);
        wrenchRight1.setRotationPoint(0.0F, 0.0F, 6.0F);
        wrenchRight1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        setRotateAngle(wrenchRight1, 0.0F, -0.7853981633974483F, 0.0F);
        toolboxHandle2 = new ModelRenderer(this, 8, 12);
        toolboxHandle2.setRotationPoint(3.0F, 0.0F, 0.0F);
        toolboxHandle2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        trimBack = new ModelRenderer(this, 0, 58);
        trimBack.setRotationPoint(-0.5F, -11.5F, 15.5F);
        trimBack.addBox(0.0F, 0.0F, 0.0F, 33, 1, 1, 0.0F);
        welderPipe2 = new ModelRenderer(this, 32, 64);
        welderPipe2.setRotationPoint(0.25F, 0.0F, 3.3F);
        welderPipe2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        setRotateAngle(welderPipe2, 0.0F, -0.7504915783575618F, 0.0F);
        welderTip = new ModelRenderer(this, 2, 12);
        welderTip.setRotationPoint(0.0F, 0.0F, -1.0F);
        welderTip.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        workbenchPillar1 = new ModelRenderer(this, 0, 17);
        workbenchPillar1.setRotationPoint(0.0F, -10.0F, 0.0F);
        workbenchPillar1.addBox(0.0F, 0.0F, 0.0F, 2, 10, 4, 0.0F);
        workbench = new ModelRenderer(this, 32, 0);
        workbench.setRotationPoint(-8.0F, 23.0F, -8.0F);
        workbench.addBox(0.0F, 0.0F, 0.0F, 32, 1, 16, 0.0F);
        workbenchPillar5 = new ModelRenderer(this, 0, 17);
        workbenchPillar5.setRotationPoint(20.0F, -10.0F, 0.0F);
        workbenchPillar5.addBox(0.0F, 0.0F, 0.0F, 2, 10, 4, 0.0F);
        workbenchPillar3 = new ModelRenderer(this, 0, 0);
        workbenchPillar3.setRotationPoint(30.0F, -10.0F, 15.0F);
        workbenchPillar3.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        hammer = new ModelRenderer(this, 0, 65);
        hammer.setRotationPoint(-4.0F, 11.3F, -3.0F);
        hammer.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        setRotateAngle(hammer, 0.0F, 0.6632251157578453F, 0.0F);
        monitorStand = new ModelRenderer(this, 15, 30);
        monitorStand.setRotationPoint(1.0F, 9.7F, -1.0F);
        monitorStand.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        toolboxHandle1 = new ModelRenderer(this, 8, 12);
        toolboxHandle1.setRotationPoint(1.5F, -1.0F, 1.0F);
        toolboxHandle1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        wrench = new ModelRenderer(this, 41, 62);
        wrench.setRotationPoint(22.0F, 11.3F, 2.0F);
        wrench.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        setRotateAngle(wrench, 0.0F, -1.0995574287564276F, 0.0F);
        toolboxLock = new ModelRenderer(this, 7, 0);
        toolboxLock.setRotationPoint(3.0F, 0.5F, -0.2F);
        toolboxLock.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        workbenchTop = new ModelRenderer(this, 32, 17);
        workbenchTop.setRotationPoint(0.0F, -11.0F, 0.0F);
        workbenchTop.addBox(0.0F, 0.0F, 0.0F, 32, 1, 16, 0.0F);
        trimRight = new ModelRenderer(this, 0, 60);
        trimRight.setRotationPoint(31.5F, -11.5F, 0.5F);
        trimRight.addBox(0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F);
        monitorTrimTop = new ModelRenderer(this, 15, 25);
        monitorTrimTop.setRotationPoint(0.0F, -1.0F, -1.0F);
        monitorTrimTop.addBox(0.0F, 0.0F, 0.0F, 14, 1, 2, 0.0F);
        toolboxHandle3 = new ModelRenderer(this, 25, 37);
        toolboxHandle3.setRotationPoint(-3.0F, -0.7F, 0.0F);
        toolboxHandle3.addBox(0.0F, -0.0F, 0.0F, 4, 1, 1, 0.0F);
        screwdriver = new ModelRenderer(this, 19, 62);
        screwdriver.setRotationPoint(0.0F, 11.3F, -3.0F);
        screwdriver.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        setRotateAngle(screwdriver, 0.0F, 1.0995574287564276F, 0.0F);
        wrenchLeft2 = new ModelRenderer(this, 0, 72);
        wrenchLeft2.mirror = true;
        wrenchLeft2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        wrenchLeft2.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        setRotateAngle(wrenchLeft2, 0.0F, 0.7853981633974483F, 0.0F);
        lightsaberStandRight = new ModelRenderer(this, 73, 58);
        lightsaberStandRight.mirror = true;
        lightsaberStandRight.setRotationPoint(6.0F, 0.0F, 0.0F);
        lightsaberStandRight.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        setRotateAngle(lightsaberStandRight, 0.0F, 0.0F, 0.7853981633974483F);
        workbenchPillar2 = new ModelRenderer(this, 0, 17);
        workbenchPillar2.setRotationPoint(30.0F, -10.0F, 0.0F);
        workbenchPillar2.addBox(0.0F, 0.0F, 0.0F, 2, 10, 4, 0.0F);
        lightsaberStand = new ModelRenderer(this, 73, 58);
        lightsaberStand.setRotationPoint(5.5F, 10.5F, 0.0F);
        lightsaberStand.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        monitorTrimBottom = new ModelRenderer(this, 15, 25);
        monitorTrimBottom.setRotationPoint(0.0F, 9.0F, -1.0F);
        monitorTrimBottom.addBox(0.0F, 0.0F, 0.0F, 14, 1, 2, 0.0F);
        workbenchPillar4 = new ModelRenderer(this, 0, 0);
        workbenchPillar4.setRotationPoint(0.0F, -10.0F, 15.0F);
        workbenchPillar4.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        workbenchFrontSideAngle = new ModelRenderer(this, 38, 34);
        workbenchFrontSideAngle.setRotationPoint(0.5F, -10.5F, 1.0F);
        workbenchFrontSideAngle.addBox(0.0F, 0.0F, 0.0F, 31, 1, 11, 0.0F);
        setRotateAngle(workbenchFrontSideAngle, -1.2217304763960306F, 0.0F, 0.0F);
        backSiding = new ModelRenderer(this, 51, 46);
        backSiding.setRotationPoint(2.0F, -10.0F, 15.0F);
        backSiding.addBox(0.0F, 0.0F, 0.0F, 28, 10, 1, 0.0F);
        trimFront = new ModelRenderer(this, 0, 58);
        trimFront.setRotationPoint(-0.5F, -11.5F, -0.5F);
        trimFront.addBox(0.0F, 0.0F, 0.0F, 33, 1, 1, 0.0F);
        welderMain = new ModelRenderer(this, 26, 47);
        welderMain.setRotationPoint(20.0F, 10.6F, -5.0F);
        welderMain.addBox(0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F);
        setRotateAngle(welderMain, 0.0F, -0.5585053606381855F, 0.0F);
        monitorTrimLeft = new ModelRenderer(this, 15, 11);
        monitorTrimLeft.setRotationPoint(0.0F, 0.0F, -1.0F);
        monitorTrimLeft.addBox(0.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F);
        wrenchLeft1 = new ModelRenderer(this, 0, 41);
        wrenchLeft1.mirror = true;
        wrenchLeft1.setRotationPoint(-1.0F, 0.0F, 6.0F);
        wrenchLeft1.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        setRotateAngle(wrenchLeft1, 0.0F, 0.7853981633974483F, 0.0F);
        leftSiding = new ModelRenderer(this, 0, 33);
        leftSiding.setRotationPoint(0.0F, -10.0F, 4.0F);
        leftSiding.addBox(0.0F, 0.0F, 0.0F, 1, 10, 11, 0.0F);
        monitorMain = new ModelRenderer(this, 14, 0);
        monitorMain.setRotationPoint(-3.0F, 2.2F, 7.0F);
        monitorMain.addBox(1.0F, 0.0F, 0.0F, 12, 9, 1, 0.0F);
        monitorTrimRight = new ModelRenderer(this, 15, 11);
        monitorTrimRight.setRotationPoint(13.0F, 0.0F, -1.0F);
        monitorTrimRight.addBox(0.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F);
        lightsaberStandLeft = new ModelRenderer(this, 73, 58);
        lightsaberStandLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        lightsaberStandLeft.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        setRotateAngle(lightsaberStandLeft, 0.0F, 0.0F, -0.7853981633974483F);
        workbench.addChild(rightSiding);
        welderMain.addChild(welderPipe1);
        wrenchRight1.addChild(wrenchRight2);
        hammer.addChild(hammerHead);
        workbench.addChild(trimLeft);
        welderPipe2.addChild(welderPipe);
        workbench.addChild(workbenchPillar6);
        wrench.addChild(wrenchRight1);
        toolboxHandle1.addChild(toolboxHandle2);
        workbench.addChild(trimBack);
        welderPipe1.addChild(welderPipe2);
        welderPipe.addChild(welderTip);
        workbench.addChild(workbenchPillar1);
        workbench.addChild(workbenchPillar5);
        workbench.addChild(workbenchPillar3);
        monitorMain.addChild(monitorStand);
        toolbox.addChild(toolboxHandle1);
        toolbox.addChild(toolboxLock);
        workbench.addChild(workbenchTop);
        workbench.addChild(trimRight);
        monitorMain.addChild(monitorTrimTop);
        toolboxHandle2.addChild(toolboxHandle3);
        wrenchLeft1.addChild(wrenchLeft2);
        lightsaberStand.addChild(lightsaberStandRight);
        workbench.addChild(workbenchPillar2);
        monitorMain.addChild(monitorTrimBottom);
        workbench.addChild(workbenchPillar4);
        workbench.addChild(workbenchFrontSideAngle);
        workbench.addChild(backSiding);
        workbench.addChild(trimFront);
        monitorMain.addChild(monitorTrimLeft);
        wrench.addChild(wrenchLeft1);
        workbench.addChild(leftSiding);
        monitorMain.addChild(monitorTrimRight);
        lightsaberStand.addChild(lightsaberStandLeft);
    }

    public void render() {
        toolbox.render(0.0625F);
        workbench.render(0.0625F);
        GL11.glPushMatrix();
        GL11.glTranslatef(hammer.offsetX, hammer.offsetY, hammer.offsetZ);
        GL11.glTranslatef(
            hammer.rotationPointX * 0.0625F,
            hammer.rotationPointY * 0.0625F,
            hammer.rotationPointZ * 0.0625F);
        GL11.glScaled(0.7D, 0.7D, 0.7D);
        GL11.glTranslatef(-hammer.offsetX, -hammer.offsetY, -hammer.offsetZ);
        GL11.glTranslatef(
            -hammer.rotationPointX * 0.0625F,
            -hammer.rotationPointY * 0.0625F,
            -hammer.rotationPointZ * 0.0625F);
        hammer.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(wrench.offsetX, wrench.offsetY, wrench.offsetZ);
        GL11.glTranslatef(
            wrench.rotationPointX * 0.0625F,
            wrench.rotationPointY * 0.0625F,
            wrench.rotationPointZ * 0.0625F);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-wrench.offsetX, -wrench.offsetY, -wrench.offsetZ);
        GL11.glTranslatef(
            -wrench.rotationPointX * 0.0625F,
            -wrench.rotationPointY * 0.0625F,
            -wrench.rotationPointZ * 0.0625F);
        wrench.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(screwdriver.offsetX, screwdriver.offsetY, screwdriver.offsetZ);
        GL11.glTranslatef(
            screwdriver.rotationPointX * 0.0625F,
            screwdriver.rotationPointY * 0.0625F,
            screwdriver.rotationPointZ * 0.0625F);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-screwdriver.offsetX, -screwdriver.offsetY, -screwdriver.offsetZ);
        GL11.glTranslatef(
            -screwdriver.rotationPointX * 0.0625F,
            -screwdriver.rotationPointY * 0.0625F,
            -screwdriver.rotationPointZ * 0.0625F);
        screwdriver.render(0.0625F);
        GL11.glPopMatrix();
        lightsaberStand.render(0.0625F);
        GL11.glPushMatrix();
        GL11.glTranslatef(welderMain.offsetX, welderMain.offsetY, welderMain.offsetZ);
        GL11.glTranslatef(
            welderMain.rotationPointX * 0.0625F,
            welderMain.rotationPointY * 0.0625F,
            welderMain.rotationPointZ * 0.0625F);
        GL11.glScaled(0.7D, 0.7D, 0.7D);
        GL11.glTranslatef(-welderMain.offsetX, -welderMain.offsetY, -welderMain.offsetZ);
        GL11.glTranslatef(
            -welderMain.rotationPointX * 0.0625F,
            -welderMain.rotationPointY * 0.0625F,
            -welderMain.rotationPointZ * 0.0625F);
        welderMain.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(monitorMain.offsetX, monitorMain.offsetY, monitorMain.offsetZ);
        GL11.glTranslatef(
            monitorMain.rotationPointX * 0.0625F,
            monitorMain.rotationPointY * 0.0625F,
            monitorMain.rotationPointZ * 0.0625F);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-monitorMain.offsetX, -monitorMain.offsetY, -monitorMain.offsetZ);
        GL11.glTranslatef(
            -monitorMain.rotationPointX * 0.0625F,
            -monitorMain.rotationPointY * 0.0625F,
            -monitorMain.rotationPointZ * 0.0625F);
        monitorMain.render(0.0625F);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
