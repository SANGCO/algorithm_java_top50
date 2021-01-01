package com.example.programmers.코딩테스트.dev2020;

public class A {

    public static void main(String[] args) {

//        System.out.println(solution("AAA", "BBB"));

        System.out.println("djflasdjflksdjflsajdlf".compareTo("gklfjlgfjjgklfjgldkjf"));


    }


    public static String solution(String s1, String s2) {
        String answer = "";
        int resultOneInt = countOverlap(s1, s2);
        int resultTwoInt = countOverlap(s2, s1);
        if (resultOneInt == resultTwoInt) {
            String resultOne = substringAndConcat(s1, s2, resultOneInt);
            String resultTwo = substringAndConcat(s2, s1, resultTwoInt);
            return (resultOne.compareTo(resultTwo) < 0) ? resultOne : resultTwo;
        }
        answer = (resultOneInt > resultTwoInt) ?
                substringAndConcat(s1, s2, resultOneInt) : substringAndConcat(s2, s1, resultTwoInt);
        return answer;
    }

    private static int countOverlap(String s1, String s2) {
        int result = 0;
        int s1Length = s1.length();
        int length = Math.min(s1Length, s2.length());
        for (int i = 0; i < length; i++) {
            String substringS1 = s1.substring(s1Length - (i + 1), s1Length);
            String substringS2 = s2.substring(0, (i + 1));
            if (substringS1.equals(substringS2)) {
                result = substringS1.length();
            }
        }
        return result;
    }


    private static String substringAndConcat(String s1, String s2, int count) {
        String substring = s1.substring(0, (s1.length() - count));
        return substring.concat(s2);
    }

}
