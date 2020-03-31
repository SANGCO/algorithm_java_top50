package com.example.algorithm_top50.spring_array;

import java.util.*;

public class A11_UniqueEamilAddress {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String localName = getLocalName(email);
            String domainName = getDomainName(email);
            uniqueEmails.add(localName + "@" + domainName);
        }
        return uniqueEmails.size();
    }

    private String getLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.')
                continue;
            if (email.charAt(i) == '+')
                break;
            if (email.charAt(i) == '@')
                break;
            String str = String.valueOf(email.charAt(i));
            sb.append(str);
        }
        return sb.toString();
    }

    private String getDomainName(String email) {
        return email.substring(email.indexOf('@') + 1);
    }

}
