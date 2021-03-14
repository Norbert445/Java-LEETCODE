package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) {
            return strs[0];
        }

        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        char ch;

        String smallestWord = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if(strs[i].length() < smallestWord.length()) {
                smallestWord = strs[i];
            }
        }

        while (k < smallestWord.length()) {
            ch = strs[0].charAt(k);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(k) == ch) {
                    if (i == strs.length - 1) {
                        stringBuilder.append(ch);
                    }
                } else {
                    return stringBuilder.toString();
                }
            }
            k++;
        }

        return stringBuilder.toString();
    }
}
