package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int candy_count = 1;

        while(candies != 0) {
            for(int i = 0; i < num_people; i++){
                if(candy_count > candies) {
                    res[i] += candies;
                    candies = 0;
                    break;
                } else {
                    res[i] += candy_count;
                    candies -= candy_count;
                    candy_count++;
                }
            }
        }
        return res;
    }
}
