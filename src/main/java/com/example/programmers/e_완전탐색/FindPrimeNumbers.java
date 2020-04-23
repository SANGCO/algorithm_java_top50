package com.example.programmers.e_완전탐색;

import java.util.List;

public class FindPrimeNumbers {

    public int solution(String numbers) {

        // 소수 걸러네는 메소드 하나
        // 2부터 들어온 숫자 만큼 다 돌려서 소수 찾는다
        // 소수에서 set에 겹치는거 하나라도 없으면 탈락

        // 앞에 0이 나오면 0을 뒤로 붙이자


        int answer = 0;
        return answer;
    }

    private boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime(List<Integer> primes, Integer candidate) {
        double candidateRoot = Math.sqrt((double) candidate);
        return primes.stream().filter(p -> p < candidateRoot).noneMatch(p -> candidate % p == 0);
//        return takeWhile(primes, i -> i <= candidateRoot).stream().noneMatch(i -> candidate % i == 0);
    }

}
