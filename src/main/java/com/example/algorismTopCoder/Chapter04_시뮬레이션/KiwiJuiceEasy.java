package com.example.algorismTopCoder.Chapter04_시뮬레이션;

import java.util.Arrays;

import static java.lang.Math.min;

public class KiwiJuiceEasy {

    public static void main(String[] args) {
        int[] capacities = {20, 20};
        int[] bottles = {5, 8};
        int [] fromId = {0};
        int [] toId = {1};

        System.out.println(Arrays.toString(thePouring(capacities, bottles, fromId, toId))); // expect [0, 13]
    }

    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

        for (int i=0; i<fromId.length; i++) {
            int sum = bottles[fromId[i]] + bottles[toId[i]]; // A병을 들어 B병에 주스를 붓는다.
            bottles[toId[i]] = min(sum, capacities[toId[i]]); // B병의 최대 용량이 max, sum은 그걸 넘을 수도 있다.
            bottles[fromId[i]] = sum - bottles[toId[i]]; // A병에 남은 양은 A, B 더한거에 현재 B의 용량을 빼면 알 수 있음.
        }

        return bottles;
    }

}

