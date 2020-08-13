package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A10_PlusOneTest {

    @Test
    void plusOne() {
        A10_PlusOne p = new A10_PlusOne();
        int[] answer = p.plusOne(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 4}, answer);

        answer = p.plusOne(new int[]{9, 9, 9});
        assertArrayEquals(new int[]{1, 0, 0, 0}, answer);
    }

}