package com.edabit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 21/April/2022
 * @project java-warmup
 */
public class RansomLetterTest {

    @Test
    public void test1() {
        assertTrue(RansomLetter.canBuild("aPPleAL", "PAL"));
    }

    @Test
    public void test2() {
        assertTrue(RansomLetter.canBuild("OAT", "OAT"));
    }

    @Test
    public void test3() {
        assertTrue(RansomLetter.canBuild("maybelLINE", "maybe"));
    }

    @Test
    public void test4() {
        assertTrue(RansomLetter.canBuild("topsh", "shop"));
    }

    @Test
    public void test5() {
        assertTrue(RansomLetter.canBuild("topshSHP", "SHoP"));
    }

    @Test
    public void test6() {
        assertTrue(RansomLetter.canBuild("DAISIES", "SAID"));
    }

    @Test
    public void test7() {
        assertTrue(RansomLetter.canBuild("ToporP", "porT"));
    }

    @Test
    public void test8() {
        assertTrue(RansomLetter.canBuild("PoTluCK", "PuCK"));
    }

    @Test
    public void test9() {
        assertTrue(RansomLetter.canBuild("pATS", "p"));
    }

    @Test
    public void test10() {
        assertTrue(RansomLetter.canBuild("blah", ""));
    }

    @Test
    public void test11() {
        assertFalse(RansomLetter.canBuild("aPPleAL", "apple"));
    }

    @Test
    public void test12() {
        assertFalse(RansomLetter.canBuild("shortCAKE", "cakey"));
    }

    @Test
    public void test13() {
        assertFalse(RansomLetter.canBuild("maybeLINE", "lINE"));
    }

    @Test
    public void test14() {
        assertFalse(RansomLetter.canBuild("teaPOT", "lINE"));
    }

    @Test
    public void test15() {
        assertFalse(RansomLetter.canBuild("", "a"));
    }

    @Test
    public void test16() {
        assertFalse(RansomLetter.canBuild("a", "aA"));
    }

    @Test
    public void test17() {
        assertFalse(RansomLetter.canBuild("a", "A"));
    }

    @Test
    public void test18() {
        assertFalse(RansomLetter.canBuild("AAAAAA", "AAAAAAa"));
    }

    @Test
    public void test19() {
        assertFalse(RansomLetter.canBuild("apple", "appleY"));
    }

    @Test
    public void test20() {
        assertFalse(RansomLetter.canBuild("xxYYzZ", "zzZxYxY"));
    }

    @Test
    public void test21() {
        assertFalse(RansomLetter.canBuild("abCD", "aBCD"));
    }

}
