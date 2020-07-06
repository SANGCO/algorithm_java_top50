package com.example.algorismTopCoder.Chapter05_전체_탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrazyBotTest {

    @Test
    void test1() {
        CrazyBot c = new CrazyBot();
        double probability = c.getProbability(1, 25, 25, 25, 25);
        assertEquals(1.0, probability);
    }

    @Test
    void test2() {
        CrazyBot c = new CrazyBot();
        double probability = c.getProbability(2, 25, 25, 25, 25);
        assertEquals(0.75, probability);
    }

    @Test
    void test3() {
        CrazyBot c = new CrazyBot();
        double probability = c.getProbability(7, 50, 0, 0, 50);
        assertEquals(1.0, probability);
    }

}