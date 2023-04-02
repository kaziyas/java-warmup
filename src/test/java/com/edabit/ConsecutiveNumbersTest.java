package com.edabit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 02/April/2023
 * @project java-warmup
 */
public class ConsecutiveNumbersTest {
    @Test
    public void test1() {
        assertTrue(ConsecutiveNumbers.cons(new int[]{5, 1, 4, 3, 2}));
    }

    @Test
    public void test2() {
        assertTrue(ConsecutiveNumbers.cons(new int[]{55, 59, 58, 56, 57}));
    }

    @Test
    public void test3() {
        assertTrue(ConsecutiveNumbers.cons(new int[]{-3, -2, -1, 1, 0}));
    }

    @Test
    public void test4() {
        assertFalse(ConsecutiveNumbers.cons(new int[]{5, 1, 4, 3, 2, 8}));
    }

    @Test
    public void test5() {
        assertFalse(ConsecutiveNumbers.cons(new int[]{5, 6, 7, 8, 9, 9}));
    }

    @Test
    public void test6() {
        assertFalse(ConsecutiveNumbers.cons(new int[]{5, 3}));
    }
}
