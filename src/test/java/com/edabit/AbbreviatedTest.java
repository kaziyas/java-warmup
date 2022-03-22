package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 22/March/2022
 * @project java-warmup
 */
public class AbbreviatedTest {
    @Test
    public void test01() {
        assertEquals(
                true,
                Abbreviated.uniquely(
                        new String[] {"x", "l", "t"}, new String[] {"xavier", "loves", "tesha"}));
    }

    @Test
    public void test02() {
        assertEquals(
                true,
                Abbreviated.uniquely(
                        new String[] {"mo", "ma", "me"}, new String[] {"moment", "many", "mean"}));
    }

    @Test
    public void test03() {
        assertEquals(
                true,
                Abbreviated.uniquely(
                        new String[] {"at", "o", "abe"}, new String[] {"atom", "original", "abet"}));
    }

    @Test
    public void test04() {
        assertEquals(
                true,
                Abbreviated.uniquely(
                        new String[] {"rh", "par", "re"}, new String[] {"rhino", "parry", "residue"}));
    }

    @Test
    public void test05() {
        assertEquals(
                true,
                Abbreviated.uniquely(
                        new String[] {"s", "t", "v"}, new String[] {"stamina", "television", "vindaloo"}));
    }

    @Test
    public void test06() {
        assertEquals(
                false,
                Abbreviated.uniquely(
                        new String[] {"bi", "ba", "bat"}, new String[] {"big", "bard", "battery"}));
    }

    @Test
    public void test07() {
        assertEquals(
                false,
                Abbreviated.uniquely(
                        new String[] {"b", "c", "ch"}, new String[] {"broth", "chap", "cardigan"}));
    }

    @Test
    public void test08() {
        assertEquals(
                false,
                Abbreviated.uniquely(
                        new String[] {"to", "too", "t"}, new String[] {"topology", "took", "torrent"}));
    }

    @Test
    public void test09() {
        assertEquals(
                false,
                Abbreviated.uniquely(
                        new String[] {"ho", "h", "ha"}, new String[] {"house", "hope", "happy"}));
    }

}
