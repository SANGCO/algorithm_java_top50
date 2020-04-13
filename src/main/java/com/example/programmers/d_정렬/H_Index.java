package com.example.programmers.d_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class H_Index {

    public int solution(int[] citations) {
        List<Integer> list = Arrays.stream(citations)
                                   .boxed()
                                   .sorted(Comparator.reverseOrder())
                                   .collect(Collectors.toList());
        int answer = 0;
        int more = 0;
        int less = 0;

        for (int i = list.get(0); i >= 0; i--) {

            for (int citation : list) {

                if (i <= citation) {
                    more++;
                }

                if (i >= citation) {
                    less++;
                }
            }

            if ((i <= more) && (i >= less)) {
                answer = i;
                break;
            }
            more = 0;
            less = 0;
        }
        return answer;
    }

}