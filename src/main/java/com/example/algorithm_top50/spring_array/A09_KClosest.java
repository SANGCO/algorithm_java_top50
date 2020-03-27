package com.example.algorithm_top50.spring_array;

import java.util.PriorityQueue;
import java.util.Queue;

public class A09_KClosest {

    public static void main(String[] args) {
        A09_KClosest a = new A09_KClosest();
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        int[][] result = a.solve(points, k);
    }

    public int[][] solve(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>(points.length,
                (a, b) -> (a[0] * a[0] + a[1] * a[1])
                        - (b[0] * b[0] + b[1] * b[1]));
        int[][] result = new int[k][2];
        int index = 0;

        for (int[] p : points) {
            queue.offer(p);
        }

        while (index < k) {
            result[index] = queue.poll();
            index++;
        }
        return result;
    }

}
