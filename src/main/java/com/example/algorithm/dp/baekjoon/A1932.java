package com.example.algorithm.dp.baekjoon;

import java.util.Scanner;

// 정수 삼각형
// https://www.acmicpc.net/problem/1932

public class A1932 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max= 0, n = scan.nextInt();
        int[][] dp = new int[n][n];

        dp[0][0] = scan.nextInt();
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                dp[i][j] = scan.nextInt();

                // 제일 왼쪽에 경우 왼쪽 위가 없다.
                if(j == 0)
                    dp[i][j] += dp[i-1][j];
                // 제일 오른쪽에 경우 오른쪽 위가 없다.
                else if(j == i)
                    dp[i][j] += dp[i-1][j-1];
                // 중간에 있는건 왼쪽과 오른쪽 중에 큰걸 선택
                else
                    dp[i][j] += Math.max(dp[i-1][j], dp[i-1][j-1]);

                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);
    }

}
