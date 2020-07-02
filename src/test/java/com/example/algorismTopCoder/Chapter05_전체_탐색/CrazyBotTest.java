package com.example.algorismTopCoder.Chapter05_전체_탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrazyBotTest {

    @Test
    void test() {
        CrazyBot c = new CrazyBot();
        double probability = c.getProbability(1, 25, 25, 25, 25);
        assertEquals(1.0, probability);
    }

}