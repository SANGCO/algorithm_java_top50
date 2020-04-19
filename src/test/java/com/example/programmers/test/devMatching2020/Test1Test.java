package com.example.programmers.test.devMatching2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {

    @Test
    void solution1() {
        Test1 t = new Test1();
        int answer = t.solution("82195", "64723");
        assertEquals(13, answer);
    }

    @Test
    void solution2() {
        Test1 t = new Test1();
        int answer = t.solution("00000000000000000000", "91919191919191919191");
        assertEquals(20, answer);
    }
}