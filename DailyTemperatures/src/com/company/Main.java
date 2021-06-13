package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            res[i] = 0;
            for(int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }

    //Nedokoncene
    /*public int[] dailyTemperaturesOptimized(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = temperatures.length - 1; i >= 0; i--) {

            if(!stack.isEmpty()) {
                while(!stack.isEmpty() && temperatures[i] > stack.peek()) {
                    stack.pop();
                }
                stack.push(temperatures[i]);
            } else {
                stack.push(temperatures[i]);
            }
        }

        return new int[]{};
    }*/
}
