package com.example.algorithm_top50.spring_array;

import java.util.Arrays;
import java.util.Stack;

public class A04_DailyTemperature_do {

    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = solution(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] solution(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < temperatures.length; i++) {
            if (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                answer[index] = i;
            }
            else stack.push(i);
        }
        return answer;
    }

}
