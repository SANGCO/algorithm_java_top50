package com.example.programmers.b_힙;

import java.util.*;
import java.util.stream.Collectors;

public class DiskController {

    public int solution(int[][] jobs) {
        Queue<Job> jobQueue = new PriorityQueue<>(jobs.length,
                Comparator.comparing(Job::getTime));
        int index = 1;
        int count = 1;
        int answer = jobs[0][1];
        int waitingTime = jobs[0][1];

        while (count < jobs.length) {

            while (index < jobs.length && jobs[index][0] < waitingTime) {
                jobQueue.offer(new Job(jobs[index][0], jobs[index][1]));
                index++;
            }

            for (Job job : jobQueue) {
                answer += (waitingTime + job.time - job.start);
                waitingTime += job.time;
            }
            jobQueue.clear();
            count++;
        }
        return answer / jobs.length;
    }

    private class Job {

        int start;

        int time;

        public Job(int start, int time) {
            this.start = start;
            this.time = time;
        }

        public int getStart() {
            return start;
        }

        public int getTime() {
            return time;
        }
    }

}
