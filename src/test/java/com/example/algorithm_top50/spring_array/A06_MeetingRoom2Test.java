package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A06_MeetingRoom2Test {

    @Test
    void solve() {
        A06_MeetingRoom2 m = new A06_MeetingRoom2();
        int answer = m.solve(new int[][]{{0, 30}, {5, 10}, {15, 20}});
        assertEquals(answer, 2);
        answer = m.solve(new int[][]{{7, 10}, {2, 4}});
        assertEquals(answer, 1);
    }
}