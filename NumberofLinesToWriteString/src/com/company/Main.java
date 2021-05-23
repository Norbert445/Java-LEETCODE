package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int[] numberOfLines(int[] widths, String s) {
        int counter = 0;
        int lines = 1;

        for(int i = 0; i < s.length(); i++) {
            if(counter + widths[s.charAt(i) - 'a'] > 100) {
                counter = 0;
                counter += widths[s.charAt(i) - 'a'];
                lines++;
            } else {
                counter += widths[s.charAt(i) - 'a'];
            }
        }

        return new int[]{lines,counter};
    }
}
