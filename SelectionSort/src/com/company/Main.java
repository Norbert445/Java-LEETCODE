package com.company;

public class Main {

    public static void main(String[] args) {
        Main.selectionSort(new int[] {9,45,2,1,-6,54,9});
    }
    
    public static void selectionSort(int[] arr) { // O(n^2) - time
        int min;
        int j;

        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(j = i; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int item : arr) {
            System.out.println(item);
        }
    }
}
