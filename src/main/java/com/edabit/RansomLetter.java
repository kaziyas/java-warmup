package com.edabit;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 21/April/2022
 * @project java-warmup
 */
public class RansomLetter {
    public static boolean canBuild(String str1, String str2) {
        return str1.length() >= str2.length()
                && str2.chars().allMatch(c -> str1.contains((char) c + ""));
    }
}
