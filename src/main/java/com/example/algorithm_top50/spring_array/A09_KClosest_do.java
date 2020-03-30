package com.example.algorithm_top50.spring_array;

import java.util.PriorityQueue;
import java.util.Queue;

public class A09_KClosest_do {

    public int[][] solve(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>(points.length,
                (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        int[][] answer = new int[k][2];

        for (int[] p : points) {
            queue.offer(p);
        }
        int index = 0;

        while (index < k) {
            answer[index] = queue.poll();
            index++;
        }
        return answer;
    }

}
