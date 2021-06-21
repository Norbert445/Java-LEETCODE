package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /*public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for(List<String> strs : items) {
            if(ruleKey.equals("type") && strs.get(0).equals(ruleValue)) {
                count++;
            } else if(ruleKey.equals("color") && strs.get(1).equals(ruleValue)) {
                count++;
            } else if(ruleKey.equals("name") && strs.get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }*/

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int choice;

        if(ruleKey.equals("type")) choice = 0;
        else if(ruleKey.equals("color")) choice = 1;
        else choice = 2;

        for(List<String> str : items) {
            if(str.get(choice).equals(ruleValue)) count++;
        }
        return count;
    }
}
