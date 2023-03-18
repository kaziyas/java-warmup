package com.noname;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/March/2023
 * @project java-warmup
 */
public class TransformString {
    private final static List<String> pattern = Arrays.asList("AB", "BA", "CD", "DC");

    public static String solution (String S) {
        if (S.length() > 250000)
            throw new InvalidParameterException("input size is exceeded!!!");

        int interval = 1;
        int end = S.length() - 2;
        while (S.length() > 1 && interval <= S.length()) {
            for (int i = 0; i < pattern.size(); i++) {
                if (S.substring(end, end + 2).equals(pattern.get(i))) {
                    S = S.replace(pattern.get(i), "");
                    interval--;
                    break;
                }
            }
            end = S.length() - interval - 2;
            interval++;
            if (end < 0) end = 0;
        }
        return S;
    }
}
