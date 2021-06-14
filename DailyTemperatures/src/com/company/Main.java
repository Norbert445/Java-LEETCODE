package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            res[i] = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }

    public int[] dailyTemperaturesOptimized(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty())
                res[i] = stack.peek() - i;
            stack.push(i);
        }

        return res;
    }
}
