package com.example.leetCode.weeklyContest186;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test02Test {

    @Test
    void maxScore1() {
        Test02 t = new Test02();
        int answer = t.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);
        assertEquals(12, answer);
    }

    @Test
    void maxScore2() {
        Test02 t = new Test02();
        int answer = t.maxScore(new int[]{2, 2, 2}, 2);
        assertEquals(4, answer);
    }

    @Test
    void maxScore3() {
        Test02 t = new Test02();
        int answer = t.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7);
        assertEquals(55, answer);
    }

    @Test
    void maxScore4() {
        Test02 t = new Test02();
        int answer = t.maxScore(new int[]{1, 1000, 1}, 1);
        assertEquals(1, answer);
    }

    @Test
    void maxScore5() {
        Test02 t = new Test02();
        int answer = t.maxScore(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3);
        assertEquals(202, answer);
    }
}