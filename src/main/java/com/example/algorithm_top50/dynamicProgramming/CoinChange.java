package com.example.algorithm_top50.dynamicProgramming;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    private static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    // dp[i - coins[j]]
                    // i가 5면 5 - 코인 한개(2짜리 코인) 해서 나온 값이 3이면
                    // 미리 계산해 놓은 배열에서 3 만들려면 몇개 구해야는지 가지고 오고
                    // 5를 만들려면 2짜리 코인 하나 더 필요하니깐 더하기 1
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

}
