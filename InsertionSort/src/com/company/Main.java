package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = Main.insertionSort(new int[] {5,2,6,9,3,1});

        for(int item : arr) {
            System.out.println(item);
        }
    }

    public static int[] insertionSort(int[] arr) { // O(n^2) - time
        int key,temp,j;

        for(int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while(j >= 0 && key < arr[j]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        return arr;
    }
}
