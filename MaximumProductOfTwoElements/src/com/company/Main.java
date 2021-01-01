package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().maxProduct(new int[]{3,4,5,2}));
    }

    public int maxProduct(int[] nums) {
        int i;
        int j;
        int max = Integer.MIN_VALUE;
        int product = 0;

        for(i=0;i<nums.length;i++) {
            for(j=i+1;j<nums.length;j++) {
                product = (nums[i] - 1)*(nums[j]-1);
                if(product >  max) {
                    max = product;
                }
            }
        }
        return max;
    }
}
