package com.example.programmers.e_완전탐색;

import java.util.*;
import java.util.stream.Collectors;

public class NumbersBaseball {

    public int solution(int[][] baseball) {

        List<String> list1 = Arrays.stream(baseball)
                                  .map(i -> String.valueOf(i[0]).split(""))
                                  .flatMap(Arrays::stream)
                                  .distinct()
                                  .collect(Collectors.toList());


        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        for (int[] ball : baseball) {

            for (char c : String.valueOf(ball[0]).toCharArray()) {

                set.add(String.valueOf(c));
            }
        }

        for (String f : set) {

            for (String s : set) {

                for (String t : set) {

                    if (!s.equals(f) && !t.equals(f) && !t.equals(s)) {
                        list.add(f + s + t);
                    }
                }
            }
        }


        for (String nub : list) {
            boolean isTrue = true;

            for (int[] ball : baseball) {

                if (!check(ball, nub)) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) {
                answer.add(nub);
            }
        }
        return answer.size();
    }

    private boolean check(int[] baseball, String nub) {
        int strike = 0;
        int ball = 0;
        char[] numbArray = nub.toCharArray();
        char[] temp = String.valueOf(baseball[0]).toCharArray();

        for (int i = 0; i < numbArray.length; i++) {

            if (temp[i] == numbArray[i]) {
                strike++;
            }
        }

        for (char a : numbArray) {

            for (char b : temp) {

                if (a == b) {
                    ball++;
                }
            }
        }
        ball -= strike;
        return baseball[1] == strike && baseball[2] == ball;
    }
}
