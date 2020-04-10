package com.example.programmers.b_힙;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DoublePiorityQueue {

    public int[] solution(String[] operations) {
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> reverseQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (String operation : operations) {

            if (isInsertOperation(operation)) {
                int numb = Integer.parseInt(operation.substring(2, operation.length()));
                queue.offer(numb);
                reverseQueue.offer(numb);
            }

            if (isRemoveOperation(operation)) {

                if (!queue.isEmpty() && operation.length() == 3) {
                    Integer test = reverseQueue.poll();
                    queue.remove(test);
                }

                if (!queue.isEmpty() && operation.length() == 4) {
                    Integer test = queue.poll();
                    reverseQueue.remove(test);
                }
            }
        }

        if (queue.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{reverseQueue.poll(), queue.poll()};
    }

    private boolean isInsertOperation(String operation) {
        return operation.startsWith("I");
    }

    private boolean isRemoveOperation(String operation) {
        return operation.startsWith("D");
    }

}
