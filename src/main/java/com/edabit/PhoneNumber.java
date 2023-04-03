package com.edabit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 03/April/2023
 * @project java-warmup
 */
public class PhoneNumber {
    public static String textToNum(String phone) {
        StringBuilder result = new StringBuilder();
        IntStream.rangeClosed(0, phone.length() - 1).mapToObj(i -> String.valueOf(phone.charAt(i))).forEach(ch -> {
            if ("ABC".contains(ch))
                result.append("2");
            else if ("DEF".contains(ch))
                result.append("3");
            else if ("GHI".contains(ch))
                result.append("4");
            else if ("JKL".contains(ch))
                result.append("5");
            else if ("MNO".contains(ch))
                result.append("6");
            else if ("PQRS".contains(ch))
                result.append("7");
            else if ("TUV".contains(ch))
                result.append("8");
            else if ("WXYZ".contains(ch))
                result.append("9");
            else
                result.append(ch);
        });
        return result.toString();
    }
}
