package com.edabit;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 22/April/2022
 * @project java-warmup
 */
public class ReverseOdd {
    public static String challenge(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> (s.length() % 2 == 0) ? s : new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
