package com.edabit;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 01/April/2023
 * @project java-warmup
 */
public class GrowingShrinkingPotions {
    public static String afterPotion(String str) {
        String[] array = str.split("");
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "A": {
                    array[i - 1] = String.valueOf(Integer.parseInt(array[i - 1]) + 1);
                    break;
                }
                case "B": {
                    array[i - 1] = String.valueOf(Integer.parseInt(array[i - 1]) - 1);
                    break;
                }
                default: {
                    if (array[i].matches("[C-Z]||[a-z]")) {
                        throw new IllegalStateException("Unexpected value: " + array[i]);
                    }
                }
            }
        }
        return String.join("", array).replaceAll("A","").replaceAll("B", "");
    }
}
