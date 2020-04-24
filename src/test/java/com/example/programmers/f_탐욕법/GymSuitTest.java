package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    @Test
    void solution1() {
        GymSuit g = new GymSuit();
        int answer = g.solution(5, new int[]{2, 4}, new int[]{1, 3, 4});
        assertEquals(5, answer);
    }

    @Test
    void solution2() {
        GymSuit g = new GymSuit();
        int answer = g.solution(5, new int[]{2, 4}, new int[]{3});
        assertEquals(4, answer);
    }

    @Test
    void solution3() {
        GymSuit g = new GymSuit();
        int answer = g.solution(3, new int[]{3}, new int[]{1});
        assertEquals(2, answer);
    }
}