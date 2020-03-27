package com.example.algorithm_top50.spring_array;

import java.util.HashSet;
import java.util.Set;

public class A07_JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(solve(J, S));
    }

    public static int solve(String jew, String stone) {
        Set<Character> set = new HashSet<>();
        for (char jewel : jew.toCharArray()) {
            set.add(jewel); // a, A
        }

        int count = 0;
        for (char stoneChar : stone.toCharArray()) {
            System.out.println("stoneChar: " + stoneChar);
            if (set.contains(stoneChar)) {
                count++;
            }
        }
        return count;
    }

}
