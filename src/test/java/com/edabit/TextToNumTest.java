package com.edabit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 08/April/2022
 * @project java-warmup
 */
public class TextToNumTest {
    @Test
    public void test1() {
        assertEquals("123-647-3937", TextToNum.convert("123-647-EYES"));
    }

    @Test
    public void test2() {
        assertEquals("(325)444-8378", TextToNum.convert("(325)444-TEST"));
    }

    @Test
    public void test3() {
        assertEquals("653-879-8447", TextToNum.convert("653-TRY-THIS"));
    }

    @Test
    public void test4() {
        assertEquals("435-224-7613", TextToNum.convert("435-224-7613"));
    }

    @Test
    public void test5() {
        assertEquals("(333)668-3245", TextToNum.convert("(33D)ONT-FAIL"));
    }

    @Test
    public void test6() {
        assertEquals("(025)445-6741", TextToNum.convert("(025)445-6741"));
    }
}
