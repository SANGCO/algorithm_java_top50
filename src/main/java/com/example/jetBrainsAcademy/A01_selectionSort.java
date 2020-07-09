package com.example.jetBrainsAcademy;

public class A01_selectionSort {

    public static void main(String[] args) {
        selectionSort(new int[] { 21, 23, 19, 30, 11, 28 }); // { 11, 19, 21, 23, 28, 30 }
        selectionSort(new int[] { 30, 28, 23, 21, 19, 11 }); // { 11, 19, 21, 23, 28, 30 }

    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i; // the index of the found min

            /* Iterating over the unsorted subarray to find the min */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            /* Exchanging the found min and the current element */
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }

        return array;
    }


}
