package com.example.algorithm_top50.spring_array;

import java.util.Arrays;

public class A02_MoveZeros {

    public static void main(String args[]) {
        int[] nums = { 0, 3, 2, 0, 8, 5 };
        int currentIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }

        while (currentIndex < nums.length) {
            nums[currentIndex] = 0;
            currentIndex++;
        }

        Arrays.stream(nums).forEach(System.out::print);
    }

}
