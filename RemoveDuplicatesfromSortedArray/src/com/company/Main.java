package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 1;

        for(int i = 0; i < length - 1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }
        }

        return index + 1;
    }
}
