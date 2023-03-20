package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2023.03.20
 * @since 1.0
 */
public class SumOfTwoNumbersTest {
    @Test
    public void test1() {
        assertEquals(347, SumOfTwoNumbers.lunarSum(246, 317));
    }

    @Test
    public void test2() {
        assertEquals(154, SumOfTwoNumbers.lunarSum(134, 54));
    }

    @Test
    public void test3() {
        assertEquals(140, SumOfTwoNumbers.lunarSum(20, 140));
    }

    @Test
    public void test4() {
        assertEquals(1, SumOfTwoNumbers.lunarSum(1, 1));
    }

    @Test
    public void test5() {
        assertEquals(198, SumOfTwoNumbers.lunarSum(198, 44));
    }

    @Test
    public void test6() {
        assertEquals(36696, SumOfTwoNumbers.lunarSum(36602, 696));
    }

    @Test
    public void test7() {
        assertEquals(8893, SumOfTwoNumbers.lunarSum(91, 8823));
    }

    @Test
    public void test8() {
        assertEquals(128, SumOfTwoNumbers.lunarSum(123, 8));
    }

    @Test
    public void test9() {
        assertEquals(98212289, SumOfTwoNumbers.lunarSum(2289, 98211285));
    }

    @Test
    public void test10() {
        assertEquals(19, SumOfTwoNumbers.lunarSum(9, 11));
    }

    @Test
    public void test11() {
        assertEquals(22, SumOfTwoNumbers.lunarSum(11, 22));
    }
}