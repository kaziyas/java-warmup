package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 10/April/2022
 * @project java-warmup
 */
public class MatrixTest {
    @Test
    public void test01() {
        assertEquals("I so love Tesh very much!", Matrix.transpose(new String[][] {{"I", "Tesh"}, {"so", "very"}, {"love", "much!"}}));
    }

    @Test
    public void test02() {
        assertEquals("My world evolves solely on Tesha's.", Matrix.transpose(new String[][] {{"My", "evolves", "on"}, {"world", "solely", "Tesha's."}}));
    }

    @Test
    public void test03() {
        assertEquals("The hurting truth is I can't have you now Tesh!", Matrix.transpose(new String[][] {{"The", "truth", "I", "have", "now"}, {"hurting", "is", "can't", "you", "Tesh!"}}));
    }

    @Test
    public void test04() {
        assertEquals("Enter the Matrix!", Matrix.transpose(new String[][] {{"Enter"}, {"the"}, {"Matrix!"}}));
    }

    @Test
    public void test05() {
        assertEquals("The columns are rows.", Matrix.transpose(new String[][] {{"The", "are"}, {"columns", "rows."}}));
    }

    @Test
    public void test06() {
        assertEquals("You must transpose the table order.", Matrix.transpose(new String[][] {{"You", "the"}, {"must", "table"}, {"transpose", "order."}}));
    }
}
