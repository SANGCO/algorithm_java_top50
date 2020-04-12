package com.example.programmers.d_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LargestNumber {

    public String solution(int[] numbers) {
        Comparator<Integer> c = (i1, i2) -> {
            String s1 = String.valueOf(i1);
            String s2 = String.valueOf(i2);

            int i1f = Integer.parseInt(s1 + s2);
            int i2f = Integer.parseInt(s2 + s1);

            int minLength = Math.min(s1.length(), s2.length());
            String sub1 = s1.substring(0, minLength);
            String sub2 = s2.substring(0, minLength);

            Integer int1 = Integer.parseInt(sub1);
            Integer int2 = Integer.parseInt(sub2);

            if (int1.equals(int2) && i1f > i2f) {
                int1 += 1;
            }

            if (int1.equals(int2) && i1f < i2f) {
                int2 += 1;
            }

            return int2.compareTo(int1);
        };

        String answer = Arrays.stream(numbers)
                              .boxed()
                              .sorted(c)
                              .map(String::valueOf)
                              .collect(Collectors.joining(""));
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < answer.length(); i++) {
            temp.append("0");
        }

        if (temp.toString().equals(answer)) {
            return "0";
        }
        return answer;
    }

}
