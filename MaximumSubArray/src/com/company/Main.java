package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArrayBruteForce(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int currentMax = 0;
            for(int j = i; j < nums.length;j++) {
                currentMax += nums[j];
                if(max < currentMax) {
                    max = currentMax;
                }
            }
        }
        return max;
    }

    public static int maxSubArray(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            localMax = Math.max(nums[i],localMax + nums[i]);
            if(globalMax < localMax) {
                globalMax = localMax;
            }
        }

        return globalMax;
    }
}
