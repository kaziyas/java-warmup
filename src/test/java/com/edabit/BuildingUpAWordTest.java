package com.edabit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 24/March/2022
 * @project java-warmup
 */
public class BuildingUpAWordTest {
    @Test
    public void test1() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"a", "at", "ate", "late", "plate", "plates"}), is(true));
    }

    @Test
    public void test2() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"u", "ut", "but", "butt", "butte", "butter", "buttery"}), is(true));
    }

    @Test
    public void test3() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"a", "ka", "ika", "pika", "pikac", "pikach", "pikachu"}), is(true));
    }

    @Test
    public void test4() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"a", "at", "tat", "stat", "state", "estate", "estates"}), is(true));
    }

    @Test
    public void test5() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"o", "ol", "old", "bold", "bolde", "mbolde", "embolde", "embolden"}), is(true));
    }

    @Test
    public void test6() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"mean", "meany"}),is(true));
    }

    @Test
    public void test7() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"at", "cat", "cate", "cater", "caters"}),is(true));
    }

    @Test
    public void test8() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"a", "at", "ate", "late", "plate", "plater", "platter"}),is(false));
    }

    @Test
    public void test9() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"i", "it", "bit", "bite", "biters"}),is(false));
    }

    @Test
    public void test10() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"e", "tea", "teac", "teach", "teache", "teacher", "teachers"}),is(false));
    }

    @Test
    public void test11() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"m", "ma", "man", "many", "meany"}),is(false));
    }

    @Test
    public void test12() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"o", "op", "top", "stop", "stops", "stoops"}),is(false));
    }

    @Test
    public void test13() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"air", "air", "airy", "fairy"}),is(false));
    }

    @Test
    public void test14() {
        assertThat(BuildingUpAWord.canBuild(new String[]{"men", "mean", "meany"}),is(false));
    }
}
