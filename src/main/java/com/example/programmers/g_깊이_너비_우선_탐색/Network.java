package com.example.programmers.g_깊이_너비_우선_탐색;

public class Network {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!chk[i]) {
                dfs(computers, chk, i);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);
            }
        }
    }

}
