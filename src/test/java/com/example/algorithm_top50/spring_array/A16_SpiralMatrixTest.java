package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A16_SpiralMatrixTest {

    @Test
    void solve() {
        A16_SpiralMatrix s = new A16_SpiralMatrix();
        s.solve(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

}