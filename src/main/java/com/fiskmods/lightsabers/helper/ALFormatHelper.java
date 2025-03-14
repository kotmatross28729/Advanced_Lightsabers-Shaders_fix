package com.fiskmods.lightsabers.helper;

import java.util.Locale;

public class ALFormatHelper {

    public static String formatNumber(float f) {
        String s = (long) f + "";

        if (!s.contains("E")) {
            StringBuilder s1 = new StringBuilder();

            for (int i = 0; i < s.length(); ++i) {
                s1.append(s.charAt(i));

                if ((s.length() - i) % 3 == 1) {
                    s1.append(",");
                }
            }

            return s1.substring(0, s1.length() - 1);
        }

        return s;
    }

    public static String getConventionalName(String s) {
        String s1 = s.replace(" ", "")
            .replace("'", "")
            .replace("/", "")
            .replace("\\", "")
            .replace("_", "")
            .replace("-", "")
            .replace("(", "")
            .replace(")", "");
        return s1.substring(0, 1)
            .toLowerCase(Locale.ROOT) + s1.substring(1);
    }

    public static String getUnconventionalName(String s) {
        s = s.toLowerCase(Locale.ROOT);

        for (int i = 0; i < s.length(); ++i) {
            if (i > 0 && s.charAt(i - 1) == '_') {
                s = s.substring(0, i) + s.substring(i, i + 1)
                    .toUpperCase(Locale.ROOT) + s.substring(i + 1);
            }
        }

        s = s.replace(" ", "")
            .replace("'", "")
            .replace("/", "")
            .replace("\\", "")
            .replace("_", "")
            .replace("-", "")
            .replace("(", "")
            .replace(")", "");
        return s.substring(0, 1)
            .toUpperCase(Locale.ROOT) + s.substring(1);
    }
}
