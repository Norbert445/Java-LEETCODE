package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int mySqrt(int x) {
        if(x < 2) return x;

        long start = 1;
        long end = x;

        while(start < end) {
            long mid = start + ((end - start) / 2);
            if((mid*mid) == x) return (int)mid;
            if((mid*mid) < x) {
                start = mid+1;
            }
            if((mid*mid) > x) {
                end = mid;
            }
        }

        return (int)start-1;
    }
}
