package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.countBalls(1,10));
    }

    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = lowLimit; i <= highLimit; i++) {
            int sum = sumOfDigits(i);
            map.put(sum,map.getOrDefault(sum,0) + 1);
            if(max < map.get(sum)) {
                max = map.get(sum);
            }
        }
        return max;
    }

    public int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
        }
        return sum;
    }
}
