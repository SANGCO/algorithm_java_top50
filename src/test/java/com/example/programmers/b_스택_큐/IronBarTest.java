package com.example.programmers.b_스택_큐;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronBarTest {

    @Test
    void solution() {
        IronBar i = new IronBar();
        int answer = i.solution1("()(((()())(())()))(())");
        assertEquals(17, answer);
    }
}