package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean isPowerOfThree(int n) {
        long num = 1;
        for(;num <= n;) {
            if(num == n) {
                return true;
            }
            num *= 3;
        }

        return false;
    }
}
