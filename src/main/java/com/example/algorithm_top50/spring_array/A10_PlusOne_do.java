package com.example.algorithm_top50.spring_array;

public class A10_PlusOne_do {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            }
            else
                digits[i] = 0;
        }

        if (digits[0] == 0) {
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            return answer;
        }
        return digits;
    }

}
