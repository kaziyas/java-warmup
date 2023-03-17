package com.edabit;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2023.03.17
 * @since 1.0
 */
public class AlmostPalindrome {

  public static boolean convert(String str) {
    int count = 0;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        count++;
      }
    }
    return count == 1;
  }
}
