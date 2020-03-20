package com.example.algorithm_top50.spring_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A03_TwoSum_do {
    public static void main(String[] args) {
        int[] nums = {11, 21, 2, 8};
        int target = 10;
        int[] result = solve(nums, target);
        Arrays.stream(result).forEach(System.out::print);
    }

    public static int[] solve(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                answer[0] = map.get(nums[i]);
                answer[1] = i;
            }
            else map.put(target - nums[i], i);
        }
        return answer;
    }
}
