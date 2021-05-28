package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public int[] countBitsDp(int n) {
        int[] dp = new int[n + 1];

        for(int i = 0; i < dp.length; i++) {
            if(i == 0 || i == 1) dp[i] = i;
            if(i % 2 == 0) dp[i] = dp[i/2];
            else dp[i] = dp[i/2] + 1;
        }

        return dp;
    }

    // Time complexity - O(log(n) * n)
    // Space complexity - O(1)
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for(int i = 0; i < ans.length; i++) {
            ans[i] = count1Bits(i);
        }

        return ans;
    }

    public int count1Bits(int num) {
        int counter = 0;

        while(num > 0) {
            int remainder = num % 2;
            if(remainder == 1) counter++;
            num /= 2;
        }

        return counter;
    }
}
