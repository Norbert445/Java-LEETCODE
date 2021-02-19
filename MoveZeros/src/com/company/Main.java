package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {0,1,0,3,12};
        Main.moveZeroes(array);

        for(int item : array) {
            System.out.print(item + ", ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while(count < nums.length) {
            nums[count++] = 0;
        }
    }
}
