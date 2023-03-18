package com.noname;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 18/March/2023
 * @project java-warmup
 */
public class TransformStringTest {

    @Test
    public void test1() {
        String str = "CBACD";
        Assert.assertEquals("C", TransformString.solution(str));
    }

    @Test
    public void test2() {
        String str = "CABABD";
        Assert.assertEquals("", TransformString.solution(str));
    }

    @Test
    public void test3() {
        String str = "ACBDACBD";
        Assert.assertEquals(str, TransformString.solution(str));
    }

    @Test
    public void test4() {
        String str = "ABCDBCABABCDABA";
        Assert.assertEquals("BCA", TransformString.solution(str));
    }
}
