package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int reverse(int x) {
        long result = 0;

        while(Math.abs(x) > 0) {
            int digit = x % 10;
            result = result * 10 + digit;
            x /= 10;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)result;
    }
}
