package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean kLengthApart(int[] nums, int k) {
        int zero_count = 0;
        boolean toggle = false;

        for(int num : nums) {
            if(num == 1) {
                if(!toggle) {
                    toggle = true;
                    continue;
                }
                if(zero_count < k) {
                    return false;
                }
                zero_count = 0;
            } else {
                zero_count++;
            }
        }

        return true;
    }
}
