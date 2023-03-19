package com.edabit;
/**
 * Create a function that will test if a string is a valid PIN or not via a regular expression.
 *
 * A valid PIN has:
 *
 * Exactly 4 or 6 characters.
 * Only numeric characters (0-9).
 * No whitespace.
 */

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 19/March/2023
 * @project java-warmup
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonalIdNumberTest {
    @Test
    public void test01() {
        assertEquals(true, PersonalIdNumber.validate("544466"));
    }

    @Test
    public void test02() {
        assertEquals(true, PersonalIdNumber.validate("121317"));
    }

    @Test
    public void test03() {
        assertEquals(false, PersonalIdNumber.validate("4512a5"));
    }

    @Test
    public void test04() {
        assertEquals(true, PersonalIdNumber.validate("123456"));
    }

    @Test
    public void test05() {
        assertEquals(false, PersonalIdNumber.validate(""));
    }

    @Test
    public void test06() {
        assertEquals(false, PersonalIdNumber.validate("21904"));
    }

    @Test
    public void test07() {
        assertEquals(true, PersonalIdNumber.validate("9451"));
    }

    @Test
    public void test08() {
        assertEquals(true, PersonalIdNumber.validate("213132"));
    }

    @Test
    public void test09() {
        assertEquals(false, PersonalIdNumber.validate(" 4520"));
    }

    @Test
    public void test10() {
        assertEquals(false, PersonalIdNumber.validate("15632 "));
    }

    @Test
    public void test11() {
        assertEquals(true, PersonalIdNumber.validate("000000"));
    }
}
