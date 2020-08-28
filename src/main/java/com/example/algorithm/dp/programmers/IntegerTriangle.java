package com.example.algorithm.dp.programmers;

public class IntegerTriangle {

    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                // 제일 왼쪽일 경우
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                }
                // 제일 오른쪽일 경우
                else if (i == j) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                } else {
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }

                if (triangle[i][j] > answer) {
                    answer = triangle[i][j];
                }
            }
        }
        return answer;
    }

}
