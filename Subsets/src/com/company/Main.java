package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for(int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();

            for(List<Integer> curr : res) {
                newSubsets.add(new ArrayList<Integer>(curr) {
                    {
                        add(num);
                    }
                });
            }
            res.addAll(newSubsets);
        }

        return res;
    }
}
