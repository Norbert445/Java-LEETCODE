package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.mergeSortedArrays(new int[]{1, 2, 5,45,652}, new int[]{3, 6, 7, 9}));
    }

    public static int[] mergeSortedArrays(int array1[], int array2[]) {
        int i = 0, j = 0,k = 0;

        if(array1.length == 0) {
            return array2;
        }
        if(array2.length == 0) {
            return array1;
        }

        int result[] = new int[array1.length+array2.length];

        while(i < array1.length && j < array2.length) {
            if(array1[i] < array2[j]) {
                result[k] = array1[i];
                i++;
            }
            else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }

        while(i < array1.length) {
            result[k++] = array1[i++];
        }

        while(j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    } //
}
