package com.example.programmers.f_탐욕법;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lifeboat {

    public int solution(int[] people, int limit) {
        List<Person> list =
                Arrays.stream(people)
                        .mapToObj(p -> new Person(p, limit))
                        .filter(p -> !p.isOnBoard)
                        .sorted(Comparator.comparing(Person::getWeight).reversed())
                        .collect(Collectors.toList());
        int answer = people.length - list.size();

        for (int i = 0; i < list.size(); i++) {
            Person person1 = list.get(i);

            if (person1.isOnBoard) {
                continue;
            }
            person1.isOnBoard = true;
            answer++;

            for (int j = list.size() - 1; j > i; j++) {
                Person person2 = list.get(j);

                if (person2.isOnBoard) {
                    continue;
                }

                if (person2.isWeightLookingFor(person1.weight)) {
                    break;
                }
            }
        }
        return answer;
    }

    private class Person {

        int weight;

        int weightLookingFor;

        boolean isOnBoard = false;

        public Person(int weight, int limit) {
            this.weight = weight;
            this.weightLookingFor = limit - weight;

            if (this.weightLookingFor < 40) {
                this.isOnBoard = true;
            }
        }

        public int getWeight() {
            return weight;
        }

        public boolean isOnBoard() {
            return isOnBoard;
        }

        public boolean isWeightLookingFor(int weight) {
            if (weightLookingFor >= weight) {
                isOnBoard = true;
            }

            return isOnBoard;
        }
    }
}
