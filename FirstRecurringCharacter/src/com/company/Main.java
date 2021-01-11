package com.company;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.firstRecurringCharacter(new int[] {2,5,1,3,5,1,2,4}));
    }

    public static int firstRecurringCharacter(int[] arr) {
        Map<Integer,Boolean> map = new Hashtable<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                return arr[i];
            }
            else {
                map.put(arr[i],true);
            }
        }
        return 0;
    }// O(n) - time
     // O(n) - space
}
