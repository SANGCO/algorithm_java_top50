package com.example.programmers.d_정렬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthNumberTest {

    @Test
    void solution() {
        KthNumber k = new KthNumber();
        int[] answer = k.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        assertArrayEquals(new int[]{5, 6, 3}, answer);
    }
}