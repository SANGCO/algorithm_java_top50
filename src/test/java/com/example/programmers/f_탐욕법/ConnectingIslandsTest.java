package com.example.programmers.f_탐욕법;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectingIslandsTest {

    @Test
    void solution() {
        ConnectingIslands c = new ConnectingIslands();
        int answer = c.solution(4, new int[][]{{0,1,1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}});
        assertEquals(4, answer);
    }

}