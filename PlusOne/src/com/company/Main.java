package com.company;

public class Main {

    public static void main(String[] args) {
    }

    public int[] plusOne(int[] digits) {
        if(digits[digits.length -1] != 9) {
            digits[digits.length-1]++;
            return digits;
        }

        return new int[]{}; //Nedokoncene
    }
}
