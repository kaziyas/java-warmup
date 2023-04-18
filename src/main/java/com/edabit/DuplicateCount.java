package com.edabit;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/April/2023
 * @project java-warmup
 */
public class DuplicateCount {
    public static int solution(String str) {
        return (int) str.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count > 1)
                .count();
    }
}
