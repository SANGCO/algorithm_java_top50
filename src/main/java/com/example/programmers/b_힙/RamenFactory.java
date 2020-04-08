package com.example.programmers.b_힙;

import java.util.*;

public class RamenFactory {

    public int solution(int stock, int[] dates, int[] supplies, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        int day = stock;
        int index = 0;

        while (day < k) {

            while (index < dates.length && dates[index] <= day) {
                queue.add(supplies[index]);
                index++;
            }
            answer++;
            day += queue.poll();
        }
        return answer;
    }

    public int solution1(int stock, int[] dates, int[] supplies, int k) {
        List<Supplier> list = new ArrayList<>();
        int answer = 0;
        int sum = stock;

        for (int i = 0; i < dates.length; i++) {
            list.add(new Supplier(dates[i], supplies[i]));
        }

        while (sum < (k - 1)) {
            int finalSum = sum;
            Supplier supplier = list.stream()
                    .filter(s -> s.date <= finalSum + 1)
                    .max(Comparator.comparing(Supplier::getSupply))
                    .get();
            sum += supplier.supply;
            list.remove(supplier);
            answer++;
        }
        return answer;
    }

    private class Supplier {

        int date;

        int supply;

        public Supplier(int date, int supply) {
            this.date = date;
            this.supply = supply;
        }

        public int getDate() {
            return date;
        }

        public int getSupply() {
            return supply;
        }
    }

}
