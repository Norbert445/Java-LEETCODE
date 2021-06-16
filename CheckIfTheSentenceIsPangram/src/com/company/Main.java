package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26];

        for(int i = 0; i < sentence.length(); i++) {
            alphabet[sentence.charAt(i) - 'a'] = 1;
        }

        for(int i : alphabet) {
            if(i == 0) return false;
        }

        return true;
    }
}
