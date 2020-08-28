package com.example.algorithm.dp.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerTriangleTest {

    private IntegerTriangle integerTriangle;

    @BeforeEach
    public void setUp() {
        integerTriangle = new IntegerTriangle();
    }

    @Test
    public void test1() {
        int answer = integerTriangle.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
        assertEquals(30, answer);
    }

}