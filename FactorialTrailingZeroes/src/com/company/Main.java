package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int trailingZeroes(int n) {
        int count = 0;

        for(int i = 5; i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
