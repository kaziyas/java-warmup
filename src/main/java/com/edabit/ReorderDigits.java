package com.edabit;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 01/April/2023
 * @project java-warmup
 */
public class ReorderDigits {

    public static Object solution(int[] ints, String mode) {
        return Arrays.stream(ints).mapToObj(String::valueOf).mapToInt(e -> {
            Character[] chars = e.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            if (mode.equals("asc")) {
                Arrays.sort(chars);
            } else {
                Arrays.sort(chars, Comparator.reverseOrder());
            }
            String str = Arrays.stream(chars).map(String::valueOf).collect(Collectors.joining());
            return Integer.parseInt(str);
        }).toArray();
    }
}
