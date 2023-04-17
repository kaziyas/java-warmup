package com.edabit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 17/April/2023
 * @project java-warmup
 */
public class ParenthesesClustersTest {
    @Test
    public void test1() {
        assertThat(ParenthesesClusters.split("()()()"), is(new String[]{"()", "()", "()"}));
    }

    @Test
    public void test2() {
        assertThat(ParenthesesClusters.split(""), is(new String[]{}));
    }

    @Test
    public void test3() {
        assertThat(ParenthesesClusters.split("()()(())"), is(new String[]{"()", "()", "(())"}));
    }

    @Test
    public void test4() {
        assertThat(ParenthesesClusters.split("(())(())"), is(new String[]{"(())", "(())"}));
    }

    @Test
    public void test5() {
        assertThat(ParenthesesClusters.split("((()))"), is(new String[]{"((()))"}));
    }

    @Test
    public void test6() {
        assertThat(ParenthesesClusters.split("()(((((((((())))))))))"), is(new String[]{"()", "(((((((((())))))))))"}));
    }

    @Test
    public void test7() {
        assertThat(ParenthesesClusters.split("((())()(()))(()(())())(()())"), is(new String[]{"((())()(()))", "(()(())())", "(()())"}));
    }

    @Test
    public void test8() {
        assertThat(ParenthesesClusters.split("((()))(())()()(()())"), is(new String[]{"((()))", "(())", "()", "()", "(()())"}));
    }

    @Test
    public void test9() {
        assertThat(ParenthesesClusters.split("((())())(()(()()))"), is(new String[]{"((())())", "(()(()()))"}));
    }

    @Test
    public void test10() {
        assertThat(ParenthesesClusters.split("(()(()()))()(((()))()(()))(()((()))(())())"), is(new String[]{"(()(()()))", "()", "(((()))()(()))", "(()((()))(())())"}));
    }
}
