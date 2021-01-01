package com.example.programmers.f_탐욕법;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = Arrays.stream(lost)
                .boxed().collect(Collectors.toCollection(LinkedList::new));
        List<Integer> reserveList = Arrays.stream(reserve)
                .boxed().collect(Collectors.toCollection(LinkedList::new));

        reserveList.removeIf(r -> {
            for (int l : lost) {
                if (r == l) {
                    lostList.remove(Integer.valueOf(l));
                    return true;
                }
            }
            return false;
        });

        int result = n - lostList.size();

        for (int l : lostList) {
            for (int r : reserveList) {
                if ((l + 1) == r || (l - 1) == r) {
                    result++;
                    // 그냥 r을 넣으면 인덱스로 삭제하는게 된다.
                    // 컬렉션을 순회하면서 선택된 원소를 제거하지만
                    // 이중 for문 이라서 이 경우에는 for-each 사용 가능
                    reserveList.remove(Integer.valueOf(r));
                    break;
                }
            }
        }
        return result;
    }

}
