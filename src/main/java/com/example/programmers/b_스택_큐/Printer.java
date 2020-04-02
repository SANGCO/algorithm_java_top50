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

    private boolean isThereAnyHigherPriority(LinkedList<PrinterInner> printerInnersArg, PrinterInner p) {
        if (!printerInnersArg.isEmpty() &&
            p.prioritiy < printerInnersArg.stream().mapToInt(PrinterInner::getPrioritiy).max().orElse(0))
        {
            return true;
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
