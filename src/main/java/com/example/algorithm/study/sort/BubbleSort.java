package com.example.algorithm.study.sort;

// 버블버블버블 하면서 큰걸 뒤로 보낸다.
// j < arr.length - i;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort(new int[]{3, 9, 0, 1, 5, 8, 6, 2, 4, 7});
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}