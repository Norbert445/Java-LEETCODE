package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0) + 1);

        for(int num : nums) {
            if(map.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
