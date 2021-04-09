package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Main main = new Main();
        int[][] result = main.merge(new int[][]{{1, 4}, {3, 6}, {8, 56}, {42, 96}});
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for(int[] interval : intervals) {
            int current_begin = currentInterval[0];
            int current_end =  currentInterval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end >= next_begin) {
                currentInterval[1] = Math.max(current_end,next_end);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[][]{});

    }


}
