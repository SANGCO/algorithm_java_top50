package com.example.programmers.b_스택_큐;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDevelopmentTest {

    @Test
    void solution() {
        FunctionDevelopment f = new FunctionDevelopment();
        int[] answer = f.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        assertArrayEquals(new int[]{2, 1}, answer);
    }
}