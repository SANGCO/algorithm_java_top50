package com.example.leetCode.sengineer;

import java.util.ArrayList;
import java.util.List;

public class A22_Generate_Parentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        process(n, 0, 0, "", ret);
        return ret;
    }

    public void process(
            int n,
            int numOpen,
            int numClosed,
            String str,
            List<String> ret) {

        // 10개를 찾으면 10개 열린 상태로 고, 9개 열린 상태로 고, 8개 열린 상태로 고...
        if (numOpen == n && numClosed == n) {
            ret.add(str);
            return;
        }

        // 3개 찾아야 하는데 너 지금 2개만 열려있어 하나 더 열
        if (numOpen < n) {
            process(n, (numOpen + 1), numClosed, (str + "("), ret);
        }

        // 3개 열려있는데 2개 닫혀 있어 하나 더 닫어
        if (numOpen > numClosed) {
            process(n, numOpen, (numClosed + 1), (str + ")"), ret);
        }
    }

}
