package com.example.algorithm_top50.dynamicProgramming;

import java.util.Arrays;

public class A4_LongestIncreasingSubsequence {

    public static void main(String[] args) {
        // 숫자 배열에서 증가하는 부분을 찾는다.
        // 1, 2, 3, 2, 5
        // 1, 2, 3, 5
        // 중간에 2 빼면 증가하는 부분은 4개
        // 1, 2, 3, 2, 5, 2, 6, 10, 4, 12
        // 1, 2, 3, 5, 6, 10, 12
        // 중간에 2, 2, 4 빼고 7
        int[] nums = {1, 2, 3, 2, 5, 2, 6, 10, 4, 12};
        System.out.println("value " + solve(nums));
    }

    private static int solve(int[] nums) {

        return 0;
    }










    private static int solve1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int answer = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }
}
