package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String local_name = emails[i].substring(0, emails[i].indexOf('@'));
            String domain_name = emails[i].substring(emails[i].indexOf('@'));
            local_name = local_name.replaceAll("\\.", "");
            if (local_name.indexOf('+') > 0) {
                local_name = local_name.substring(0, local_name.indexOf('+'));
            }
            set.add(local_name + domain_name);
        }

        return set.size();
    }
}
