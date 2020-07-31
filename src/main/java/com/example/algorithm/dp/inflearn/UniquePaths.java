package com.example.algorithm_top50.dynamicProgramming;

// https://github.com/codingstudy-pushup/javacoding_top50/blob/master/Dynamic/%EC%BD%94%EB%94%A9%EB%8F%99%EC%98%81%EC%83%8150%EB%AC%B8%EC%A0%9C%20Dynamic.pdf

public class UniquePaths {

    public static void main(String[] args) {
        int m = 7, n = 3;
        System.out.println(uniquePaths(m, n));
    }

    private static int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];

        for (int i = 0; i < m; i++) {
            map[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            map[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 1 1 1
                // 1 2 3
                // 2는 x축으로 하나뺀거와 y축으로 하나 뺀거를 더한거다.
                // 1 + 1 = 2
                map[i][j] = map[i][j - 1] + map[i - 1][j];
            }
        }

        return 0;
    }

}
