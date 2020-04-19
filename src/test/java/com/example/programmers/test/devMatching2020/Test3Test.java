package com.example.programmers.test.devMatching2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {

    @Test
    void solution1() {
        Test3 t = new Test3();
        int answer = t.solution(new int[]{10, 40, 30, 20}, 20);
        assertEquals(1, answer);
    }

    @Test
    void solution2() {
        Test3 t = new Test3();
        int answer = t.solution(new int[]{3, 7, 2, 8, 6, 4, 5, 1}, 3);
        assertEquals(2, answer);
    }
}