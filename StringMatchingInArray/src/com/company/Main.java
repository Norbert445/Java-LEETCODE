package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(j == i) continue;
                if(words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}
