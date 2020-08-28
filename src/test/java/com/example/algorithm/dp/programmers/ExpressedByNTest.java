package com.example.algorithm.dp.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressedByNTest {

    private ExpressedByN expressedByN;

    @BeforeEach
    public void setUp() {
        expressedByN = new ExpressedByN();
    }

    @Test
    public void test1() {
        int solution = expressedByN.solution(5, 12);
        assertEquals(4, solution);
    }

}