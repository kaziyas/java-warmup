package com.codinggame;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 26/April/2022
 * @project java-warmup
 */
public class ComputeClosestToZero {

    public static void main(String[] args) {
        int[] ts = {-10, -7, -6, -2, 0};
        System.out.println(findClosest(ts));
        int[] ts1 = {-10, -10};
        System.out.println(findClosest(ts1));
        int[] ts2 = {0, 1, 2, 3, 4};
        System.out.println(findClosest(ts2));
        int[] ts3 = {7, 5, 9, 1, 4};
        System.out.println(findClosest(ts3));
        int[] ts4 = {-15, -7, -9, -14, -12};
        System.out.println(findClosest(ts4));
        int[] ts5 = {15, -7, 9, 14, 7, 12};
        System.out.println(findClosest(ts5));
        int[] ts6 = {5276};
        System.out.println(findClosest(ts6));
        int[] ts7 = {-5276};
        System.out.println(findClosest(ts7));
        int[] ts8 = {};
        System.out.println(findClosest(ts8));
    }

    public static int findClosest(int[] ts) {
        return Arrays.stream(ts).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b)).orElse(0);
    }
}
