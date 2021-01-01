package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8},2));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int i;
        int j;
        int result = 0;
        boolean isDistance = false;
        for(i=0;i<arr1.length;i++) {
            for(j=0;j<arr2.length;j++) {
                if(Math.abs(arr1[i]-arr2[j]) > d) {
                    isDistance = true;
                }
                else {
                    isDistance = false;
                    break;
                }
            }
            if(isDistance) {
                result++;
            }
        }
        return result;
    }
}
