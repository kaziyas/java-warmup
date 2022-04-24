package com.codinggame;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 24/April/2022
 * @project java-warmup
 */
public class LongestSequenceTest {

    @Test
    public void test1() {
        Assert.assertEquals(LongestSequence.getMax("11011101111"), 8);
    }

    @Test
    public void test2() {
        Assert.assertEquals(LongestSequence.getMax("01110100110011000101001100011110010010101011111011"), 8);
    }

    @Test
    public void test3() {
        Assert.assertEquals(LongestSequence.getMax("10000000011100000000011111000001"), 6);
    }

    @Test
    public void test4() {
        Assert.assertEquals(LongestSequence.getMax("00010111111001000101011111111010"), 10);
    }

    @Test
    public void test5() {
        Assert.assertEquals(LongestSequence.getMax("00"), 1);
    }

    @Test
    public void test6() {
        Assert.assertEquals(LongestSequence.getMax2("11011101111"), 8);
    }

    @Test
    public void test7() {
        Assert.assertEquals(LongestSequence.getMax2("01110100110011000101001100011110010010101011111011"), 8);
    }

    @Test
    public void test8() {
        Assert.assertEquals(LongestSequence.getMax2("10000000011100000000011111000001"), 6);
    }

    @Test
    public void test9() {
        Assert.assertEquals(LongestSequence.getMax2("00010111111001000101011111111010"), 10);
    }

    @Test
    public void test10() {
        Assert.assertEquals(LongestSequence.getMax2("00"), 1);
    }
}