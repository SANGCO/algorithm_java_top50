package com.example.jetBrainsAcademy;

public class A07_LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, 3, 5};

        int search1 = search(numbers, 1);// 0
        int search2 = search(numbers, 2);// 3
        int search3 = search(numbers, 3);// 4
        int search4 = search(numbers, 4);// 1
        int search5 = search(numbers, 5);// 5
        int search6 = search(numbers, 6);// -1, no value found

        int search7 = searchInSortedArray(new int[]{8, 15, 19, 20, 21}, 10);// -1, the element 10 is not found
    }

    public static int search(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int searchInSortedArray(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            } else if (array[i] > value) {
                break;
            }
        }
        return index;
    }

}
