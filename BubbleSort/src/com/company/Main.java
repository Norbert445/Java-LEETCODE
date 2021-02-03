package com.company;

public class Main {

    public static void main(String[] args) {
        Main.bubbleSort(new int[]{4, 54, 12, 96, 1, -5, -4,-5632,10000,26});
    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) { // O(n^2) - time
            for (int j = 0; j < array.length && j + 1 < array.length; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int item : array
        ) {
            System.out.println(item);
        }
    }
}
