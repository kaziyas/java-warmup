package com.edabit;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 02/April/2023
 * @project java-warmup
 */
public class Stretches {
    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.range(0, numbers.length - 1).map(i -> numbers[i + 1] - numbers[i]).max().getAsInt();
    }
}
