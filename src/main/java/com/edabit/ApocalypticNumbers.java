package com.edabit;
/**
 * In this challenge, you have to establish if a number is apocalyptic. A positive integer n greater than 0 is apocalyptic when 2 elevated to n contains one or more occurrences of 666 into it.
 * <p>
 * Given an integer n, implement a function that returns:
 * <p>
 * "Safe" if n is not apocalyptic.
 * "Single" if into 2^n there's a single occurence of 666.
 * "Double" if into 2^n there are two occurences of 666.
 * "Triple" if into 2^n there are three occurences of 666.
 * Examples
 * isApocalyptic(66) ➞ "Safe"
 * // 2^66 = 73786976294838206464
 * <p>
 * isApocalyptic(157) ➞ "Single"
 * // 2^157 =
 * // 182687704|666|362864775460604089535377456991567872
 * <p>
 * isApocalyptic(220) ➞ "Double"
 * // 2^220 =
 * // 168499|666|66969149871|666|8844293872691710232152640 ...
 * <p>
 * isApocalyptic(931) ➞ "Triple"
 * // 2^931 =
 * // 181520618710|666|8777829|666|135436890332191479738353753001777065257954029122510259245050254290156440857653562895251700406555730694879815558725330603736697259064676478076718090|666| ...
 * Notes
 * Any given n will be a positive integer in the range of 1 to 1000.
 * Occurrences have to be unique, you can't use digits that have already been matched again (see example #3, there are five adjacent 6, but only a possible match).
 */

import java.math.BigInteger;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 10/April/2022
 * @project java-warmup
 */
public class ApocalypticNumbers {
    private static final String APOCALYPTIC_NUMBER = "666";

    public static String isApocalyptic(int n) {
        String[] status = {"", "Safe", "Single", "Double", "Triple"};
        int count = new BigInteger("2").pow(n).toString().split(APOCALYPTIC_NUMBER).length;
        return status[count];
    }
}
