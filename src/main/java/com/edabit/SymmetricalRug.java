package com.edabit;

import java.util.Arrays;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2023.03.16
 * @since 1.0
 */
public class SymmetricalRug {

  public static int countLayers(String[] rug) {
    return (int) Arrays.stream(rug).distinct().count();
  }
}
