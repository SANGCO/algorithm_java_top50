package com.example.programmers.b_스택_큐;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckPassingBridgeTest {

    TruckPassingBridge t = new TruckPassingBridge();

    @Test
    void solution1() {
        int answer = t.solution(2, 10, new int[]{7, 4, 5, 6});
        assertEquals(8, answer);
    }

    @Test
    void solution2() {
        int answer = t.solution(100, 100, new int[]{10});
        assertEquals(101, answer);
    }

    @Test
    void solution3() {
        int answer = t.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        assertEquals(110, answer);
    }
}