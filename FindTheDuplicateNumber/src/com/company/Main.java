package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return nums[i];
        }
        return -1;
    }

    public int findDuplicateTortoiseHare(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        hare = nums[0];

        while(tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return tortoise;
    }

}
