package com.edabit;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 02/April/2023
 * @project java-warmup
 */
public class ConsecutiveNumbers {
    public static boolean cons(int[] ints) {
        Arrays.sort(ints);
        return IntStream.iterate(ints.length - 1, i -> i > 0, i -> i - 1).allMatch(i -> ints[i] - ints[i - 1] == 1);
    }
}
