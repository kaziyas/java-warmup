package com.edabit;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 03/April/2023
 * @project java-warmup
 */
public class SelectLetters {


    public static String solution(String s1, String s2) {
        // selectLetters("EVERYTHING", "SomeThings") ➞  "EYSomeThings"
        int length = s1.length() > s2.length() ? s2.length() : s1.length();
        String result = IntStream.range(0, length)
                .mapToObj(i -> Character.isUpperCase(s2.charAt(i)) ? s1.charAt(i) : "")
                .map(e -> String.valueOf(e)).collect(Collectors.joining());
        String result1 = IntStream.range(0, length)
                .mapToObj(i -> Character.isUpperCase(s1.charAt(i)) ? s2.charAt(i) : "")
                .map(e -> String.valueOf(e)).collect(Collectors.joining());
        return String.format("%s%s", result, result1);
    }
}
