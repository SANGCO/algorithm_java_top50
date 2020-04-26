package com.example.leetCode.weeklyContest186;

public class Test02 {

    public int maxScore(int[] cardPoints, int k) {
        int answer = 0;

        int temp1 = 0;

        for (int i = 0; i < k; i++) {
            temp1 += cardPoints[i];
        }

        int temp2 = 0;

        for (int i = cardPoints.length - 1; i >= cardPoints.length - (1 + k); i--) {
            temp2 += cardPoints[i];
        }

        answer = Math.max(temp1, temp2);
        return answer;
    }

}
