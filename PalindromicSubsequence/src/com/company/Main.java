package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int removePalindromeSub(String s) {
        if(s.length() == 0) {
            return 0;
        }
        for(int i = 0,j = s.length() - 1; i < j; i++,j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return 2;
            }
        }
        return 1;
    }
}
