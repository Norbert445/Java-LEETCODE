package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        if(needle.equals("")) return 0;

        boolean equals = false;
        int l = 0;

        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                for(int j = i,k = 0; j < haystack.length() && k < needle.length(); j++,k++) {
                    if(haystack.charAt(j) != needle.charAt(k)) {
                        equals = false;
                        break;
                    } else {
                        l++;
                        equals = true;
                    }
                }
                if(equals && l == needle.length()) {
                    return i;
                }
                l = 0;
            }
        }

        return -1;
    } // Naive approach
}
