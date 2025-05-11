package com.bleedingtooth.vitupedia.util;

public class Utils {
    /**
     * Assert that a string is not empty.
     * 
     * @param str       The string.
     * @param paramName The name to associate with the string. Used in the output in
     *                  the format of (paramName + " must not be null or empty")
     */
    public static void requireStringNonEmpty(String str, String paramName) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(paramName + " must not be null or empty");
        }
    }
}
