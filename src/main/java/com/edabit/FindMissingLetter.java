package com.edabit;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 01/May/2023
 * @project java-warmup
 */
public class FindMissingLetter {

    public static String missingLetter(String[] arr) {
        char[] chars = String.join("", arr).toCharArray();
        int distance = IntStream.range(1, chars.length).filter(i -> chars[i] - chars[i - 1] > 1).max().getAsInt();
        return String.valueOf((char)(chars[0] + distance));
    }
}
