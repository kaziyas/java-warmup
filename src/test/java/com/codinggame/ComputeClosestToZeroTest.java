package com.codinggame;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 26/April/2022
 * @project java-warmup
 */
public class ComputeClosestToZeroTest {

    @Test
    public void test1() {
        int[] ts = {-10, -7, -6, -2, 0};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), -2);
    }

    @Test
    public void test2() {
        int[] ts = {-10, -10};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), -10);
    }

    @Test
    public void test3() {
        int[] ts = {0, 1, 2, 3, 4};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), 1);
    }

    @Test
    public void test4() {
        int[] ts = {7, 5, 9, 1, 4};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), 1);
    }

    @Test
    public void test5() {
        int[] ts = {-15, -7, -9, -14, -12};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), -7);
    }

    @Test
    public void test6() {
        int[] ts = {15, -7, 9, 14, 7, 12};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), 7);
    }

    @Test
    public void test7() {
        int[] ts = {5276};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), 5276);
    }

    @Test
    public void test8() {
        int[] ts = {-5276};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), -5276);
    }

    @Test
    public void test9() {
        int[] ts = {};
        Assert.assertEquals(ComputeClosestToZero.findClosest(ts), 0);
    }
}
