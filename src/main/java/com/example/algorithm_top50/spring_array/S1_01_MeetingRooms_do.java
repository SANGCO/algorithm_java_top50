package com.example.algorithm_top50.spring_array;

public class S1_01_MeetingRooms_do {

    public static void main(String[] args) {
        S1_01_MeetingRooms_do meetingRooms = new S1_01_MeetingRooms_do();

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

    private boolean solve(Interval[] intervals) {

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
