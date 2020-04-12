package com.example.programmers.d_정렬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void solution1() {
        LargestNumber l = new LargestNumber();
        String answer = l.solution(new int[]{6, 10, 2});
        assertEquals("6210", answer);
    }

    @Test
    void solution2() {
        LargestNumber l = new LargestNumber();
        String answer = l.solution(new int[]{3, 30, 34, 5, 9});
        assertEquals("9534330", answer);
    }

    @Test
    void solution3() {
        LargestNumber l = new LargestNumber();
        String answer = l.solution(new int[]{0,0,0,0,0});
        assertEquals("0", answer);
    }
}