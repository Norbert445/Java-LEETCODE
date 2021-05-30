package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<Integer> partitionLabelsOptimized(String S) {
        List<Integer> result = new ArrayList<>();

        int[] last_occur = new int[26];
        for(int i = 0; i < S.length(); i++) {
            last_occur[S.charAt(i) - 'a'] = i;
        }

        int j = 0, anchor = 0;
        for(int i = 0; i < S.length(); i++) {
            j = Math.max(j, last_occur[S.charAt(i) - 'a']);
            if(i == j) {
                result.add(i - anchor + 1);
                anchor = i + 1;
            }
        }

        return result;
    }

    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int counter = 0;

        for(int i = 0; i < S.length(); i++) {
            temp.add("" + S.charAt(i));
            if(containCharInList(S.substring(i+1),temp)) {
                counter++;
            } else {
                result.add(counter+1);
                temp.clear();
                counter = 0;
            }
        }

        return result;
    }

    public Boolean containCharInList(String s, List<String> list) {

        for(String str : list) {
            if(s.contains(str)) return true;
        }

        return false;
    }
}
