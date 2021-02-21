package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public int titleToNumber(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int temp = (s.charAt(i) - 'A') + 1;
            result = result * 26 + temp;
        }

        return result;
    }
}
