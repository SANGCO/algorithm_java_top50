package com.example.algorithm_top50.spring_array;

import java.util.Arrays;
import java.util.Comparator;

public class A01_MeetingRooms {

    private boolean solve(Interval[] intervals) {
       // 소팅
        Arrays.sort(intervals, Comparator.comparing(Interval::getStart));
        if (intervals.length == 1) return true;

        // 앞시간 end > 뒤시간 start 이거는 false
        // 앞시간 끝나고 뒤에거 시작해야지
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].getEnd() > intervals[i].getStart()) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        A01_MeetingRooms meetingRooms = new A01_MeetingRooms();

        Interval[] intervals1 = {getInterval(15, 20), getInterval(5, 10), getInterval(0, 30)};
        System.out.println("intervals1 : " + meetingRooms.solve(intervals1));

        Interval[] intervals2 = {getInterval(7, 10), getInterval(2, 4)};
        System.out.println("intervals2 : " + meetingRooms.solve(intervals2));

        Interval[] intervals3 = {getInterval(2, 4)};
        System.out.println("intervals3 : " + meetingRooms.solve(intervals3));
    }

    private static Interval getInterval(int s, int e) {
        return new Interval(s, e);
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
