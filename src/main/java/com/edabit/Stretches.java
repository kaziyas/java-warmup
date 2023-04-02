package com.edabit;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 02/April/2023
 * @project java-warmup
 */
public class Stretches {
    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.iterate(numbers.length - 1, i -> i > 0, i -> i - 1).mapToObj(i -> numbers[i] - numbers[i - 1]).mapToInt(e -> e).max().getAsInt();
    }
}
