package com.example.programmers.b_힙;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiskControllerTest {

    @Test
    void solution() {
        DiskController d = new DiskController();
        int answer = d.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
        assertEquals(9, answer);
    }
}