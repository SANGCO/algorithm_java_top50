package com.example.programmers.b_스택_큐;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StockPriceTest {

    @Test
    void solution1() {
        StockPrice s = new StockPrice();
        int[] answer = s.solution1(new int[]{1, 2, 3, 2, 3});
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, answer);
    }

    @Test
    void solution2() {
        StockPrice s = new StockPrice();
        int[] answer = s.solution2(new int[]{1, 2, 3, 2, 3});
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, answer);
    }
}