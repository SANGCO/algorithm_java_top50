package com.example.programmers.a_해시;

import java.util.*;

import static java.util.stream.Collectors.*;

public class 위장 {

    public static void main(String[] args) {
        String[][] clothes = {
                                {"yellow_hat", "headgear"},
                                {"blue_sunglasses", "eyewear"},
                                {"green_turban", "headgear"}
                             };
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        Map<String, Set<String>> map = new HashMap<>();

        for (String[] c : clothes) {
            if (!map.containsKey(c[1])) {
                Set<String> set = new HashSet<>();
                set.add(c[0]);
                map.put(c[1], set);
            }
            else map.get(c[1]).add(c[0]);
        }

        int answer = 1;

        for (Set<String> e : map.values()) {
            answer *= e.size() + 1;
        }
        return answer - 1;
    }

    private static int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                     .collect(
                        groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                // p[1] 그룹핑하고 그냥 counting() 하면 p[1]을 카운팅 하는거니깐 다시 매핑을 해서 p[0]을 카운팅
                     .values()
                     .stream()
                     .reduce(1L, (x, y) -> x * (y + 1))
                     .intValue() - 1;
    }
}
