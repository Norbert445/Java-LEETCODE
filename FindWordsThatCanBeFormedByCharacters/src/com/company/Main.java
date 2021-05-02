package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int countCharactersMostEffective(String[] words, String chars) {
        int sum = 0;
        int[] char_occur = new int[26];

        for(char c : chars.toCharArray()) {
            char_occur[c - 'a']++;
        }

        for(String word : words) {
            int[] char_occur_temp = Arrays.copyOf(char_occur,char_occur.length);
            boolean valid = true;

            for(char c : word.toCharArray()) {
                if(char_occur_temp[c - 'a'] > 0) {
                    char_occur_temp[c - 'a']--;
                } else {
                    valid = false;
                }
            }
            if(valid) {
                sum += word.length();
            }
        }

        return sum;
    }

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0) + 1);
        }

        for(int i = 0; i < words.length; i++) {
            boolean valid = true;
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++) {
                map2.put(words[i].charAt(j),map2.getOrDefault(words[i].charAt(j),0)+1);
                if(map.get(words[i].charAt(j)) == null || map2.get(words[i].charAt(j)) > map.get(words[i].charAt(j))) {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                count += words[i].length();
            }
        }
        return count;
    }
}
