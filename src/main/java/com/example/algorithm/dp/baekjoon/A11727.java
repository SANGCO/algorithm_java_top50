package com.example.algorithm.dp.baekjoon;

public class A11727 {

    private int[] d = new int[1001];

    public int dp(int x) {
        // D[n] = D[n-1] + 2 * D[n-2]
        // 강의에서 점화식 도출하는 부분 특히 왜 곱하기 2인지 체크
        if (x == 1) return 1;
        if (x == 2) return 3;
        if (d[x] != 0) return d[x];
        return d[x] = (dp(x - 1) + 2 * dp(x - 2)) % 10007;
    }

    public static void main(String[] args) {
        A11727 a11727 = new A11727();
        System.out.println(a11727.dp(2));
        System.out.println(a11727.dp(8));
    }

}
