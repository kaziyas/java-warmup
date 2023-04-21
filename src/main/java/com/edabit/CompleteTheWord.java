package com.edabit;

import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 21/April/2023
 * @project java-warmup
 */
public class CompleteTheWord {
    public static boolean canComplete(String initial, String word) {
        return IntStream.range(0, initial.length() - 1)
                        .allMatch(i ->
                                word.contains(String.valueOf(initial.charAt(i))) &&
                                word.indexOf (initial.charAt(i)) >= i &&
                                word.indexOf (initial.charAt(i)) <
                                word.indexOf (initial.charAt(i + 1)));
    }
}
