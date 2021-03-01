package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.climbStairs(5));
    }

    public static int climbStairs(int n) {
        int[] saveSubProblems = new int[n+1];
        saveSubProblems[0] = 1;
        saveSubProblems[1] = 1;

        for(int i = 2; i <= n; i++) {
            saveSubProblems[i] = saveSubProblems[i-1] + saveSubProblems[i-2];
        }

        return saveSubProblems[n];
    }
}
