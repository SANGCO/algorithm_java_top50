package com.example.programmers.b_스택_큐;

import java.util.*;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<CompletionDate> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.offer(new CompletionDate(progresses[i], speeds[i]));
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            CompletionDate c = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && c.isMoreTimeConsumingTask(queue.peek().date)) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    private class CompletionDate {
        int progresse;
        int speed;
        int date;

        public CompletionDate(int progresse, int speed) {
            this.progresse = progresse;
            this.speed = speed;
            this.date = (int) Math.ceil((100 - this.progresse) / this.speed);
        }

        public boolean isMoreTimeConsumingTask(int dateArg) {
            return this.date >= dateArg;
        }
    }

}
