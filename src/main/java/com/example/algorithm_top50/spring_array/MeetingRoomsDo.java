package com.example.algorithm_top50.spring_array;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static void main(String[] args) {
        MeetingRooms meetingRooms = new MeetingRooms();

        Interval interval1 = new Interval(15,20);
        Interval interval2 = new Interval(5,10);
        Interval interval3 = new Interval(0,30);
        Interval[] intervals1 = {interval1, interval2, interval3};
        System.out.println("intervals1 : " + meetingRooms.solve(intervals1));

        Interval interval4 = new Interval(7,10);
        Interval interval5 = new Interval(2,4);
        Interval[] intervals2 = {interval4, interval5};
        System.out.println("intervals2 : " + meetingRooms.solve(intervals2));

        Interval interval6 = new Interval(2,4);
        Interval[] intervals3 = {interval6};
        System.out.println("intervals3 : " + meetingRooms.solve(intervals3));
    }

    public boolean solve(Interval[] intervals) {

        System.out.println("Before : " + Arrays.toString(intervals));

        Arrays.sort(intervals, Comparator.comparing(Interval::getStart));

        System.out.println("After : " + Arrays.toString(intervals));

        if (intervals.length == 1) return true;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].getEnd() > intervals[i].getStart()) return false;
        }

        return true;
    }

    private static class Interval {

        private int start;

        private int end;

        Interval(){
            this.start = 0;
            this.end =0;
        }

        Interval(int s, int e){
            this.start = s;
            this.end = e;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
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
