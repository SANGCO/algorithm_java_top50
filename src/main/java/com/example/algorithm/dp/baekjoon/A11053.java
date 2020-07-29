package com.example.algorithm.dp.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 가장 긴 증가하는 부분 수열
// https://www.acmicpc.net/problem/11053

public class A11053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] d = new int[size];
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            d[i] = 1;

            for (int j = 0; j < i; j++){

                // d[i] < d[j] + 1
                // j for문 돌면서 d[i]에 조건에 걸리면 계속 값을 변경해서 넣어주고 있는데
                // 넣으려는 값 d[j] + 1이 현재 들어있는 값 d[i]보다 크면 d[j] + 1을 넣어준다.
                if (arr[j] < arr[i] && d[i] < d[j] + 1){
                    d[i] = d[j] + 1;
                }
            }
        }

        System.out.println(Arrays.stream(d).max());
    }

}
