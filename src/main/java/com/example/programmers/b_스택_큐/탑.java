package com.example.programmers.b_스택_큐;

import java.util.Arrays;
import java.util.Stack;

public class 탑 {

    public static void main(String[] args) {
        int[] nums = {3, 9, 9, 3, 5, 7, 2};
        int[] result = solution(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.empty() && heights[stack.peek()] < heights[i]) {
                int index = stack.pop();
                answer[index] = i + 1;
            }
            stack.push(i);
        }
        return answer;
    }

}
