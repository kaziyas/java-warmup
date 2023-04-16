package com.edabit;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 16/April/2023
 * @project java-warmup
 */
public class RemoveRepeats {
    public static String unrepeated(String str) {
        return Stream.of(str.split(""))
                .distinct()
                .collect(Collectors.joining(""));
    }
}
