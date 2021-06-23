package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int countSubstrings(String s) {
        int count = s.length();

        for(int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(s.charAt(i));
            for(int j = i + 1; j < s.length(); j++) {
                temp.append(s.charAt(j));
                if(isPalindrome(temp.toString())) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isPalindrome(String str) {
        for(int i = 0, j = str.length() - 1; i < j; i++,j--) {
            if(str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
}
