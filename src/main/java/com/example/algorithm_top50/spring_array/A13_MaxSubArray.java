package com.example.algorithm_top50.spring_array;

public class A13_MaxSubArray {

    public int maxSubArray(int[] nums) {
        int newSum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            newSum = Math.max(newSum + nums[i], nums[i]);
            max = Math.max(max, newSum);
        }
        return max;
    }

}
