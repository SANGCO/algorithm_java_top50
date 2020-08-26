package com.example.algorithm;

import java.util.Arrays;

public class For {

    /*
     * 인프런 - DP - LongestIncreasingSubsequence
     * 처음부터 현재 i까지 비교
     */
    public int for2(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    /*
     * 프로그래머스 - 해시 - 전화번호 목록
     * 하나하나 전체 비교
     * i 잡고 (i + 1) ~ phoneBook.length 까지 하나하나 비교
     */
     public boolean for1(String[] phoneBook) {
         for(int i = 0; i < phoneBook.length - 1; i++) {
             for(int j = i + 1; j < phoneBook.length; j++) {
                 if(phoneBook[i].startsWith(phoneBook[j])) return false;
                 if(phoneBook[j].startsWith(phoneBook[i])) return false;
             }
         }
         return true;
     }



}
