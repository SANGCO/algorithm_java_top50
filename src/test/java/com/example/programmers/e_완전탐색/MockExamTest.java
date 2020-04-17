package com.example.programmers.e_완전탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockExamTest {

    @Test
    void solution1() {
        MockExam m = new MockExam();
        int[] answer = m.solution(new int[]{1,2,3,4,5});
        assertArrayEquals(new int[]{1}, answer);
    }

    @Test
    void solution2() {
        MockExam m = new MockExam();
        int[] answer = m.solution(new int[]{1,3,2,4,2});
        assertArrayEquals(new int[]{1, 2, 3}, answer);
    }
}