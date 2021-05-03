package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();

        for(String str : A) {
            int[] arr = new int[26*2];
            for(int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            set.add(Arrays.toString(arr));
        }

        return set.size();
    }
}
