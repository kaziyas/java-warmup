package com.edabit;

import java.util.Arrays;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 19/March/2023
 * @project java-warmup
 */
public class SevenBoom {

    public static String solution(int[] arr) {
        return Arrays.toString(arr).contains("7")? "Boom!" : "there is no 7 in the array";
    }
}
