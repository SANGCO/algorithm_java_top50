package com.example.programmers.b_스택_큐;

import java.util.*;
import java.util.stream.Collectors;

public class StockPrice {

    public int[] solution1(int[] prices) {
        List<Stock> list = new ArrayList<>();
        list.addAll(Arrays.stream(prices)
                .mapToObj(Stock::new)
                .collect(Collectors.toList()));

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < prices.length; j++) {

                if (i < j) {
                    list.get(i).solve(prices[j]);
                }
            }
        }

        return list.stream().mapToInt(Stock::getPeriod).toArray();
    }

    public int[] solution2(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int count = 0;

            for (int j = i + 1; j < prices.length; j++) {

                if (prices[i] <= prices[j]) {
                    count++;
                }

                if (prices[i] > prices[j]) {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    private class Stock {

        int price;

        int period = 0;

        boolean isDone = false;

        public Stock(int price) {
            this.price = price;
        }

        public Stock solve(int price) {

            if (isDone) {
                return this;
            }

            if (this.price <= price) {
                period++;
            }

            if (this.price > price) {
                period++;
                isDone = true;
            }

            return this;
        }

        public int getPeriod() {
            return period;
        }
    }

}
