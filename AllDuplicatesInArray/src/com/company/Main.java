package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0) {
                list.add(index+1);
            }
            nums[index] = -nums[index];
        }
        return list;
    }
}
