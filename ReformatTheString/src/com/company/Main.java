package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public String reformat(String s) {
        int letter_count = 0;
        int digit_count = 0;

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                letter_count++;
                letters.append(c);
            } else {
                digit_count++;
                digits.append(c);
            }
        }
        if(Math.max(letter_count,digit_count) - Math.min(letter_count,digit_count) > 1) {
            return "";
        }

        for(int i = 0; i < digits.length() + letters.length(); i++) {
            if(letter_count > digit_count) {
                if(letters.length() > i) {
                    res.append(letters.charAt(i));
                }
                if(digits.length() > i) {
                    res.append(digits.charAt(i));
                }
            } else {
                if(digits.length() > i) {
                    res.append(digits.charAt(i));
                }
                if(letters.length() > i) {
                    res.append(letters.charAt(i));
                }
            }
        }

        return res.toString();
    }
}
