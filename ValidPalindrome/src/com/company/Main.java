package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;

        while(i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }

        return true;
    }
}
