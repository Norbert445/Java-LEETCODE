package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public List<String> commonChars(String[] A) {
        int[] temp = new int[26];
        int[] ans = new int[26];
        Arrays.fill(ans, Integer.MAX_VALUE);

        List<String> result = new ArrayList<>();

        for (String str : A) {
            Arrays.fill(temp, 0);
            for (int i = 0; i < str.length(); i++) {
                temp[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < temp.length; i++) {
                ans[i] = Math.min(ans[i], temp[i]);
            }
        }

        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[i]; j++) {
                result.add((char)(i+'a') + "");
            }
        }

        return result;
    }
}
