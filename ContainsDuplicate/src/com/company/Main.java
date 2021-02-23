package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       for(int i : nums ) {
           if(set.contains(i)) {
               return true;
           }
           else {
               set.add(i);
           }
       }
       return false;
    }
}
