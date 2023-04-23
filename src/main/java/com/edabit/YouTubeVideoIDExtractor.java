package com.edabit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 23/April/2023
 * @project java-warmup
 */
public class YouTubeVideoIDExtractor {
    public static String youtubeId(String link) {
        Pattern regex = Pattern.compile(".*(?<=/|v=)(.{11}).*");
        Matcher regexMatcher = regex.matcher(link);
        if (regexMatcher.find()) {
            return regexMatcher.group(1);
        }
        return "";
    }
}
