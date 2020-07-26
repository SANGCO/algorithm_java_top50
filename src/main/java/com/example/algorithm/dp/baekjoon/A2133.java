package com.example.algorithm.dp.baekjoon;

public class A2133 {

    private int[] d = new int[1001];

    public int dp(int x) {
        // 밑에 2개의 if문은 이해가 안되네
        if (x == 0) return 1;
        if (x == 1) return 0;
        // 세로3 x 가로2 = 3가지 경우에 수가 있다.
        if (x == 2) return 3;
        if (d[x] != 0) return d[x];
        int result = 3 * dp(x - 2);
        for (int i = 3; i <= x; i++) {
            if (i % 2 == 0) { // 짝수 찾기
                result += 2 * dp(x - i);
            }
        }
        return d[x] = result; // 자바에서도 이런식으로 쓰나?
    }

    public static void main(String[] args) {
        A2133 a2133 = new A2133();
        System.out.println(a2133.dp(2));
    }

}
