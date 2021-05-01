package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < chars.length(); i++) {
            set.add(chars.charAt(i));
        }

        for(int i = 0; i < words.length; i++) {
            boolean valid = true;
            for(int j = 0; j < words[i].length(); j++) {
                if(!set.contains(words[i].charAt(j))) {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                count += words[i].length();
            }
        }
        return count;
        //Nedokoncene
    }
}
