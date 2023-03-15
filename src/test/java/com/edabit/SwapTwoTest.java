package com.edabit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2023.03.15
 * @since 1.0
 */
public class SwapTwoTest {
  @Test
  public void test1() {
    assertEquals("CDABGHEF", SwapTwo.convert("ABCDEFGH"));
  }

  @Test
  public void test2() {
    assertEquals("BBAADDCCFFEE", SwapTwo.convert("AABBCCDDEEFF"));
  }

  @Test
  public void test3() {
    assertEquals("mpooooalmpa", SwapTwo.convert("oompaloompa"));
  }

  @Test
  public void test4() {
    assertEquals("ncmuinhks", SwapTwo.convert("munchkins"));
  }

  @Test
  public void test5() {
    assertEquals("GGFFHHI", SwapTwo.convert("FFGGHHI"));
  }

  @Test
  public void test6() {
    assertEquals("FFG", SwapTwo.convert("FFG"));
  }

  @Test
  public void test7() {
    assertEquals("", SwapTwo.convert(""));
  }
}
