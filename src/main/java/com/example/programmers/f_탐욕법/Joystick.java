package com.example.programmers.f_탐욕법;

public class Joystick {

    public int solution(String name) {
        int answer = 0;

        for (char c : name.toCharArray()) {
            int f = c - 'A';
            int r = 'Z' - c + 1;
            answer += Math.min(f, r);
        }
        int length = name.length();
        int minMove = length - 1;
        for (int i = 0; i < length; i++) {
          if (name.charAt(i) == 'A') {
              int next = i + 1;
              while (next < length && name.charAt(next) == 'A') {
                  next++;
              }

              // (2 * i)는 갔다가 빽하기 위해서 다시 돌아가는거
              // (length - next)는 연속된 A가 끝나고 남은 거리
              int move = 2 * (i - 1) + length - next;
              minMove = Math.min(minMove, move);
          }
        }
        answer += minMove;
        return answer;
    }

}
