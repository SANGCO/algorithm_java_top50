package com.example.programmers.g_깊이_너비_우선_탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {

    @Test
    void test() {
        Network network = new Network();
        int answer = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {1, 1, 0}});
        assertEquals(2, answer);
    }

}