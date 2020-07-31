package com.example.algorithm_top50.dynamicProgramming;

// https://github.com/codingstudy-pushup/javacoding_top50/blob/master/Dynamic/%EC%BD%94%EB%94%A9%EB%8F%99%EC%98%81%EC%83%8150%EB%AC%B8%EC%A0%9C%20Dynamic.pdf

public class ClimbingStairs {

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
