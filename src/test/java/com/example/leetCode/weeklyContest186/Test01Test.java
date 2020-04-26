package com.example.leetCode.weeklyContest186;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test01Test {

    @Test
    void maxScore1() {
        Test01 t = new Test01();
        int answer = t.maxScore("011101");
        assertEquals(5, answer);
    }

    @Test
    void maxScore2() {
        Test01 t = new Test01();
        int answer = t.maxScore("1111");
        assertEquals(3, answer);
    }

    @Test
    void maxScore3() {
        Test01 t = new Test01();
        int answer = t.maxScore("00");
        assertEquals(1, answer);
    }

    @Test
    void maxScore4() {
        Test01 t = new Test01();
        int answer = t.maxScore("01001");
        assertEquals(4, answer);
    }
}