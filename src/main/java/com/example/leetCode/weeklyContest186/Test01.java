package com.example.leetCode.weeklyContest186;

// Maximum Score After Splitting a String
public class Test01 {

    public int maxScore(String s) {
        int answer = 0;

        int half = (int) Math.floor(s.length() / 2);
        String substring1 = new StringBuffer(s.substring(0, half)).reverse().toString();
        String substring2 = s.substring(half, s.length());

        int firstZero = 0;
        int secondOne = 0;

        char[] chars1 = substring1.toCharArray();

        for (char c : chars1) {

            if (c == '0') {
                firstZero++;
            }
        }

        char[] chars2 = substring2.toCharArray();

        for (char c : chars2) {

            if (c == '1') {
                secondOne++;
            }
        }

        int temp1 = firstZero + secondOne;
        answer = Math.max(answer, temp1);

        for (int i = 0; i < chars1.length - 1; i++) {

            if (chars1[i] == '0') {
                temp1--;
            }

            if (chars1[i] == '1') {
                temp1++;
            }
            answer = Math.max(answer, temp1);
        }

        int temp2 = firstZero + secondOne;

        for (int i = 0; i < chars2.length - 1; i++) {

            if (chars2[i] == '0') {
                temp2++;
            }

            if (chars2[i] == '1') {
                temp2--;
            }
            answer = Math.max(answer, temp2);
        }

        return answer;
    }

    public int maxScore1(String s) {
        int n = s.length();
        int c1 = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') c1++;
        }
        int max = 0;
        int c2 = 0;
        for(int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == '0') c2++;
            else c1--;
            max = Math.max(max, c1 + c2);
        }
        return max;
    }

}
