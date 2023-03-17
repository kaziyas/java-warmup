package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2020.12.17
 * @since 1.0
 */
public class AlmostPalindromeTest {
  @Test
  public void test1() {
    assertEquals(true, AlmostPalindrome.convert("abcdcbg"));
  }

  @Test
  public void test2() {
    assertEquals(true, AlmostPalindrome.convert("abccia"));
  }

  @Test
  public void test3() {
    assertEquals(false, AlmostPalindrome.convert("abcdaaa"));
  }

  @Test
  public void test4() {
    assertEquals(true, AlmostPalindrome.convert("gggfgig"));
  }

  @Test
  public void test5() {
    assertEquals(false, AlmostPalindrome.convert("gggffff"));
  }

  @Test
  public void test6() {
    assertEquals(true, AlmostPalindrome.convert("GIGGG"));
  }

  @Test
  public void test7() {
    assertEquals(true, AlmostPalindrome.convert("ggggi"));
  }

  @Test
  public void test8() {
    System.out.println("Should return false if already palindrome.");
    assertEquals(false, AlmostPalindrome.convert("ggggg"));
  }

  @Test
  public void test9() {
    System.out.println("Should return false if already palindrome.");
    assertEquals(false, AlmostPalindrome.convert("gggfggg"));
  }

  @Test
  public void test10() {
    assertEquals(false, AlmostPalindrome.convert("1234312"));
  }

}
