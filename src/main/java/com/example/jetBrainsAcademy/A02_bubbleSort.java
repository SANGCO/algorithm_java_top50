package com.example.jetBrainsAcademy;

public class A02_bubbleSort {

    public static void main(String[] args) {
        bubbleSort(new int[] { 21, 23, 19, 30, 11, 28 }); // { 11, 19, 21, 23, 28, 30 }
        bubbleSort(new int[] { 30, 28, 23, 21, 19, 11 }); // { 11, 19, 21, 23, 28, 30 }
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                /* if a pair of adjacent elements has the wrong order it swaps them */
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

}
