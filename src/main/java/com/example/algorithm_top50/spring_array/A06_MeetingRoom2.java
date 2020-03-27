package com.example.algorithm_top50.spring_array;

import java.util.*;


public class A06_MeetingRoom2 {

    public int solve(int[][] intervalsArg) {
        List<Interval> intervals = new ArrayList<>();

        for (int[] e : intervalsArg) {
            intervals.add(new Interval(e[0], e[1]));
        }

        if(intervals.isEmpty())
            return 0;
        intervals.sort(Comparator.comparing(Interval::getStart));
        Queue<Interval> queue = new PriorityQueue<>(intervals.size(), Comparator.comparing(Interval::getEnd));
        queue.offer(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = queue.poll();
            assert interval != null;
            if (interval.getEnd() <= intervals.get(i).getStart()) {
                interval.end = intervals.get(i).getStart();
            } else {
                queue.offer(intervals.get(i));
            }
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
    }
}
