package com.edabit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/April/2023
 * @project java-warmup
 */
public class DuplicateCountTest {
    @Test
    public void test1() {
        assertEquals(0, DuplicateCount.solution("abcde"));
    }

    @Test
    public void test2() {
        System.out.println("Duplicate characters are case sensitive.");
        assertEquals(0, DuplicateCount.solution("Aa"));
    }

    @Test
    public void test3() {
        assertEquals(2, DuplicateCount.solution("aabbcde"));
    }

    @Test
    public void test4() {
        assertEquals(2, DuplicateCount.solution("aabbcdeB"));
    }

    @Test
    public void test5() {
        assertEquals(1, DuplicateCount.solution("indivisibility"));
    }

    @Test
    public void test6() {
        assertEquals(2, DuplicateCount.solution("Indivisibilities"));
    }

    @Test
    public void test7() {
        assertEquals(2, DuplicateCount.solution("aa1112"));
    }

    @Test
    public void test8() {
        assertEquals(1, DuplicateCount.solution("bb2c"));
    }
}