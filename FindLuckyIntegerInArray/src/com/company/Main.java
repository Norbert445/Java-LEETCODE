package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE;
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == num && max < num) {
                max = num;
                result = num;
            }
        }

        return result;
    }

    public int findLuckyOptimized(int[] arr) {
        int[] bucket = new int[501];

        for(int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        for(int i = 500; i >= 1; i--) {
            if(bucket[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
