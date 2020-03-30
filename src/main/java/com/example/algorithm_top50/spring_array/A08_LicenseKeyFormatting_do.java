package com.example.algorithm_top50.spring_array;

public class A08_LicenseKeyFormatting_do {

    public String licenseKeyFormatting(String s, int k) {
        String s1 = s.replace("-", "");
        StringBuilder sb = new StringBuilder();
        sb.append(s1.toUpperCase());
        int len = sb.toString().length();

        for (int i = k; i < len; i = i + k) {
            sb.insert(len - i, "-");
        }
        return sb.toString();
    }

}
