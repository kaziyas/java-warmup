package com.edabit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 17/April/2023
 * @project java-warmup
 */

public class ParenthesesClusters {

    public static String[] split(String s) {
        int open = 0;
        int close = 0;
        int start = 0;
        int end;

        List<String> resultStr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                close++;
                if (open == close) {
                    open = 0;
                    close = 0;
                    end = i;
                    resultStr.add(s.substring(start, end + 1));
                    start = end + 1;
                }
            }
        }
        return resultStr.toArray(new String[0]);
    }
}
