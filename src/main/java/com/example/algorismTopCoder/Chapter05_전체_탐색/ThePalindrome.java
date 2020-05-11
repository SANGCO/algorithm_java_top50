package com.example.algorismTopCoder.Chapter05_전체_탐색;

public class ThePalindrome {

    public int find(String s) {

        // 답의 문자 길이를 결정합니다.
        for (int i = s.length(); ; i++) {
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {

                // 반대쪽에 문자가 존재하는데 다를 경우 플래그를 변경합니다.

                // 최악의 길이의 회문을 알 수 있다. (length()에 -1 해서 더하면 된다.
                // 밑에 조건식으로 주어진 글자의 안쪽에 회문이 있는지를 찾는다.
                // abcfff가 주어지면 뒤에 fff는 회문이다. 뒤에 앞에 글자들만 뒤집어서 붙여주면 된다.

                // 제일 뒤에 문자를 잡아서 앞에서 부터 하나하나 치고 올라오면서 비교하는 저 조건식 저 방식을 기억하자.

                if ((i - j - 1) < s.length() && s.charAt(j) != s.charAt(i - j - 1)) {
                    System.out.println("s.charAt(i - j - 1) " + s.charAt(i - j - 1));
                    System.out.println("s.charAt(j) " + s.charAt(j));
                    flag = false;
                    break;
                }
            }

            // 조건을 모두 만족하면 답을 리턴합니다.
            if (flag) return i;
        }
    }

    public int solution(String s) {

        for (int i = s.length(); ; i--) {
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {

                if (j < (i - j - 1) && s.charAt(j) != s.charAt(i - j - 1)) {
                    System.out.println("s.charAt(i - j - 1) " + s.charAt(i - j - 1));
                    System.out.println("s.charAt(j) " + s.charAt(j));
                    flag = false;
                    break;
                }
            }

            if (flag) return i;
        }
    }
}
