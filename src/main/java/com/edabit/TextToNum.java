/**
 * Create a program that converts a phone number with letters to one with only numbers.
 *
 * Number	Letter
 * 0	none
 * 1	none
 * 2	ABC
 * 3	DEF
 * 4	GHI
 * 5	JKL
 * 6	MNO
 * 7	PQRS
 * 8	TUV
 * 9	WXYZ
 */

package com.edabit;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 08/April/2022
 * @project java-warmup
 */

public class TextToNum {

    public static String convert(String s) {
        return s
                .replaceAll("[ABC]", "2")
                .replaceAll("[DEF]", "3")
                .replaceAll("[GHI]", "4")
                .replaceAll("[JKL]", "5")
                .replaceAll("[MNO]", "6")
                .replaceAll("[PQRS]", "7")
                .replaceAll("[TUV]", "8")
                .replaceAll("[WXYZ]", "9");
    }
}
