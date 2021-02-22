package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int maxProfit(int[] prices) { //O(n)
        int profit = 0;

        for(int i = 0; i < prices.length-1; i++) {
            if(prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}
