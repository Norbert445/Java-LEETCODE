package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //Nedokoncene
    public String reformat(String s) {
        int letter_count = 0;
        int digit_count = 0;

        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                letter_count++;
            } else {
                digit_count++;
            }
        }
    }
}
