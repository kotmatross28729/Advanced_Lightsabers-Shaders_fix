package com.fiskmods.lightsabers.helper;

import net.coderbot.iris.gl.program.Program;
import net.irisshaders.iris.api.v0.IrisApi;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import com.fiskmods.lightsabers.Lightsabers;

public class AngelicaUtils {

    public static boolean isShaderEnabled() {
        if (Lightsabers.IS_ANGELICA_PRESENT) {
            return IrisApi.getInstance()
                .isShaderPackInUse();
        }
        return false;
    }

    public static int GLGetCurrentProgram() {
        return GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
    }

    public static void GLUseProgram(int program) {
        GL20.glUseProgram(program);
    }

    public static void GLUseDefaultProgram() {
        if (Lightsabers.IS_ANGELICA_PRESENT) {
            Program.unbind();
        }
    }
}
