package com.example.algorithm_top50.dynamicProgramming;

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

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    // dp[i - coins[j]]
                    // i가 5면 5 - 코인 한개(2짜리 코인) 해서 나온 값이 3이면
                    // 미리 계산해 놓은 배열에서 3 만들려면 몇개 구해야는지 가지고 오고
                    // 5를 만들려면 2짜리 코인 하나 더 필요하니깐 더하기 1

                    // 배열이 0번방 부터 amount까지 있다고 하자 {0, 1, 2, 3 ... 11}
                    // 1을 만들 때 코인 몇개 필요한지
                    // 3을 만들 때 코인 몇개 필요한지
                    // 11을 만들 때 코인 몇개 필요한지
                    // 10번째 배열에는 10을 만들려면 몇개의 코인이 있어야하는지를 넣어 놓는다.

                    // dp[i - coins[j]]
                    // i가 10이면 10에서 동전 5 하나를 빼고 남은게 5라고 하면
                    // 배열에다 5를 만들려면 몇개의 동전이 필요한지를 가지고 와서 위에서 하나 빼줬으니 더하기 1

                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

}
