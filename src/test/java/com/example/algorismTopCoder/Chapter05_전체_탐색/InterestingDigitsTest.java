package com.example.algorismTopCoder.Chapter05_전체_탐색;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestingDigitsTest {

    @Test
    void digits1() {
        InterestingDigits i = new InterestingDigits();
        int[] digits1 = i.digits1(10);
        assertArrayEquals(new int[]{3, 9}, digits1);
        int[] digits2 = i.digits2(10);
        assertArrayEquals(new int[]{3, 9}, digits2);
    }

    @Test
    void digits2() {
        InterestingDigits i = new InterestingDigits();
        int[] digits1 = i.digits1(3);
        assertArrayEquals(new int[]{2}, digits1);
        int[] digits2 = i.digits2(3);
        assertArrayEquals(new int[]{2}, digits2);
    }

    @Test
    void digits3() {
        InterestingDigits i = new InterestingDigits();
        int[] digits1 = i.digits1(9);
        assertArrayEquals(new int[]{2, 4, 8}, digits1);
        int[] digits2 = i.digits2(9);
        assertArrayEquals(new int[]{2, 4, 8}, digits2);
    }

    @Test
    void digits4() {
        InterestingDigits i = new InterestingDigits();
        int[] digits1 = i.digits1(26);
        assertArrayEquals(new int[]{5, 25}, digits1);
        int[] digits2 = i.digits2(26);
        assertArrayEquals(new int[]{5, 25}, digits2);
    }

    @Test
    void digits5() {
        InterestingDigits i = new InterestingDigits();
        int[] digits1 = i.digits1(30);
        assertArrayEquals(new int[]{29}, digits1);
        int[] digits2 = i.digits2(30);
        assertArrayEquals(new int[]{29}, digits2);
    }

}