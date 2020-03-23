package com.example.programmers.해시;

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
            if (map.get(c[1]) == null) {
                Set<String> set = new HashSet<>();
                set.add(c[0]);
                map.put(c[1], set);
            }
            else map.get(c[1]).add(c[0]);
        }

        int answer = 1;

        for (Map.Entry<String, Set<String>> e : map.entrySet()) {
            answer *= e.getValue().size() + 1;
        }
        return answer - 1;
    }

    private static int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values().stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }

}
