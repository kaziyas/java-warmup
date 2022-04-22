package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 22/April/2022
 * @project java-warmup
 */
public class ReverseOddTest {
    @Test
    public void test1() {
        assertEquals("enO owt eerht four", ReverseOdd.challenge("One two three four"));
    }

    @Test
    public void test2() {
        assertEquals("Make sure you only reverse words of odd length", ReverseOdd.challenge("Make sure uoy only esrever sdrow of ddo length"));
    }

    @Test
    public void test3() {
        System.out.println("Should work with empty string.");
        assertEquals("", ReverseOdd.challenge(""));
    }

    @Test
    public void test4() {
        System.out.println("Should work with only one word.");
        assertEquals("sananaB", ReverseOdd.challenge("Bananas"));
    }

    @Test
    public void test5() {
        assertEquals("Even even even even even even even even even", ReverseOdd.challenge("Even even even even even even even even even"));
    }

    @Test
    public void test6() {
        assertEquals("ddO ddo ddo ddo ddo ddo ddo ddo ddo ddo ddo", ReverseOdd.challenge("Odd odd odd odd odd odd odd odd odd odd odd"));
    }
}
