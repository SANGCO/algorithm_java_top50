package com.example.programmers.f_탐욕법;

import java.util.*;

public class ConnectingIslands {

    // 크루스칼 알고리즘
    // 최소 신장 트리

    public int solution(int n, int[][] costs) {
        List<Edge> list = new ArrayList<>();
        Queue<Edge> queue = new PriorityQueue<>(
                costs.length, Comparator.comparing(Edge::getWeight));
        int[] parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int[] cost : costs) {
            queue.add(new Edge(cost[0], cost[1], cost[2]));
        }

        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            int x = find(parent, edge.source);
            int y = find(parent, edge.destination);

            if (x != y) {
                list.add(edge);
                union(parent, x, y);
            }
        }
        return list.stream().mapToInt(Edge::getWeight).sum();
    }

    private int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            return find(parent, parent[vertex]);
        }
        return vertex;
    }

    private void union(int[] parent, int x, int y) {
        int xParent = find(parent, x);
        int yParent = find(parent, y);
        parent[yParent] = xParent;
    }

    private class Edge {

        int source;

        int destination;

        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

}
