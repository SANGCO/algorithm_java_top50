package com.example.algorismTopCoder.Chapter05_전체_탐색;

import java.util.HashMap;

public class InterestingParty {

    public static void main(String[] args) {

        String[] first = {"fishing", "gardening", "swimming", "fishing"};
        String[] second = {"hunting", "fishing", "fishing", "biting"};

        // expect 4
        System.out.println(bestInvitation(first, second));

    }

    public static int bestInvitation(String[] first, String[] second) {

        HashMap<String, Integer> dic = new HashMap<String, Integer>();

        for (int i=0; i<first.length; i++) {
            dic.put(first[i], 0);
            dic.put(second[i], 0);
        }

        // first와 second에 흩어져 있는걸 hash의 성질을 이용해서 모으고 카운트
        for (int i=0; i<first.length; i++) {
            dic.put(first[i], dic.get(first[i])+1);
            dic.put(second[i], dic.get(second[i])+1);
        }

        int ans = 0;

        for (String key : dic.keySet()) {
            ans = Math.max(ans, dic.get(key));
        }

        return ans;
    }
}
