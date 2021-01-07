package com.company;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.findCommon(new int[]{5,2,9},new int[]{56,7,98,85,9}));
    }

    /*static public boolean findCommon(int[] arr1,int[] arr2) {
        for(int i = 0; i<arr1.length; i++) {
            for(int j = 0; j<arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }*/
    //O(a*b)
    //O(1) - space

    static public boolean findCommon(int[] arr1,int[] arr2) {
        Map<Integer,Boolean> map = new Hashtable<>();
        for(int i = 0;i < arr1.length;i++) {
            map.put(arr1[i],true);
        }
        for(int i = 0; i< arr2.length;i++) {
            if(map.get(arr2[i]) != null) return true;
        }
        return false;
    } //O(a+b)
      //O(n) - space
}
