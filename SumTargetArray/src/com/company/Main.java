package com.company;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    System.out.println(new Main().challenge(new int[]{1,4,7,6,1},8));
    }

    /*public boolean challenge (int[] array, int target) {
        for(int i =0; i<array.length;i++) {
            for(int j = i+1; j<array.length;j++) {
                if(array[i] + array[j] == target) return true;
            }
        }
        return false;
    } //O(n^2)
      //O(1) - space */

    public boolean challenge(int[] array,int target) {
        Map<Integer,Boolean> map = new Hashtable<>();
        for(int i =0; i < array.length;i++) {
            int complement = target - array[i];
            if(map.get(array[i]) == null) map.put(complement,true);
            else {
                return true;
            }
        }
        return false;
    } //O(n)
      //O(n) - space
}
