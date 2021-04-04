package com.example.leetCode.sengineer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class A22_Generate_ParenthesesTest {

    @Test
    public void test1() {
        A22_Generate_Parentheses a = new A22_Generate_Parentheses();
        Object[] result = a.generateParenthesis(9).toArray();
        Assertions.assertArrayEquals(result, new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"});
    }

    @Test
    public void test2() {
        A22_Generate_Parentheses a = new A22_Generate_Parentheses();
        Object[] result = a.generateParenthesis(1).toArray();
        Assertions.assertArrayEquals(result, new String[]{"()"});
    }

}
