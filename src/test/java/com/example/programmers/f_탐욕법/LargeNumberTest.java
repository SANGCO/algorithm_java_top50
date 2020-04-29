package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargeNumberTest {

    @Test
    void solution1() {
        LargeNumber l = new LargeNumber();
        String answer = l.solution("1924", 2);
        assertEquals("94", answer);
    }

    @Test
    void solution2() {
        LargeNumber l = new LargeNumber();
        String answer = l.solution("1231234", 3);
        assertEquals("3234", answer);
    }

    @Test
    void solution3() {
        LargeNumber l = new LargeNumber();
        String answer = l.solution("4177252841", 4);
        assertEquals("775841", answer);
    }
}