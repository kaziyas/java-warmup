package com.edabit;

import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 22/March/2022
 * @project java-warmup
 */
public class Abbreviated {
    public static boolean uniquely(String[] a, String[] w) {
        return IntStream.range(1,a.length)
                .noneMatch(i -> a[i].startsWith(a[i-1]))
                && IntStream.range(0, w.length)
                .allMatch(i -> w[i].startsWith(a[i]));
    }

}
