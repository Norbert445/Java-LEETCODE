package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int[] decrypt(int[] code, int k) {

        int[] result = new int[code.length];

        //if k = 0 replace by 0
        if (k == 0) {
           return result;
        }

        //if k > 0 replace by sum of next k elements
        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                for (int j = 0, l = i + 1; j < k; j++, l++) {
                    if (l >= code.length) {
                        l = 0;
                        result[i] += code[l];
                    } else {
                        result[i] += code[l];
                    }
                }
            }
        }

        //if k < 0 replace by sum of previous k elements
        if (k < 0) {
            for (int i = 0; i < code.length; i++ ) {
                result[i] = 0;
                for(int j = 0,l = i - 1; j < -k; j++,l--) {
                    if(l < 0) {
                        l = code.length - 1;
                        result[i] += code[l];
                    } else {
                        result[i] += code[l];
                    }
                }
            }
        }
        return result;
    }
}
