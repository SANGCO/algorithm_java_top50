package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A14_FindAnagramMappingTest_do {

    @Test
    void anagramMappings() {
        A14_FindAnagramMapping f = new A14_FindAnagramMapping();
        int[] answer = f.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});
        assertArrayEquals(new int[]{1, 4, 3, 2, 0}, answer);
    }

    @Test
    void anagramMappings_do() {
        A14_FindAnagramMapping_do f = new A14_FindAnagramMapping_do();
        int[] answer = f.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});
        assertArrayEquals(new int[]{1, 4, 3, 2, 0}, answer);
    }
}