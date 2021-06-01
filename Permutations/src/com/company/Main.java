package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        recursivePermutations(nums, permutation, used, res);

        return res;
    }

    public void recursivePermutations(int[] nums, List<Integer> permutation, boolean[] used, List<List<Integer>> res) {
        if(permutation.size() == nums.length) {
            res.add(new ArrayList<>(permutation));
        }

        for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;

            used[i] = true;
            permutation.add(nums[i]);
            recursivePermutations(nums, permutation, used, res);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }
    }
}
