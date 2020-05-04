package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeboatTest {

    @Test
    void solution1() {
        Lifeboat l = new Lifeboat();
        int answer = l.solution(new int[]{70, 50, 80, 50}, 100);
        assertEquals(3, answer);
    }

    @Test
    void solution2() {
        Lifeboat l = new Lifeboat();
        int answer = l.solution(new int[]{70, 80, 50}, 100);
        assertEquals(3, answer);
    }
}