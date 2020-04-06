package com.example.programmers.b_힙;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoreSpicyTest {

    @Test
    void solution() {
        MoreSpicy m = new MoreSpicy();
        int answer = m.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        assertEquals(2, answer);
    }
}