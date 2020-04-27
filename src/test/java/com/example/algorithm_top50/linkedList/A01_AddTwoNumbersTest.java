package com.example.algorithm_top50.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A01_AddTwoNumbersTest {

    @Test
    void solution() {
        A01_AddTwoNumbers a = new A01_AddTwoNumbers();
        int[] answer = a.solution(new int[]{2, 4, 3}, new int[]{5, 6, 4});
        assertArrayEquals(new int[]{7, 0, 8}, answer);
    }
}