package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') ones++;
        }
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '1') ones--;
            else zeros++;

            if(max < zeros + ones) max = zeros + ones;
        }

        return max;
    }
}
