package com.example.programmers.b_스택_큐;

import java.util.*;

public class IronBar {

    public int solution3(String arrangement) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                st.push(i);
            } else if (arrangement.charAt(i) == ')') {
                if (st.peek() + 1 == i) {
                    st.pop();
                    answer += st.size();
                } else {
                    st.pop();
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public int solution1(String arrangement) {
        Stack<Character> bars = new Stack<>();
        int answer = 0;
        boolean isBar = false;

        // TODO ')'에서 answer를 늘려가는 부분 체크!
        for (char bar : arrangement.toCharArray()) {
            if (bar == '(') {
                bars.push(bar);
                isBar = false;
            }

            if (bar == ')') {
                bars.pop();

                if (isBar) {
                    answer++;
                }

                if (!isBar) {
                    answer += bars.size();
                    isBar = true;
                }
            }
        }
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


