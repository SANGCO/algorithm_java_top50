package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A13_MaxSubArrayTest {

    @Test
    void maxSubArray() {
        A13_MaxSubArray m = new A13_MaxSubArray();
        int answer = m.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, answer);
    }

}