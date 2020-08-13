package com.example.algorithm.temp.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {

    private StringCompression sc;

    @BeforeEach
    public void setUp() {
        sc = new StringCompression();
    }

    @Test
    public void test1() {
        int answer = sc.solution("aabbaccc");
        assertEquals(7, answer);
    }

    @Test
    public void test2() {
        int answer = sc.solution("abcabcabcabcdededededede");
        assertEquals(14, answer);
    }

    @Test
    public void test3() {
        int answer = sc.solution("xababcdcdababcdcd");
        assertEquals(17, answer);
    }

}