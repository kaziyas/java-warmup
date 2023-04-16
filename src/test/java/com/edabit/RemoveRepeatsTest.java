package com.edabit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 16/April/2023
 * @project java-warmup
 */
public class RemoveRepeatsTest {
    @Test
    public void test01() {
        assertEquals("helo", RemoveRepeats.unrepeated("hello"));
    }

    @Test
    public void test02() {
        assertEquals("WE!", RemoveRepeats.unrepeated("WWEE!!!"));
    }

    @Test
    public void test03() {
        assertEquals("cal 91", RemoveRepeats.unrepeated("call 911"));
    }

    @Test
    public void test04() {
        assertEquals("a", RemoveRepeats.unrepeated("aaaaaa"));
    }

    @Test
    public void test05() {
        assertEquals("alwf tes", RemoveRepeats.unrepeated("alwaff test"));
    }

    @Test
    public void test06() {
        assertEquals("tesha", RemoveRepeats.unrepeated("teshahset"));
    }

    @Test
    public void test07() {
        assertEquals("porcuine", RemoveRepeats.unrepeated("porcupine"));
    }

    @Test
    public void test08() {
        assertEquals("alter go", RemoveRepeats.unrepeated("alter ego"));
    }

    @Test
    public void test09() {
        assertEquals("rejuvnat", RemoveRepeats.unrepeated("rejuvenate"));
    }

    @Test
    public void test10() {
        assertEquals("strau nimb", RemoveRepeats.unrepeated("stratus nimbus"));
    }

    @Test
    public void test11() {
        assertEquals("strageiz", RemoveRepeats.unrepeated("stragegize"));
    }
}
