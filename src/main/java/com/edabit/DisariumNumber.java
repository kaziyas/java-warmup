package com.edabit;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 23/March/2022
 * @project java-warmup
 */
public class DisariumNumber {
    public static boolean isDisarium(int n) {
        final char[] chars = String.valueOf(n).toCharArray();
        return IntStream.range(0, chars.length)
                .mapToLong(
                        index -> {
                            int base = Integer.parseInt(String.valueOf(chars[index]));
                            return BigInteger.valueOf(base).pow(index + 1).intValue();
                        })
                .sum() == n;
    }
}
