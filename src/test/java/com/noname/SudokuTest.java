package com.noname;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/April/2022
 * @project java-warmup
 */
public class SudokuTest {

    @Test
    public void Test1() {
        assertTrue(Sudoku.isValidSudoku(Sudoku.VALID));
    }

    @Test
    public void Test2() {
        assertFalse(Sudoku.isValidSudoku(Sudoku.INVALID));
    }
}
