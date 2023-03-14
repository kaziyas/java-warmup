package com.edabit;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 14/April/2023
 * @project java-warmup
 */

public class StringIncrementer {

    public static String incrementString(String str) {
        int index = 0;
        for (char ch : str.toCharArray()) {
            if (Math.max(48, ch) == Math.min(57, ch)) {
                index = str.indexOf(ch);
                break;
            }
        }
        if (index == 0) return str + "1";

        String stringPart = str.substring(0, index);
        String numberPart = str.substring(index);

        int value = Integer.parseInt(numberPart);
        String newNumberPart = String.format("%0" + numberPart.length() + "d", value + 1);
        return stringPart + newNumberPart;
    }
}
