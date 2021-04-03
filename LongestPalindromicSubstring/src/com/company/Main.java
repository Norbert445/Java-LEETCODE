package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++) {
            int length1 = expandFromMiddle(s,i,i);
            int length2 = expandFromMiddle(s,i,i+1);
            int length = Math.max(length1,length2);
            if(length > (end - start)) {
                end = i + (length / 2);
                start = i - ((length-1) / 2);
            }
        }

        return s.substring(start,end+1);
    }


    public int expandFromMiddle(String s,int left, int right){
        if(left > right) {
            return 0;
        }

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

}
