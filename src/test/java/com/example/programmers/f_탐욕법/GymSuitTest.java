package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    private GymSuit g;

    @BeforeEach
    public void setUp() {
        g = new GymSuit();
    }

    @Test
    void solution1() {
        int answer = g.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        assertEquals(5, answer);
    }

    @Test
    void solution2() {
        int answer = g.solution(5, new int[]{2, 4}, new int[]{3});
        assertEquals(4, answer);
    }

    @Test
    void solution3() {
        int answer = g.solution(3, new int[]{3}, new int[]{1});
        assertEquals(2, answer);
    }

    @Test
    void solution4() {
        int answer = g.solution(5, new int[]{1, 2, 4, 5}, new int[]{2, 3, 4});
        assertEquals(3, answer);
    }
}