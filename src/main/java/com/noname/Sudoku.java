package com.noname;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/April/2022
 * @project java-warmup
 */
public class Sudoku {
    /** This array contains a valid sudoku solution */
    public static final int[][] VALID = {
            // @formatter:off
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
            // @formatter:on
    };
    /** This array contains an invalid sudoku solution */
    public static final int[][] INVALID = {
            // @formatter:off
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 1, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
            // @formatter:on
    };

    /** @return true if the argument {@code a} contains a valid sudoku solution; false otherwise */
    public static boolean isValidSudoku(int[][] a) {
        for (int j = 0; j < 9; j++) {
            final List<Integer> row = IntStream.of(a[j]).boxed().collect(Collectors.toList());
            for (int i = 1; i < 9; i++) {
                if (Collections.frequency(row, (i)) > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
