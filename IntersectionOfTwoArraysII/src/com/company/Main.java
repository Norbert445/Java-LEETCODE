package com.company;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i : nums1) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for(int i:nums2) {
            if(map.get(i) != null && map.get(i) != 0) {
                result.add(i);
                map.put(i,map.get(i) - 1);
            }
        }

        return listToArray(result);

    }

    public int[] listToArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
