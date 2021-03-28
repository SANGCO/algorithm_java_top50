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

        if (numOpen == n && numClosed == n) {
            ret.add(str);
            return;
        }

        if (numOpen < n) {
            process(n, (numOpen + 1), numClosed, (str + "("), ret);
        }

        if (numOpen > numClosed) {
            process(n, numOpen, (numClosed + 1), (str + ")"), ret);
        }
    }

}
