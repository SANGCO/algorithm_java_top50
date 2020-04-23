package com.example.programmers.e_완전탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    @Test
    void solution() {
        Carpet c = new Carpet();
        int[] answer = c.solution(10, 2);
        assertArrayEquals(new int[]{4, 3}, answer);
    }

    @Test
    void solution1() {
        Carpet c = new Carpet();
        int[] answer = c.solution(8, 1);
        assertArrayEquals(new int[]{3, 3}, answer);
    }

    @Test
    void solution2() {
        Carpet c = new Carpet();
        int[] answer = c.solution(24, 24);
        assertArrayEquals(new int[]{8, 6}, answer);
    }
}