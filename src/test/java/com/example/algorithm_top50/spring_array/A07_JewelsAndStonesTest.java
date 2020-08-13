package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A07_JewelsAndStonesTest {

    @Test
    void solve() {
        A07_JewelsAndStones j = new A07_JewelsAndStones();
        int answer = j.solve("aA", "aAAbbbb");
        assertEquals(answer, 3);
    }

}