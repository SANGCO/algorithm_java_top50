package com.example.programmers.a_해시;

public class 전화번호_목록 {
    public static boolean solution(String[] phoneBook) {
        for(int i = 0; i < phoneBook.length - 1; i++) {
            for(int j = i + 1; j < phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) return false;
                if(phoneBook[j].startsWith(phoneBook[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Boolean answer = solution(new String[]{"123", "456", "789"});
        System.out.println(answer);
    }
}
