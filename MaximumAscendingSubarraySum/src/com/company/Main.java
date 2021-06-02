package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int maxAscendingSum(int[] nums) {
        int local_max = 0;
        int global_max = 0;
        int prev_element = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(prev_element >= nums[i]) {
                local_max = 0;
            }
            prev_element = nums[i];
            local_max += nums[i];
            global_max = Math.max(local_max, global_max);
        }

        return global_max;
    }

    public int maxAscendingSumOptimized(int[] nums) {
        int local_max = 0;
        int global_max = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] <= nums[i - 1]) {
                local_max = 0;
            }
            local_max += nums[i];
            global_max = Math.max(global_max,local_max);
        }

        return global_max;
    }
}
