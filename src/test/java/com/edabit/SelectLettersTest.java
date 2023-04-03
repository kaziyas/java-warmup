package com.edabit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 03/April/2023
 * @project java-warmup
 */

public class SelectLettersTest {
    @Test
    public void test1() {
        assertEquals("help", SelectLetters.solution("heLLO", "GUlp"));
    }

    @Test
    public void test2() {
        assertEquals("135", SelectLetters.solution("1234567", "XxXxX"));
    }

    @Test
    public void test3() {
        assertEquals("EYSomeThings", SelectLetters.solution("EVERYTHING", "SomeThings"));
    }

    @Test
    public void test4() {
        assertEquals("atrpten", SelectLetters.solution("PaTtErN", "pAtTeRn"));
    }

    @Test
    public void test5() {
        assertEquals("", SelectLetters.solution("nothing", "nothing"));
    }

    @Test
    public void test6() {
        assertEquals("What doR", SelectLetters.solution("What do you think of it so far?", "RUBBISH!"));
    }    
}
