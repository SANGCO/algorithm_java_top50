package com.example.programmers.e_완전탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersBaseballTest {

    @Test
    void solution() {
        NumbersBaseball n = new NumbersBaseball();
        int answer = n.solution(new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}});
        assertEquals(2, answer);
    }
}