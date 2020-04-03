package com.example.programmers.b_스택_큐;

import java.util.*;

public class IronBar {

    public int solution1(String arrangement) {
        LinkedList<Integer> bars = new LinkedList<>();
        int answer = 0;



        return answer;
    }

    public int solution2(String arrangement) {
        List<IronBarInn> list = new ArrayList<>();
        int answer = 0;

        for (String parenthesis : arrangement.split("")) {
            if (parenthesis.equals("(")) {
                list.add(new IronBarInn());
            }

            for (IronBarInn i : list) {
                if (!i.isDone) {
                    i.solve(parenthesis);
                }
            }
        }

        return list.stream().mapToInt(IronBarInn::getNumbIronBar).sum();
    }

    private class IronBarInn {
        int numbIronBar = 0;
        int laser = 0;
        boolean isDone = false;
        LinkedList<String> queue = new LinkedList<>();

        public IronBarInn() {
        }

        public IronBarInn solve(String parenthesisArg) {
            if (isDone) return this;

            if (this.queue.isEmpty()) {
                this.queue.offer(parenthesisArg);
                return this;
            }

            if (this.queue.size() == 1 && this.queue.peek().equals("(") && parenthesisArg.equals(")")) {
                this.laser++;
                this.isDone = true;
                return this;
            }

            this.queue.offer(parenthesisArg);
            LinkedList<String> queue = new LinkedList<>(this.queue);
            String rightInFront = null;
            int laser = 0;
            int left = 0;
            int right = 0;

            while (!queue.isEmpty()) {
                String parenthesis = (String) queue.poll();

                if (parenthesis.equals("(")) {
                    left++;
                }

                if (parenthesis.equals(")")) {
                    right++;
                }

                if (rightInFront != null) {
                    if (rightInFront.equals("(") && parenthesis.equals(")")) {
                        laser++;
                    }
                }
                rightInFront = parenthesis;
            }

            if (left == right) {
                this.isDone = true;
                this.laser = laser;
                this.numbIronBar = 1 + laser;
            }
            return this;
        }

        public int getNumbIronBar() {
            return numbIronBar;
        }
    }

}


