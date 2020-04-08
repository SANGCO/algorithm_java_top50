package com.example.programmers.b_힙;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RamenFactoryTest {

    @Test
    void solution1() {
        RamenFactory r = new RamenFactory();
        int answer = r.solution(4, new int[]{4,10,15}, new int[]{20,5,10},30);
        assertEquals(2, answer);
    }
}