package com.example.algorithm.dp.baekjoon;

public class A11726 {

    private int[] d = new int[1001];

    public int dp(int x) {
        // 나올 수 있는 2가지 케이스를 if문으로
        if (x == 1) return 1;
        if (x == 2) return 2;
        if (d[x] != 0) return d[x];
        return d[x] = (dp(x - 1) + dp(x - 2)) % 10007;
    }

    public static void main(String[] args) {
        A11726 a11726 = new A11726();
        System.out.println(a11726.dp(2));
        System.out.println(a11726.dp(9));
    }

}
