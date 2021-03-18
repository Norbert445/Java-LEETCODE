package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int reverseBits(int n) {
        int res = 0;
        int bits = 32;
        ArrayList<Integer> list = new ArrayList<>();

        while(bits > 0) {
            int temp = n & 1;
            list.add(temp);
            n = n >> 1;
            bits--;
        }

        for(int i = 0; i < list.size(); i++) {
            res = res << 1;
            res = res | list.get(i);
        }

        return res;
    }
}
