package com.example.algorithm.study.sort;

import java.util.Arrays;

// 어디다 넣을지 위치를 정해 놓고
// 안쪽 for 문을 돌면서 제일 작은거 찾아서 넣기

public class SelectionSort {

    public static void main(String[] args) {
        selectionSort(new int[]{3, 9, 0, 1, 5, 8, 6, 2, 4, 7});
    }

    public static void selectionSort(int[] arr) {
        int index, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}















//void selectionSort(int[] arr) {
//    int indexMin, temp;
//    for (int i = 0; i < arr.length-1; i++) {        // 1.
//        indexMin = i;
//        for (int j = i + 1; j < arr.length; j++) {  // 2.
//            if (arr[j] < arr[indexMin]) {           // 3.
//                indexMin = j;
//            }
//        }
//        // 4. swap(arr[indexMin], arr[i])
//        temp = arr[indexMin];
//        arr[indexMin] = arr[i];
//        arr[i] = temp;
//  }
//  System.out.println(Arrays.toString(arr));
//}
