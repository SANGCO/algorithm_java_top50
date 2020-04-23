package com.example.programmers.e_완전탐색;

public class Carpet {

    public int[] solution(int brown, int red) {
        int[] answer = new int[2];

        for (int horizontal = (brown / 2) - 1; horizontal > 0; horizontal--) {
            int vertical = ((brown - (2 * horizontal)) / 2) + 2;
            if (red == ((horizontal - 2)  * (vertical - 2))) {
                answer[0] = horizontal;
                answer[1] = vertical;
                break;
            }
        }
        return answer;
    }
}
