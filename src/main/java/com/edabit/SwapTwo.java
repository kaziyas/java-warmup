package com.edabit;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2023.03.15
 * @since 1.0
 */
public class SwapTwo {

  public static String convert(String str) {
    return str.replaceAll("(..)(..)", "$2$1");
  }
}
