package com.example.algorithm_top50.dynamicProgramming;

public class ClimbingStairs2 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if (n == 1) return 1;
        if (n == 2) return 2;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
