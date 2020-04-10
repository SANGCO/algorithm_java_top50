package com.example.programmers.b_힙;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublePiorityQueueTest {

    @Test
    void solution1() {
        DoublePiorityQueue d = new DoublePiorityQueue();
        int[] answer = d.solution(new String[]{"I 16", "D 1"});
        assertArrayEquals(new int[]{0, 0}, answer);
    }

    @Test
    void solution2() {
        DoublePiorityQueue d = new DoublePiorityQueue();
        int[] answer = d.solution(new String[]{"I 7", "I 5", "I -5", "D -1"});
        assertArrayEquals(new int[]{7, 5}, answer);
    }
}