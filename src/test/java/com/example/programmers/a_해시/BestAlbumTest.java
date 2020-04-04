package com.example.programmers.a_해시;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestAlbumTest {

    @Test
    void solution() {
        BestAlbum b = new BestAlbum();
        int[] answer1 = b.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        assertArrayEquals(new int[]{4, 1, 3, 0}, answer1);
        int[] answer2 = b.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 800, 800, 2500});
        assertArrayEquals(new int[]{4, 1, 2, 3}, answer2);
    }
}