package com.example.algorithm_top50.spring_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A03_TwoSum {

    public static int[] solve(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        // 11, 21, 2, 8
        // target 10
        // 3번째 2에 입장에서는 10 - 2, 8을 찾고 있으니깐
        // 키 값으로 8 넣고 벨류에 자기자신 인덱스
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);;
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {11, 21, 2, 8};
        int target = 10;
        int[] result = solve(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }
}
