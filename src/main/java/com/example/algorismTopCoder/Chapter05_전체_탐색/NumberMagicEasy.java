package com.example.algorismTopCoder.Chapter05_전체_탐색;

public class NumberMagicEasy {
    public int theNumber(String answer) {
        int ret = 0;
        String[] allAns = {"YYYY", "YYYN", "YYNY", "YYNN",
                "YNYY", "YNYN", "YNNY", "YNNN",
                "NYYY", "NYYN", "NYNY", "NYNN",
                "NNYY", "NNYN", "NNNY", "NNNN"};

        for (int i = 0; i < allAns.length; i++) {
            if (allAns[i].equals(answer)) ret = i + 1;
        }

        return ret;
    }
}