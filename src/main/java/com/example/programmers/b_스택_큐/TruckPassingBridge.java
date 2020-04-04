package com.example.programmers.b_스택_큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class TruckPassingBridge {

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Bridge bridge = new Bridge(bridge_length, weight, truck_weights);
        return bridge.answer;
    }

    private class Bridge {

        int length;

        int weight;

        int answer;

        LinkedList<Truck> waitingTrucks;

        LinkedList<Truck> trucksOnTheBridge;

        public Bridge(int bridge_length, int weight, int[] truck_weights) {
            this.length = bridge_length;
            this.weight = weight;
            this.waitingTrucks = Arrays.stream(truck_weights)
                    .mapToObj(t -> new Truck(bridge_length, t))
                    .collect(Collectors.toCollection(LinkedList::new));
            this.trucksOnTheBridge = new LinkedList<>();
            this.answer = solve() + 1;
        }

        private int solve() {

            while (!this.waitingTrucks.isEmpty() || !this.trucksOnTheBridge.isEmpty()) {

                if (!this.waitingTrucks.isEmpty() && !isFull()) {
                    this.trucksOnTheBridge.offer(this.waitingTrucks.poll());
                }
                this.answer++;
                this.trucksOnTheBridge = this.trucksOnTheBridge.stream()
                        .map(Truck::go)
                        .filter(Truck::isOnTheBridge)
                        .collect(Collectors.toCollection(LinkedList::new));
            }
            return answer;
        }

        private boolean isFull() {
            return this.trucksOnTheBridge.stream()
                        .mapToInt(Truck::getWeight)
                        .sum()
                    + this.waitingTrucks.peek().weight > this.weight;
        }
    }

    private class Truck {

        int lengthCrossed;

        int weight;

        public Truck() {
        }

        public Truck(int lengthCrossed, int weight) {
            this.lengthCrossed = lengthCrossed;
            this.weight = weight;
        }

        public Truck go() {
            lengthCrossed--;
            return this;
        }

        public boolean isOnTheBridge() {
            return lengthCrossed != 0;
        }

        public int getWeight() {
            return weight;
        }
    }

}

