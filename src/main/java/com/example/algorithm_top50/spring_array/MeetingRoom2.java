package com.example.algorithm_top50.spring_array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class MeetingRoom2 {

    public static void main(String[] args) {
        MeetingRoom2 a = new MeetingRoom2();
        Interval in1 = new Interval(5,10);
        Interval in2 = new Interval(15,20);
        Interval in3 = new Interval(0,30);
        Interval[] intervals = {in1,in2,in3};
        System.out.println(a.solve(intervals));
    }

    // 우선순위 큐 (Priority Queue)
    // 삽입 - offer, add
    // 제거 - poll, remove
    // 읽기 - peek, element
    public int solve(Interval[] intervals) {
        if(intervals == null || intervals.length==0)
            return 0;
        Arrays.sort(intervals, Comp);
        Queue<Interval> heap = new PriorityQueue<Interval>(intervals.length, Comp2);

        heap.offer(intervals[0]);

        for(int i=1; i<intervals.length; i++) {
            Interval interval = heap.poll();
            if( interval.end <= intervals[i].start) {
                interval.end = intervals[i].end;
            }else {
                heap.offer(intervals[i]);
            }
            heap.offer(interval);
        }
        return heap.size();
    }

    Comparator<Interval> Comp2 = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            // TODO Auto-generated method stub
            return o1.end - o2.end;
        }
    };

    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            // TODO Auto-generated method stub
            return o1.start - o2.start;
        }
    };

    private static class Interval{
        int start, end;
        Interval(){
            this.start =0;
            this.end =0;
        }
        Interval(int s, int e){
            this.start = s;
            this.end = e;
        }
    }
}
