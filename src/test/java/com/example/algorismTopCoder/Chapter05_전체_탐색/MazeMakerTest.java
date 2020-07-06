package com.example.algorismTopCoder.Chapter05_전체_탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeMakerTest {

    @Test
    void test1() {
        MazeMaker m = new MazeMaker();
        int answer = m.longestPath(new String[]{"...", "...", "..."}, 0, 1,
                new int[]{1, 0, -1, 0, 1, 1, -1, -1}, new int[]{0, 1, 0, -1, 1, -1, 1, -1});
        assertEquals(2, answer);
    }

    @Test
    void test2() {
        MazeMaker m = new MazeMaker();
        int answer = m.longestPath(new String[]{"...", "...", "..."}, 0, 1,
                new int[]{1, 0, -1, 0}, new int[]{0, 1, 0, -1});
        assertEquals(3, answer);
    }

}