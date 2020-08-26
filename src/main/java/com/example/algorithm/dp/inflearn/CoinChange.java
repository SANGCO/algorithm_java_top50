package com.example.algorithm.dp.inflearn;

import java.util.Arrays;

// https://github.com/codingstudy-pushup/javacoding_top50/blob/master/Dynamic/%EC%BD%94%EB%94%A9%EB%8F%99%EC%98%81%EC%83%8150%EB%AC%B8%EC%A0%9C%20Dynamic.pdf

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

        // i는 1부터 11까지
        // 각각 1일 때 동전 몇개 필요한지 ... 11일 때 동전 몇개 필요한지
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                // i가 3이면 -> 3일 때 동전 몇개 필요한가
                // 그러면 3보다 큰 동전은 for문을 돌 필요가 없겠지?
                if (i >= coins[j]) {
                    // i에 동전 하나 빼고(coins[j]) 남은값을 만들려면 몇개 필요한지
                    // dp 배열에 물어보고 동전 하나 뺐으니깐 1 더해주고
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

}
