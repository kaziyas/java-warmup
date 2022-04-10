package com.edabit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 10/April/2022
 * @project java-warmup
 */
public class ApocalypticNumbersTest {
    @Test
    public void shouldReturnSafe() {
        assertEquals("Safe", ApocalypticNumbers.isApocalyptic(66));
    }

    @Test
    public void test2() {
        assertEquals("Single", ApocalypticNumbers.isApocalyptic(157));
    }

    @Test
    public void test3() {
        assertEquals("Double", ApocalypticNumbers.isApocalyptic(220));
    }

    @Test
    public void test4() {
        assertEquals("Triple", ApocalypticNumbers.isApocalyptic(931));
    }

    @Test
    public void test5() {
        assertEquals("Safe", ApocalypticNumbers.isApocalyptic(166));
    }

    @Test
    public void test6() {
        assertEquals("Double", ApocalypticNumbers.isApocalyptic(529));
    }

    @Test
    public void test7() {
        assertEquals("Single", ApocalypticNumbers.isApocalyptic(443));
    }

    @Test
    public void test8() {
        assertEquals("Safe", ApocalypticNumbers.isApocalyptic(166));
    }

    @Test
    public void test9() {
        assertEquals("Safe", ApocalypticNumbers.isApocalyptic(703));
    }

    @Test
    public void test10() {
        assertEquals("Single", ApocalypticNumbers.isApocalyptic(528));
    }

    @Test
    public void test11() {
        assertNotEquals("Double", ApocalypticNumbers.isApocalyptic(1002));
    }
}
