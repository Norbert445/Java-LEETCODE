package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    }

    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9) {
                if(i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    return newDigits;
                } else {
                    digits[i] = 0;
                }
            } else {
                digits[i]++;
                return digits;
            }
        }

        return digits;
    }
}
