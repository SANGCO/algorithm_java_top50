package com.example.programmers.test.devMatching2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    @Test
    void solution() {
        Test2 t = new Test2();
        int answer = t.solution(new int[][]{{5,-1,4}, {6,3,-1}, {2,-1,1}}, 1, 0, new String[]{"go", "go", "right", "go", "right", "go", "left", "go"});
        assertEquals(14, answer);
    }
}