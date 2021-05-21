package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] sortArray(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }


        return nums;
    }

    public int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }

        int[] result = new int[array.length];

        left = sort(left);
        right = sort(right);

        result = merge(left,right);
        return result;
    }

    public int[] merge(int[]left,int[]right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0, rightPointer = 0, resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {

                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
