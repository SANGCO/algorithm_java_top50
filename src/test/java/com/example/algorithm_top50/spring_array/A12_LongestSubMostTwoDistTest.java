package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A12_LongestSubMostTwoDistTest {

    @Test
    void lengthOfLongestSubstringTwoDistinct() {
        A12_LongestSubMostTwoDist l = new A12_LongestSubMostTwoDist();
        int answer = l.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        assertEquals(5, answer);
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_do() {
        A12_LongestSubMostTwoDist_do l = new A12_LongestSubMostTwoDist_do();
        int answer = l.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        assertEquals(5, answer);
    }
}