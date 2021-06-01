package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int minStartValue(int[] nums) {
        int startValue = 1;
        boolean valid = false;
        int temp = startValue;

        while(!valid) {
            valid = true;

            for(int i = 0; i < nums.length; i++) {
                temp += nums[i];
                if(temp < 1){
                    valid = false;
                    startValue++;
                    temp = startValue;
                    break;
                }
            }

        }

        return startValue;
    }

    public int minStartValueOptimized(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min,sum);
        }

        return min < 1 ? Math.abs(min) + 1 : 1;
    }
}
