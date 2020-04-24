package com.example.programmers.f_탐욕법;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        List<Student> lostStudents =
                Arrays.stream(lost)
                        .mapToObj(l -> {
                            Student s = new Student(l);
                            s.isDone = false;
                            s.isLost = true;
                            return s;
                        })
                        .sorted(Comparator.comparing(Student::getId))
                        .collect(Collectors.toList());

        List<Student> reserveStudents =
                Arrays.stream(reserve)
                        .mapToObj(r -> {
                            Student s = new Student(r);
                            s.isDone = false;
                            s.anyReserve = true;
                            return s;
                        })
                        .sorted(Comparator.comparing(Student::getId))
                        .collect(Collectors.toList());

        for (Student l : lostStudents) {

            for (Student r : reserveStudents) {
                if (l.isDone || r.isDone) {
                    continue;
                }

                if (l.id == r.id) {
                    l.isDone = true;
                    r.isDone = true;
                    break;
                }
            }
        }

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

        List<Student> answer =
                lostStudents.stream()
                        .filter(student -> !student.isDone)
                        .filter(student -> student.isLost)
                        .collect(Collectors.toList());

        return n - answer.size();
    }

    private class Student {

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
    }
}
