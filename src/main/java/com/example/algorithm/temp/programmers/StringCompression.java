package com.example.algorithm.temp.programmers;

public class StringCompression {

    public int solution(String s) {

        return 0;
    }

    public int solution2(String s) {
        int answer = s.length();

        // 8 이면 4, 7 이면 3 반이상이 되면 압축이 안된다.
        for (int n = 1; n <= s.length() / 2; n++) {
            StringBuilder temp = new StringBuilder();

            // n + i로 돌리면 2개씩 끊어서 전체 돌려보고 그다음에 3개씩 끊어서 돌려보고
            // 0 + 2, 그다음에 2 + 2, 4 + 2 ...
            for (int i = 0; i < s.length(); i = i + n) {
                String word = "";

                // 앞에서 자를지 뒤에서 자를
                if (i + n >= s.length()) word = s.substring(i, s.length());
                else word = s.substring(i, i + n);

                int cnt = 1;
                StringBuilder sb = new StringBuilder();

                // 특정 개수 씩 끊어서 실질적으로 여기서 전체 순회
                for (int j = i + n; j < s.length(); j = j + n) {
                    String word2 = "";

                    // 앞에서 자를지 뒤에서 자를지
                    if (j + n >= s.length()) {
                        word2 = s.substring(j, s.length());
                    } else {
                        word2 = s.substring(j, j + n);
                    }

                    if (word.equals(word2)) {
                        cnt++;
                        i = j;
                    } else {
                        break;
                    }
                }

                if (cnt == 1) sb.append(word);
                else sb.append(cnt).append(word);

                temp.append(sb.toString());
            }

            answer = Math.min(answer, temp.toString().length());
        }

        return answer;
    }

}
