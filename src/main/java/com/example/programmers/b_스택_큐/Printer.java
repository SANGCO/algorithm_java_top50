package com.example.programmers.b_스택_큐;

import java.util.*;

public class Printer {

    public int solution(int[] priorities, int location) {
        LinkedList<PrinterInner> printerInners = new LinkedList<>();
        PrinterInner answer = null;
        int order = 1;

        for (int i = 0; i < priorities.length; i++) {
            printerInners.offer(new PrinterInner(priorities[i], i));
        }

        while (!printerInners.isEmpty()) {
            PrinterInner p = printerInners.poll();
            LinkedList<PrinterInner> ps = new LinkedList<>(printerInners);


            if (isHighestPriority(ps, p)) {

                if (p.isAnswer(location)) {
                    p.order = order;
                    answer = p;
                    break;
                }
                order++;
                continue;
            }

            if (isThereAnyHigherPriority(ps, p)) {
                printerInners.offer(p);
                continue;
            }

            if (p.isAnswer(location)) {
                p.order = order;
                answer = p;
                break;
            }
            order++;
        }
        return answer.order;
    }

    private boolean isHighestPriority(LinkedList<PrinterInner> printerInnersArg, PrinterInner p) {
        if (printerInnersArg.isEmpty()) {
            return true;
        }
        Collections.sort(printerInnersArg, Comparator.comparing(PrinterInner::getPrioritiy).reversed());
        return p.isTopPriority(printerInnersArg.peek().prioritiy);
    }

    private boolean isThereAnyHigherPriority(LinkedList<PrinterInner> printerInnersArg, PrinterInner p) {
        if (printerInnersArg.isEmpty()) {
            return false;
        }
        Collections.sort(printerInnersArg, Comparator.comparing(PrinterInner::getPrioritiy).reversed());

        for (PrinterInner p1 : printerInnersArg) {
            if (p1.isTopPriority(p.prioritiy)) {
                return true;
            }
        }
        return false;
    }

    private class PrinterInner {
        int prioritiy;
        int initialLocation;
        int order;

        PrinterInner(int prioritiy, int initialLocation) {
            this.prioritiy = prioritiy;
            this.initialLocation = initialLocation;
        }

        boolean isTopPriority(int prioritiyArg) {
            return this.prioritiy > prioritiyArg;
        }

        boolean isAnswer(int location) {
            return this.initialLocation == location;
        }

        public int getPrioritiy() {
            return prioritiy;
        }
    }

}
