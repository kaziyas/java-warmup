package com.edabit;

import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 24/March/2022
 * @project java-warmup
 */
public class BuildingUpAWord {
    public static boolean canBuild(String[] arr) {
        return IntStream.range(1, arr.length).allMatch(i -> arr[i].contains(arr[i - 1]) && arr[i].length() == arr[i - 1].length() + 1);
    }
}
