package com.company;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
	    System.out.println(main.countPrimes(10));
    }

    public int countPrimes(int n) {
        if(n < 2) return 0;

        boolean[] arr = new boolean[n];
        int counter = 0;

        for(int i = 2; i < n; i++) {
            arr[i] = true;
        }

        for(int i = 2; i < Math.sqrt(n); i++) {
            if(!arr[i]) continue;
            for(int j = 2 * i; j < n; j += i) {
                arr[j] = false;
            }
        }

        for(int i = 2; i < arr.length; i++) {
            if(arr[i]) {
                counter++;
            }
        }

        return counter;
    }
}
