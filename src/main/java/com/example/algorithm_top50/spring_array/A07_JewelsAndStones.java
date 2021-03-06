package com.example.algorithm_top50.spring_array;

import java.util.HashSet;
import java.util.Set;

public class A07_JewelsAndStones {

    public int solve(String jew, String stone) {
        Set<Character> set = new HashSet<>();

        for (char jewel : jew.toCharArray()) {
            set.add(jewel);
        }
        int count = 0;

        for (char stoneChar : stone.toCharArray()) {
            if (set.contains(stoneChar)) {
                count++;
            }
        }
        return count;
    }

}
