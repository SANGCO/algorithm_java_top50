package com.example.algorithm_top50.spring_array;

import java.util.*;

public class A05_MergeInterval {
    public static void main(String[] args) {
		int[][] intervals = {{8,10},{1,3},{15,18},{2,6}};
		solution(convert(intervals)).forEach(System.out::println);
    }

    public static List<Interval> solution(List<Interval> intervals) {
        intervals.sort(Comparator.comparing(Interval::getStart));

        if (intervals.isEmpty()) {
            return intervals;
        }
        List<Interval> answer = new ArrayList<>();
        Interval hold = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (hold.getEnd() >= current.getStart())
                hold.setEnd(Math.max(hold.getEnd(), current.getEnd()));
            else {
                answer.add(hold);
                hold = current;
            }
        }

        if (!answer.contains(hold)) {
            answer.add(hold);
        }
        return answer;
    }

    private static List<Interval> convert(int[][] intervalsArg) {
        List<Interval> intervals = new ArrayList<>();

        for (int[] interval : intervalsArg) {
            intervals.add(new Interval(interval[0], interval[1]));
        }
        return intervals;
    }

    private static int[][] convert(List<Interval> intervalsArg) {
        int[][] intervals = new int[intervalsArg.size()][];

        for (int i = 0; i < intervalsArg.size(); i++) {
            intervals[i] = new int[]{intervalsArg.get(i).getStart(), intervalsArg.get(i).getEnd()};
        }
        return intervals;
    }

    private static class Interval {

        private int start;

        private int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

}

