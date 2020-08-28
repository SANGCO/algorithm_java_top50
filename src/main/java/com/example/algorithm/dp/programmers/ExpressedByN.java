package com.example.algorithm.dp.programmers;

public class ExpressedByN {

    int answer;

    public int solution(int N, int number) {
        answer = 9;
        dfs(N, number, 0, 0);
        if (answer == 9) return -1;
        return answer;
    }

    public void dfs(int N, int target, int number, int count) {
        if (count > 8) return;
        if (number == target) {
            if (count < answer) {
                answer = count;
            }
            return;
        }

        int cal = 0;
        for (int i = 0; i < 5; i++) {
            cal = cal * 10 + N;
            dfs(N, target, number + cal, count + (1 + i));
            dfs(N, target, number - cal, count + (1 + i));
            dfs(N, target, number * cal, count + (1 + i));
            dfs(N, target, number / cal, count + (1 + i));
        }
    }

}
