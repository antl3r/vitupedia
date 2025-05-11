package com.bleedingtooth.vitupedia.util;

public class Utils {
    public static void requireStringNonEmpty(String str, String paramName) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(paramName + " must not be null or empty");
        }
    }
}
