package com.edabit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 23/April/2023
 * @project java-warmup
 */
public class YouTubeVideoIDExtractorTest {
    @Test
    public void test1() {
        assertEquals("XPEr1cArWRg", YouTubeVideoIDExtractor.youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg"));
    }

    @Test
    public void test2() {
        assertEquals("-SNQGyVW_YI", YouTubeVideoIDExtractor.youtubeId("http://www.youtube.com/watch?v=-SNQGyVW_YI&t=8871"));
    }

    @Test
    public void test3() {
        assertEquals("vxP3bY-XxY4", YouTubeVideoIDExtractor.youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));
    }

    @Test
    public void test4() {
        assertEquals("yv56ncTdTmU", YouTubeVideoIDExtractor.youtubeId("www.youtube.com/watch?list=PL3QZUm48uWnsdFakp3A2fI-NzmfH1jyQe&v=yv56ncTdTmU&index=8"));
    }

    @Test
    public void test5() {
        assertEquals("BCDEDi5gDPo", YouTubeVideoIDExtractor.youtubeId("https://youtu.be/BCDEDi5gDPo"));
    }

    @Test
    public void test6() {
        assertEquals("jOxnoDi9IYg", YouTubeVideoIDExtractor.youtubeId("https://www.youtube.com/watch?feature=youtu.be&v=jOxnoDi9IYg&t=3311s"));
    }

    @Test
    public void test7() {
        assertEquals("2w9SQjdn9U4", YouTubeVideoIDExtractor.youtubeId("https://www.youtube-nocookie.com/embed/2w9SQjdn9U4"));
    }
}