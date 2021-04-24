package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (b, a) -> a[1] - b[1]);
        int result = 0;

        for(int i = 0; i < boxTypes.length; i++) {
            int box = boxTypes[i][0];
            int units = boxTypes[i][1];

            if(box >= truckSize) {
                result += truckSize * units;
                return result;
            } else {
                result += box * units;
                truckSize -= box;
            }
        }
        return result;
    }

}
