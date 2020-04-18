package com.example.programmers.a_해시;

import java.util.*;

public class IncompletePlayer {
    public String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {

            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }
        return participant[completion.length];
    }

    public String solution2(String[] participant, String[] completion) {
        Set<String> answer = new HashSet<>();

        for (int i = 0; i < completion.length; i++) {

            if (answer.contains(participant[i])) {
                answer.remove(participant[i]);
            } else {
                answer.add(participant[i]);
            }

            if (answer.contains(completion[i])) {
                answer.remove(completion[i]);
            } else {
                answer.add(completion[i]);
            }
        }

        if (answer.contains(participant[completion.length])) {
            answer.remove(participant[completion.length]);
        } else {
            answer.add(participant[completion.length]);
        }
        return answer.iterator().next();
    }
}
