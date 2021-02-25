package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i:nums) {
            hashSet.add(i);
        }

        for(int i = 0; i <= nums.length; i++) {
            if(!hashSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
