package com.example.jetBrainsAcademy;

public class A08_JumpSearch {

    public static void main(String[] args) {
        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34, 35 };

        jumpSearch(array, 10); // 0
        jumpSearch(array, 13); // 1
        jumpSearch(array, 19); // 2
        jumpSearch(array, 20); // 3
        jumpSearch(array, 24); // 4
        jumpSearch(array, 26); // 5
        jumpSearch(array, 30); // 6
        jumpSearch(array, 34); // 7
        jumpSearch(array, 35); // 8

        jumpSearch(array, -10); // -1
        jumpSearch(array, 11);  // -1
        jumpSearch(array, 27);  // -1
        jumpSearch(array, 37);  // -1
    }

    public static int jumpSearch(int[] array, int target) {
        int currentRight = 0; // right border of the current block
        int prevRight = 0; // right border of the previous block

        /* If array is empty, the element is not found */
        if (array.length == 0) {
            return -1;
        }

        /* Check the first element */
        if (array[currentRight] == target) {
            return 0;
        }

        /* Calculating the jump length over array elements */
        int jumpLength = (int) Math.sqrt(array.length);

        /* Finding a block where the element may be present */
        while (currentRight < array.length - 1) {

            /* Calculating the right border of the following block */
            currentRight = Math.min(array.length - 1, currentRight + jumpLength);

            if (array[currentRight] >= target) {
                break; // Found a block that may contain the target element
            }

            prevRight = currentRight; // update the previous right block border
        }

        /* If the last block is reached and it cannot contain the target value => not found */
        if ((currentRight == array.length - 1) && target > array[currentRight]) {
            return -1;
        }

        /* Doing linear search in the found block */
        return backwardSearch(array, target, prevRight, currentRight);
    }

    public static int backwardSearch(int[] array, int target, int leftExcl, int rightIncl) {
        for (int i = rightIncl; i > leftExcl; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
