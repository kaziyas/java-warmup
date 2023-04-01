package com.edabit;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 01/April/2023
 * @project java-warmup
 */
public class GrowingShrinkingPotions {
    public static String afterPotion(String str) {
        String[] array = str.split("");
        String[] result = array.clone();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "A": {
                    result[i] = "";
                    result[i - 1] = "" + (Integer.parseInt(result[i - 1]) + 1);
                    break;
                }
                case "B": {
                    result[i] = "";
                    result[i - 1] = "" + (Integer.parseInt(result[i - 1]) - 1);
                    break;
                }
            }
        }
        return Arrays.stream(result).collect(Collectors.joining());
    }
}
