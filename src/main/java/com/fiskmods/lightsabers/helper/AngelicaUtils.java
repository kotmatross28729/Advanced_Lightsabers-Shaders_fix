package com.fiskmods.lightsabers.helper;

import net.coderbot.iris.gl.program.Program;

import com.fiskmods.lightsabers.Lightsabers;

public class AngelicaUtils {

    public static void GLUseDefaultProgram() {
        if (Lightsabers.IS_ANGELICA_PRESENT) {
            Program.unbind();
        }
    }
}
