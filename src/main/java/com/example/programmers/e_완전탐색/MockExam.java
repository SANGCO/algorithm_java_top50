package com.example.programmers.e_완전탐색;

import java.util.*;

public class MockExam {

    public int[] solution(int[] answers) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, new int[]{1, 2, 3, 4, 5}));
        list.add(new Student(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5}));
        list.add(new Student(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));
        Arrays.stream(answers)
              .forEach(i -> list.forEach(s -> s.match(i)));

        int max = list.stream()
                      .mapToInt(Student::getAnswer)
                      .max()
                      .orElseThrow(RuntimeException::new);
        List<Student> answer = new ArrayList<>(answers.length);

        for (Student student : list) {

            if (student.answer == max) {
                answer.add(student);
            }
        }
        return answer.stream()
                     .mapToInt(Student::getId)
                     .toArray();
    }

    private class Student {

        int id;

        int answer;

        int[] pattern;

        int index;

        int max;

        public Student(int id, int[] pattern) {
            this.id = id;
            this.answer = 0;
            this.pattern = pattern;
            this.index = 0;
            this.max = pattern.length - 1;
        }

        public void match(int answerArg) {

            if (pattern[index] == answerArg) {
                answer++;
            }

            if (index == max) {
                index = 0;
                return;
            }

            if (index < max) {
                index++;
            }
        }

        public int getId() {
            return id;
        }

        public int getAnswer() {
            return answer;
        }
    }

}