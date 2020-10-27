package com.example.programmers.g_깊이_너비_우선_탐색;

public class TargetNumber {

    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer += dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int index, int prev) {
        if (index == numbers.length) {
            if (target == prev) return 1;

            return 0;
        }

        return dfs(numbers, target, (index + 1), (prev + numbers[index]))
                + dfs(numbers, target, (index + 1), (prev - numbers[index]));
    }

}
