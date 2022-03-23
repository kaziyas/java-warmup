package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 23/March/2022
 * @project java-warmup
 */
public class DisariumNumberTests {
    private final int[] numVector = new int[] {6, 75, 135, 466, 372, 175, 1, 696, 876, 89, 518, 598};
    private final boolean[] resVector =
            new boolean[] {true, false, true, false, false, true, true, false, false, true, true, true};

    @Test
    public void test01() {
        assertEquals(DisariumNumber.isDisarium(numVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(DisariumNumber.isDisarium(numVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(DisariumNumber.isDisarium(numVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(DisariumNumber.isDisarium(numVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(DisariumNumber.isDisarium(numVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(DisariumNumber.isDisarium(numVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(DisariumNumber.isDisarium(numVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(DisariumNumber.isDisarium(numVector[7]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(DisariumNumber.isDisarium(numVector[8]), resVector[8]);
    }

    @Test
    public void test10() {
        assertEquals(DisariumNumber.isDisarium(numVector[9]), resVector[9]);
    }

    @Test
    public void test11() {
        assertEquals(DisariumNumber.isDisarium(numVector[10]), resVector[10]);
    }

    @Test
    public void test12() {
        assertEquals(DisariumNumber.isDisarium(numVector[11]), resVector[11]);
    }
}
