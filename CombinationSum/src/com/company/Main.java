package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList<>(),list);
        return list;
    }

    public void backtrack(int[] candidates, int start, int target, List<Integer> temp, List<List<Integer>> result) {
        if(target < 0) {
            return;
        }
        if(target == 0) {
            result.add(new ArrayList<>(temp));
        }
        for(int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(candidates,i,target - candidates[i],temp,result);
            temp.remove(temp.size() - 1);
        }
    }
}
