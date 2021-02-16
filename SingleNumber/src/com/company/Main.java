package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])) {
                hashSet.remove(nums[i]);
            }
            else {
                hashSet.add(nums[i]);
            }
        }
        for(int i : hashSet) {
            return i;
        }
        return -1;
    }
}
