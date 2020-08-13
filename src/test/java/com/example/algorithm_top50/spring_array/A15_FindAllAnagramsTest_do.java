package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class A15_FindAllAnagramsTest_do {

    @Test
    void findAnagrams() {
        A15_FindAllAnagrams f = new A15_FindAllAnagrams();
        List<Integer> expected = Arrays.asList(0, 5, 6);
        List<Integer> answer = f.findAnagrams("BACDGABCDA", "ABCD");
        assertIterableEquals(expected, answer);
    }

}