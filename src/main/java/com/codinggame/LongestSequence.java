package com.codinggame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 24/April/2022
 * @project java-warmup
 *
 * Given some bitstring b, you may change one bit from a 0 to a 1 in order to create the longest possible sequence of consecutive 1s.
 * Output the length of the resulting longest sequence.
 *
 * Example: 11011101111
 * Flipping the second 0 results in 11011111111, where the longest sequence of 1s is 8 long.
 *
 * Example: 01110100110011000101001100011110010010101011111011 (8) || 10000000011100000000011111000001 (6) || 00010111111001000101011111111010 (10) || 00 (1)
 */

public class LongestSequence {

    private static final String ZERO = "0";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sequence = in.nextLine();
        int max = getMax(sequence);
        System.out.println(max);
    }

    //Without Stream APIs
    public static int getMax(String sequence) {
        int max = 0;
        final List<String> list = Arrays.asList(sequence.split(ZERO));
        for (int i = 0; i < list.size() - 1; i++)
            max = Math.max(max, list.get(i).concat(list.get(i + 1)).length());
        return max + 1;
    }

    /*With Stream APIs*/
    public static int getMax2(String sequence) {
        int max = 0;
        int[] list = Arrays.stream(sequence.split(ZERO)).mapToInt(String::length).toArray();
        int prev = 0;
        for (int i : list) {
            max = Math.max(max, i + prev);
            prev = i;
        }
        return max + 1;
    }
}