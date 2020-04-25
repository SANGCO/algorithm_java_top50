package com.example.programmers.f_탐욕법;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Student> map =
                IntStream.rangeClosed(1, n)
                        .mapToObj(Student::new)
                        .collect(Collectors.toMap(Student::getId, s -> s));

        Queue<Student> lostStudents = new PriorityQueue<>();
        Queue<Student> reserveStudents = new PriorityQueue<>();

        Arrays.stream(lost).forEach(l -> {
            Student student = map.get(l);

            if (student != null) {
                student.isDone = false;
                student.isLost = true;
                lostStudents.add(student);
            }
        });

        Arrays.stream(reserve).forEach(r -> {
            Student student = map.get(r);

            if (student != null && !student.isDone) {
                student.isDone = true;
                student.anyReserve = true;
                lostStudents.remove(student);
            } else {
                student.isDone = false;
                student.anyReserve = true;
                reserveStudents.add(student);
            }
        });

        for (Student l : lostStudents) {

            for (Student r : reserveStudents) {
                if (l.isDone || r.isDone) {
                    continue;
                }

                if (l.id + 1 == r.id || l.id - 1 == r.id) {
                    l.isDone = true;
                    r.isDone = true;
                    break;
                }
            }
        }

        return (int) (n - lostStudents.stream().filter(s -> !s.isDone).count());

//                map.values().stream()
//                        .filter(s -> !s.isDone)
//                        .filter(Student::isLost)
//                        .filter(so -> {
//                            return map.values().stream()
//                                    .filter(s -> !s.isDone)
//                                    .filter(Student::isAnyReserve)
//                                    .noneMatch(si -> {
//
//                                        if (!so.isDone && so.id + 1 == si.id || so.id - 1 == si.id) {
//                                            so.isDone = true;
//                                            si.isDone = true;
//
//                                            return true;
//                                        }
//                                        return false;
//                                    });
//                        })
//                        .count();
    }

    private class Student implements Comparable<Student> {

        int id;

        boolean isLost = false;

        boolean anyReserve = false;

        boolean isDone = true;

        public Student(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public boolean isLost() {
            return isLost;
        }

        public boolean isAnyReserve() {
            return anyReserve;
        }

        public boolean isDone() {
            return isDone;
        }

        @Override
        public int compareTo(Student student) {
            return this.id - student.id;
        }
    }
}
