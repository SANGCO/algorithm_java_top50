package com.example.programmers.e_완전탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeNumbersTest {

    @Test
    void solution1() {
        FindPrimeNumbers f = new FindPrimeNumbers();
        int answer = f.solution("17");
        assertEquals(3, answer);
    }

    @Test
    void solution2() {
        FindPrimeNumbers f = new FindPrimeNumbers();
        int answer = f.solution("011");
        assertEquals(2, answer);
    }
}