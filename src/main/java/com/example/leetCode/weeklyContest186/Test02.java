package com.example.leetCode.weeklyContest186;

public class Test02 {

    public int maxScore(int[] cardPoints, int k) {
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
