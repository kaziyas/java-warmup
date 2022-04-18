package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/April/2022
 * @project java-warmup
 */
public class UnmixTest {
    @Test
    public void test1() {
        assertEquals("214365", Unmix.challenge("123456"));
    }

    @Test
    public void test2() {
        assertEquals("This is a mixed up string.", Unmix.challenge("hTsii  s aimex dpus rtni.g"));
    }

    @Test
    public void test3() {
        assertEquals("abcde", Unmix.challenge("badce"));
    }

    @Test
    public void test4() {
        assertEquals("I am feeling a little dizzy!", Unmix.challenge(" Imaf eeilgna l tilt eidzz!y"));
    }

    @Test
    public void test5() {
        System.out.println("Should work with empty strings as well.");
        assertEquals("", Unmix.challenge(""));
    }
}
