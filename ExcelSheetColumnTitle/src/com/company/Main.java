package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.convertToTitle(566));
    }
    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n > 0) {
            n--;
            char temp = (char)((n%26) + 65);
            result.insert(0,temp);
            n /= 26;
        }

        return result.toString();
    }
}
