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
    public int maxScore1(int[] cardPoints, int k) {
        int res = 0;
        int len = cardPoints.length;

        int start = len - k;
        int win = 0;

        for (int i = start; i < len + k; ++i) {
            win += cardPoints[i % len]; // accumulate the value of the sliding window.
            if (i - start >= k) { // Is the sliding window wider than k?
                win -= cardPoints[(i - k) % len]; // deduct the element from the left of the window.
            }
            res = Math.max(win, res); // update the maximum.
        }
        return res;
    }

}
