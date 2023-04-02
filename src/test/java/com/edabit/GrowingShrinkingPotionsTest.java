package com.edabit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 01/April/2023
 * @project java-warmup
 */
public class GrowingShrinkingPotionsTest {
    @Test
    public void test1() {
        System.out.println("Should work without any potions.");
        assertEquals("567", GrowingShrinkingPotions.afterPotion("567"));
    }

    @Test
    public void test2() {
        System.out.println("Should work with both potions.");
        assertEquals("47751", GrowingShrinkingPotions.afterPotion("3A78B51"));
    }

    @Test
    public void test3() {
        assertEquals("9998", GrowingShrinkingPotions.afterPotion("9999B"));
    }

    @Test
    public void test4() {
        assertEquals("10123", GrowingShrinkingPotions.afterPotion("9A123"));
    }

    @Test
    public void test5() {
        assertEquals("2345", GrowingShrinkingPotions.afterPotion("1A2A3A4A"));
    }

    @Test
    public void test6() {
        assertEquals("8767", GrowingShrinkingPotions.afterPotion("9B8B7B6A"));
    }

    @Test
    public void test7() {
        assertEquals("477510", GrowingShrinkingPotions.afterPotion("3A78B59A"));
    }

    @Test(expected = IllegalStateException.class)
    public void test8() {
        GrowingShrinkingPotions.afterPotion("3C8A");
    }

    @Test(expected = IllegalStateException.class)
    public void test9() {
        GrowingShrinkingPotions.afterPotion("3a8b");
    }
}
