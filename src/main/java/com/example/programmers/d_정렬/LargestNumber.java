package com.example.programmers.d_정렬;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumber {

    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                              .boxed()
                              .map(String::valueOf)
                              .sorted((s1, s2) -> (s2 + s1).compareTo((s1 + s2)))
                              .collect(Collectors.joining(""));

        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }

}
