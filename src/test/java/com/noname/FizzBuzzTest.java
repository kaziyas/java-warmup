package com.noname;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 24/April/2022
 * @project java-warmup
 */
public class FizzBuzzTest {
    @Test
    public void test1() {
        Assert.assertEquals(FizzBuzz.calculate((long) 60), "FizzBuzz");
    }

    @Test
    public void test2() {
        Assert.assertEquals(FizzBuzz.calculate((long) 9), "Fizz");
    }

    @Test
    public void test3() {
        Assert.assertEquals(FizzBuzz.calculate((long) 20), "Buzz");
    }

    @Test
    public void test4() {
        Assert.assertEquals(FizzBuzz.calculate((long) 41), "41");
    }

    @Test
    public void test5() {
        Assert.assertEquals(FizzBuzz.calculate((long) 90), "FizzBuzz");
    }

    @Test
    public void test6() {
        Assert.assertEquals(FizzBuzz.calculate((long) 1), "1");
    }
}
