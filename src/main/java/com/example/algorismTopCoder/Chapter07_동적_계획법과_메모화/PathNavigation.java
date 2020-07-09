package com.example.algorismTopCoder.Chapter07_동적_계획법과_메모화;

public class PathNavigation {

    private static class code7_2 {
        int h = 5, w = 4;
        int[][] dp = new int[h + 1][w + 1];

        int dfs(int nowh, int noww) {
            if (nowh > h || noww > w) return 0;
            if (nowh == h && noww == w) return 1;
            if (dp[nowh][noww] != 0) return dp[nowh][noww];
            return dp[nowh][noww] = dfs(nowh + 1, noww) + dfs(nowh, noww + 1);
        }
    }

    private static class code7_3 {
        int h = 5, w = 4;
        int[][] dp = new int[h + 1][w + 1];

        void cals() {
            int i, j;
            dp[0][0] = 1;

            for (i = 0; i < h; i++) {

                for (j = 0; j < w; j++) {
                    if (i != 0) dp[i][j] += dp[i - 1][j];
                    if (i != 0) dp[i][j] += dp[i][j - 1];
                }
            }
        }
    }
}




