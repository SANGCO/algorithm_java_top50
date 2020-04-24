package com.example.programmers.e_완전탐색;

public class Carpet {

    public int[] solution(int brown, int red) {
        int[] answer = new int[2];

        for (int width = (brown / 2) - 1; width > 0; width--) {
            int length = ((brown - (2 * width)) / 2) + 2;
            if (red == ((width - 2)  * (length - 2))) {
                answer[0] = width;
                answer[1] = length;
                break;
            }
        }
        return answer;
    }
}
