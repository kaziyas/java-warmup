package com.edabit;

/**
 * @author Yaser Kazerooni (yaser.kazerooni@gmail.com)
 * @version 1.0 2023.03.20
 * @since 1.0
 */
public class SumOfTwoNumbers {
    public static int lunarSum(int i, int i1) {

        int maxLength = Math.max(("" + i).length(), ("" + i1).length());
        String first  = String.format("%0"+maxLength+"d", i);
        String second = String.format("%0"+maxLength+"d", i1);

        char c, c1;
        char[] result = new char[maxLength];
        for (int j = 0 ; j < first.length(); j ++ ){
            c =  first.charAt(j);
            c1 = second.charAt(j);
            result[j] = c > c1 ? c : c1;
        }
        return Integer.parseInt(String.valueOf(result));
    }
}
