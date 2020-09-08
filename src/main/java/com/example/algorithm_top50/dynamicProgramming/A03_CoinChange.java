package com.example.algorithm_top50.dynamicProgramming;

import java.util.Arrays;

// https://github.com/codingstudy-pushup/javacoding_top50/blob/master/Dynamic/%EC%BD%94%EB%94%A9%EB%8F%99%EC%98%81%EC%83%8150%EB%AC%B8%EC%A0%9C%20Dynamic.pdf

public class A03_CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount)); //3
    }

    private static int coinChange(int[] coins, int amount) {



        return 0;
    }













    // 찾고자 하는 값 amount
    // amount가 10 일 때
    // 1일 때 동전 몇개 필요하고 2일 때 동전 몇개 필요하고 ... 10일 때 몇개 필요하고
    // 밑에서 부터 값을 계산을 하고 계산한 값을 사용

    // 10일 때 동전 5에 경우 10보다 작으니 for문을 타고
    // 10 - 5 = 5 5를 만들기 위해 필요한 동전 수 + 동전 한개(5)
    // 이게 10을 만들기 위한 동전 개수


    private static int coinChange1(int[] coins, int amount) {
        int max = amount + 1;
        int dp[] = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

}
