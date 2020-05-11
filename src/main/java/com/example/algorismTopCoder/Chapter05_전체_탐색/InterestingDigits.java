package com.example.algorismTopCoder.Chapter05_전체_탐색;

import java.util.ArrayList;

public class InterestingDigits {

    public static void main(String[] args) {

        int base1 = 10; //expect {3, 9}
        int base2 = 30; //expect {29}

        printArray(digits1(base1));
        printArray(digits1(base2));
        printArray(digits2(base1));
        printArray(digits2(base2));

    }

    private static void printArray(int[] digits) {
        for (int i : digits) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    private static int[] digits1(int base) {
        ArrayList<Integer> v = new ArrayList();

        for(int n = 2; n < base; n++) {
            boolean ok = true;

            for(int k1 = 0; k1 < base; k1++) {

                for(int k2 = 0; k2 < base; k2++) {

                    for(int k3 = 0; k3 < base; k3++) {
                        if((k1 + k2 * base + k3 * base * base) % n == 0 && (k1 + k2 + k3) % n != 0) {
                            ok = false;
                            break;
                        }
                    }
                    if(!ok) break;
                }
                if(!ok) break;
            }
            if(ok) v.add(n);
        }

        int[] ans = new int[v.size()];
        for(int i = 0; i < v.size(); i++) ans[i] = v.get(i);

        return ans;
    }

    private static int[] digits2(int base) {
        ArrayList<Integer> v = new ArrayList();

        for(int n = 2; n < base; n++) {
           if( ( (base - 1) % n) == 0) v.add(n);
        }

        int[] ans = new int[v.size()];
        for(int n = 0; n < v.size(); n++) ans[n] = v.get(n);

        return ans;
    }
}
