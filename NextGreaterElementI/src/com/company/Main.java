package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i);
        }
        for(int i = 0; i < nums1.length; i++) {
            boolean valid = false;
           for(int j = map.get(nums1[i]); j < nums2.length; j++) {
               if(nums1[i] < nums2[j]) {
                   nums1[i] = nums2[j];
                   valid =true;
                   break;
               }
           }
           if(!valid) {
               nums1[i] = -1;
           }
        }

        return nums1;
    }
}
