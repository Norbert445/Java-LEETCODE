package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int k = 0;

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        int[] arr = new int[set1.size()];

        for (int i : set1) {
            arr[k++] = i;
        }

        return arr;
    }
}
