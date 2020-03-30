package com.example.algorithm_top50.spring_array;

import java.util.*;


public class A06_MeetingRoom2_do {

    public int solve(int[][] intervalsArg) {
        List<Interval> intervals = new ArrayList<>();

        for (int[] e : intervalsArg) {
            intervals.add(new Interval(e[0], e[1]));
        }

        intervals.sort(Comparator.comparing(Interval::getStart));
        Queue<Interval> queue = new PriorityQueue<>(intervals.size(), Comparator.comparing(Interval::getEnd));
        queue.offer(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = queue.poll();

            if (interval.getEnd() <= intervals.get(i).getStart())
                interval.setEnd(intervals.get(i).getEnd());
            else
                queue.offer(intervals.get(i));
            queue.offer(interval);
        }
        return queue.size();
    }

    private class Interval{

        private int start = 0;

        private int end = 0;

        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
