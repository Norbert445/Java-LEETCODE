package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.factorialRecursive(5));
    }

    public static int factorialRecursive(int num) { //O(n) - time
        if(num == 1) {
            return 1;
        }

        return num * factorialRecursive(num-1);
    }

    public static int factorialIterative(int num) { //O(n) - time
        int result = 1;
        while(num != 1) {
            result*=num;
            num--;
        }
        return result;
    }
}
