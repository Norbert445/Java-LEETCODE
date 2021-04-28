package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main.relativeSortArray()
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> no_arr1 = new ArrayList<>();

        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < map.get(arr2[i]); j++) {
                arr1[index++] = arr2[i];

            }
            map.remove(arr2[i]);
        }

        for(int i : map.keySet()) {
            for(int j = 0; j < map.get(i); j++) {
                no_arr1.add(i);
            }
        }

        Collections.sort(no_arr1);
        for(int i = 0; i < no_arr1.size(); i++) {
            arr1[index++] = no_arr1.get(i);
        }
        return arr1;
    }
}
