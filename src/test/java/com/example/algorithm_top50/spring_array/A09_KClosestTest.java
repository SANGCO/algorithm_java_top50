package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A09_KClosestTest {

    @Test
    void solve() {
        A09_KClosest k = new A09_KClosest();
        int[][] answer = k.solve(new int[][]{{1, 3}, {-2, 2}}, 1);
        assertArrayEquals(new int[][]{{-2, 2}}, answer);
    }

}