package com.edabit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 19/March/2023
 * @project java-warmup
 */
public class PersonalIdNumber {

    public static boolean validate(String s) {
        Pattern pattern = Pattern.compile("\\d{4}|\\d{6}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
