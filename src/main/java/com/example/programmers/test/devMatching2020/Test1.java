package com.example.programmers.test.devMatching2020;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public int solution(String p, String s) {
        char[] pChar = p.toCharArray();
        char[] sChar = s.toCharArray();
        int answer = 0;

        for (int i = 0; i < pChar.length; i++) {
            int normal = Math.abs(Integer.parseInt(String.valueOf(pChar[i])) - Integer.parseInt(String.valueOf(sChar[i])));
            int reverse = 10 - normal;
            answer += Math.min(normal, reverse);
        }
        return answer;
    }


    public int solution1(String p, String s) {
        char[] pChar = p.toCharArray();
        char[] sChar = s.toCharArray();
        List<Lock> list = new ArrayList<>(pChar.length);

        for (int i = 0; i < pChar.length; i++) {
            list.add(new Lock(pChar[i], sChar[i]));
        }
        list.forEach(Lock::solve);


        int answer = 13;
        return answer;
    }

    private class Lock {

        int gridLines;

        int password;

        int answer;

        int[] patten = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> normal;

        List<Integer> reverse;

        public Lock(char gridLines, char password) {
            this.answer = 0;
            this.gridLines = Integer.parseInt(String.valueOf(gridLines));
            this.password = Integer.parseInt(String.valueOf(password));
            this.normal = Arrays.stream(patten).boxed().collect(Collectors.toCollection(LinkedList::new));
            this.reverse = new LinkedList<Integer>(normal).stream()
                                                          .sorted(Comparator.reverseOrder())
                                                          .collect(Collectors.toCollection(LinkedList::new));
        }

        public void solve() {
            int normalAnswer = 0;
            int reverseAnswer = 0;

            boolean isMatch = false;

            while (isMatch) {
            }
            isMatch = false;



            answer = Math.max(normalAnswer, reverseAnswer);
        }
    }

}
