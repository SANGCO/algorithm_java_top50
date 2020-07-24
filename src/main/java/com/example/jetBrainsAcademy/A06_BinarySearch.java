package com.example.jetBrainsAcademy;

public class A06_BinarySearch {

    public static void main(String[] args) {
        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34, 35 };

        int from = 0;
        int to = array.length - 1;

        int indexOf10 = binarySearch(array, 10, from, to); // 0
        int indexOf19 = binarySearch(array, 19, from, to); // 2
        int indexOf26 = binarySearch(array, 26, from, to); // 5
        int indexOf34 = binarySearch(array, 34, from, to); // 7
        int indexOf35 = binarySearch(array, 35, from, to); // 8

        int indexOf5 = binarySearch(array, 5, from, to);   // -1
        int indexOf16 = binarySearch(array, 16, from, to); // -1
        int indexOf40 = binarySearch(array, 40, from, to); // -1

        from = 0;
        to = 2;

        indexOf10 = recursiveBinarySearch(array, 10, from, to); // 0
        indexOf19 = recursiveBinarySearch(array, 19, from, to); // 2
        indexOf26 = recursiveBinarySearch(array, 26, from, to); // -1
        indexOf34 = recursiveBinarySearch(array, 34, from, to); // -1
        indexOf35 = recursiveBinarySearch(array, 35, from, to); // -1
    }

    // Iterative implementation
    public static int binarySearch(int[] array, int elem, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // the index of the middle element

            if (elem == array[mid]) {
                return mid; // the element is found, return its index
            } else if (elem < array[mid]) {
                right = mid - 1; // go to the left subarray
            } else {
                left = mid + 1;  // go the the right subarray
            }
        }
        return -1; // the element is not found
    }

    public static int recursiveBinarySearch(int[] array, int elem, int left, int right) {
        if (left > right) {
            return -1; // search interval is empty, the element is not found
        }

        int mid = left + (right - left) / 2; // the index of the middle element

        if (elem == array[mid]) {
            return mid; // the element is found, return its index
        } else if (elem < array[mid]) {
            return binarySearch(array, elem, left, mid - 1); // go to the left subarray
        } else {
            return binarySearch(array, elem, mid + 1, right); // go the the right subarray
        }
    }

}
