package com.edabit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
Write a function which increments a string to create a new string.

If the string ends with a number, the number should be incremented by 1.
If the string doesn't end with a number, 1 should be added to the new string.
If the number has leading zeros, the amount of digits should be considered.
Examples
incrementString("foo") ➞ "foo1"

incrementString("foobar0009") ➞ "foobar0010"

incrementString("foo099") ➞ "foo100"
*/

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 14/April/2023
 * @project java-warmup
 */

public class StringIncrementerTests {
  @Test
  public void test1() {
    assertEquals("foo1", StringIncrementer.incrementString("foo"));
  }

  @Test
  public void test2() {
    assertEquals("foobar01003", StringIncrementer.incrementString("foobar01002"));
  }

  @Test
  public void test3() {
    assertEquals("foobar00600", StringIncrementer.incrementString("foobar00599"));
  }

  @Test
  public void test4() {
    assertEquals("foo100", StringIncrementer.incrementString("foo099"));
  }

  @Test
  public void test5() {
    assertEquals("foo10000", StringIncrementer.incrementString("foo09999"));
  }
}
