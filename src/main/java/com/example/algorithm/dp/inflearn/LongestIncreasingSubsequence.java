package com.example.algorithm.dp.inflearn;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        LongestIncreasingSubsequence a = new LongestIncreasingSubsequence();
        int[] nums = {1, 2, 3, 2, 5, 2, 6, 10, 4, 12};
//		int[] nums = {9, 11, 2, 8, 4, 7, 88, 15};

        System.out.println("value "+ solve(nums));
    }

    private static int solve(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }

}
