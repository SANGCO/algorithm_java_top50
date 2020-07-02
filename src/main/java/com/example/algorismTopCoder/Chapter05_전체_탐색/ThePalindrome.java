package com.example.algorismTopCoder.Chapter05_전체_탐색;

public class ThePalindrome {

    public int find(String s) {

        for (int i = s.length(); ; i++) {
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {

                // 참 절묘하다.
                // s.length() 보다 커지면 제일 앞에건 신경 안쓴다.
                // 제일 앞에걸 제일 뒤에 넣으면 되기에
                // 그 다음에는 두번째를 신경 안쓰면 되고
                // 하나라도 같지 않은게 있으면 stop


                if ((i - j - 1) < s.length() && s.charAt(j) != s.charAt(i - j - 1)) {
                    System.out.println("s.charAt(i - j - 1) " + s.charAt(i - j - 1));
                    System.out.println("s.charAt(j) " + s.charAt(j));
                    flag = false;
                    break;
                }
            }

//            i = 5, j = 0
//            i = 5, j = 1


            // 조건을 모두 만족하면 답을 리턴합니다.
            if (flag) return i;
        }
    }
}
