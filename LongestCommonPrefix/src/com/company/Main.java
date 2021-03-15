package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        if (strs.length == 0) return stringBuilder.toString();

        for (char ch : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= k || strs[i].charAt(k) != ch) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(ch);
            k++;
        }

        return stringBuilder.toString();
    }
}
