package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //Nedokoncene
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) {
                res[0] = num;
            } else {
                set.add(num);
            }
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                res[1] = i;
                break;
            }
        }

        return res;
    }
}
