package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max,prices[i] - min);
            }
        }
        return max;
    }
}
