package com.example.programmers.b_스택_큐;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void solution() {
        Printer p = new Printer();
        int answer1 = p.solution(new int[]{2, 1, 3, 2}, 2);
        assertEquals(1, answer1);
        int answer2 = p.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        assertEquals(5, answer2);
    }
}