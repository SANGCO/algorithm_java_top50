package com.example.programmers.a_해시;

import java.util.*;

public class 완주하지_못한_선수 {
    public static String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        return participant[completion.length];
    }

    public static String solution2(String[] participant, String[] completion) {
        Set<String> answer = new HashSet<>();

        // participant, completion 하나의 배열로 보고 하나만 남긴다는 느낌으로
        for (int i = 0; i < completion.length; i++) {
            if (answer.contains(participant[i])) answer.remove(participant[i]);
            else answer.add(participant[i]);

            if (answer.contains(completion[i])) answer.remove(completion[i]);
            else answer.add(completion[i]);
        }

        if (answer.contains(participant[completion.length])) answer.remove(participant[completion.length]);
        else answer.add(participant[completion.length]);

        return answer.iterator().next();
    }

    public static void main(String[] args) {
        String answer = solution1(new String[]{"kiki", "eden", "leo"}, new String[]{"kiki", "eden"});
        System.out.println(answer);
    }
}
