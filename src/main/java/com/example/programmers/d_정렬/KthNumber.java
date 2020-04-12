package com.example.programmers.d_정렬;

import java.util.Arrays;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int ith = commands[i][0];
            int jth = commands[i][1];
            int k = commands[i][2];
            int[] temp = Arrays.copyOfRange(array, ith - 1, jth);
            Arrays.sort(temp);
            answer[i] = temp[k - 1];
        }
        return answer;
    }

}
