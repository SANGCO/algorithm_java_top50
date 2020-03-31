package com.example.algorithm_top50.spring_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A11_UniqueEamilAddressTest {

    @Test
    void numUniqueEmails() {
        A11_UniqueEamilAddress u = new A11_UniqueEamilAddress();
        int answer = u.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"});
        assertEquals(2, answer);
    }

    @Test
    void numUniqueEmails_do() {
        A11_UniqueEamilAddress_do u = new A11_UniqueEamilAddress_do();
        int answer = u.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"});
        assertEquals(2, answer);
    }
}