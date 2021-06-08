package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int binaryGap(int n) {
        int[] binary = numToBinary(n);
        int zero_count = 0;
        int max = Integer.MIN_VALUE;
        int one_count = 0;

        for (int bit : binary) {
            if(bit == 1) {
                one_count++;
                max = Math.max(zero_count, max);
                zero_count = 0;
            } else {
                zero_count++;
            }
        }

        if(one_count < 2) return 0;
        return max + 1;
    }

    private int[] numToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        int[] result;
        int i = 0;
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        result = new int[stack.size()];
        while (!stack.isEmpty()) {
            result[i++] = stack.pop();
        }

        return result;
    }
}
