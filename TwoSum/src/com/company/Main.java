package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null) {
                return new int[] {map.get(nums[i]),i};
            }
            map.put(target - nums[i],i);
        }

        return new int[] {};
    }
}
