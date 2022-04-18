package com.edabit;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/April/2022
 * @project java-warmup
 */
public class Unmix {
    public static String challenge(String str) {
        return str.replaceAll("(.)(.)", "$2$1");
    }
}