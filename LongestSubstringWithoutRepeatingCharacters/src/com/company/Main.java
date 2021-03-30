package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int lengthOfLongestSubstring(String s) {
        int pointer1 = 0;
        int pointer2 = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while(pointer2 < s.length()) {
            if(set.contains(s.charAt(pointer2))) {
                set.remove(s.charAt(pointer1));
                pointer1++;
            } else {
                set.add(s.charAt(pointer2));
                pointer2++;
            }
            max = Math.max(set.size(),max);
        }

        return max;
    }
}
