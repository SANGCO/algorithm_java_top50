package com.example.programmers.d_정렬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H_IndexTest {

    @Test
    void solution1() {
        H_Index h = new H_Index();
        int answer = h.solution(new int[]{3, 0, 6, 1, 5});
        assertEquals(3, answer);
    }

    @Test
    void solution2() {
        H_Index h = new H_Index();
        int answer = h.solution(new int[]{5, 5, 5, 5});
        assertEquals(4, answer);
    }
}