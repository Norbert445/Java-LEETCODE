package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,3,9,85,4445,6,21,-6,2};
        Main.quickSortRecursion(arr,0,arr.length-1);
        Main.printArray(arr);
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[(low + high) / 2];

        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public static void quickSortRecursion(int[] array, int low, int high) {
        int pi = partition(array,low,high);
        if(low < pi -1) {
            quickSortRecursion(array,low,pi-1);
        }
        if(pi < high) {
            quickSortRecursion(array,pi,high);
        }
    }

    public static void printArray(int[] array) {
        for(int item:array) {
            System.out.println(item);
        }
    }
}
