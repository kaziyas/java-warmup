package com.edabit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 10/April/2022
 * @project java-warmup
 */
public class Matrix {

    public static String transpose(String[][] m) {
        return IntStream.range(0, m[0].length).mapToObj(y -> Arrays.stream(m).map(strings -> strings[y])
                .collect(Collectors.joining(" "))).collect(Collectors.joining(" "));
    }
}
