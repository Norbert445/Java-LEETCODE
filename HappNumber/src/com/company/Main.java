package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum;
        int temp;
        int digit;

        while (n != 1) {
            sum = 0;
            temp = n;

            while (temp > 0) {
                digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            if(set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
            n = sum;
        }

        return true;
    }
}
