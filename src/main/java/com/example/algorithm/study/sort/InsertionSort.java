package com.example.algorithm.study.sort;

public class InsertionSort {

    public static void main(String[] args) {
        insertionSort(new int[]{3, 9, 0, 1, 5, 8, 6, 2, 4, 7});
    }

    public static void insertionSort(int[] arr) {

    }

}

//void insertionSort(int[] arr)
//{
//   for(int index = 1 ; index < arr.length ; index++){ // 1.
//      int temp = arr[index];
//      int prev = index - 1;
//      while( (prev >= 0) && (arr[prev] > temp) ) {    // 2.
//         arr[prev+1] = arr[prev];
//         prev--;
//      }
//      arr[prev + 1] = temp;                           // 3.
//   }
//   System.out.println(Arrays.toString(arr));
//}