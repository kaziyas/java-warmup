package com.edabit;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;
/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 21/April/2023
 * @project java-warmup
 */
public class CompleteTheWordTest {
    @Test
    public void test1() {
        assertThat(CompleteTheWord.canComplete("butl", "beautiful"), is(true));
    }

    @Test
    public void test2() {
        System.out.println("\"z\" does not exist in the word `beautiful`");
        assertThat(CompleteTheWord.canComplete("butlz", "beautiful"), is(false));
    }

    @Test
    public void test3() {
        System.out.println("although \"t\", \"u\", \"l\" and \"b\" incorrectly ordered");
        assertThat(CompleteTheWord.canComplete("tulb", "beautiful"), is(false));
    }

    @Test
    public void test4() {
        System.out.println("too many \"b's\", beautiful has only 1");
        assertThat(CompleteTheWord.canComplete("bbutl", "beautiful"), is(false));
    }

    @Test
    public void test5() {
        assertThat(CompleteTheWord.canComplete("sg", "something"), is(true));
    }

    @Test
    public void test6() {
        System.out.println("out of order");
        assertThat(CompleteTheWord.canComplete("sgi", "something"), is(false));
    }

    @Test
    public void test7() {
        assertThat(CompleteTheWord.canComplete("sing", "something"), is(true));
    }

    @Test
    public void test8() {
        System.out.println("too many i's");
        assertThat(CompleteTheWord.canComplete("siing", "something"), is(false));
    }
}