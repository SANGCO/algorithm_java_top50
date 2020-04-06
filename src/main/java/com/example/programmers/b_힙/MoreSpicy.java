package com.example.programmers.b_힙;

import java.util.*;
import java.util.stream.Collectors;

public class MoreSpicy {

    public int solution(int[] scoville, int k) {
        Queue<Integer> queue = Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));
        int answer = 0;

        while (queue.size() > 1 && queue.stream().anyMatch(s -> s < k)) {
            int a = queue.poll();
            int b = queue.poll();
            int c = a + (b * 2);
            queue.offer(c);
            answer++;
        }

        if (queue.size() == 1 && queue.peek() < k) {
            return -1;
        }
        return answer;
    }

}
