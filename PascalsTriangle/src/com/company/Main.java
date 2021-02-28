package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        result.add(list);

        for(int i = 2; i <=numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0; j < list.size()-1; j++) {
                temp.add(list.get(j) + list.get(j+1));
            }
            temp.add(1);
            result.add(temp);
            list = temp;
        }

        return result;
    }
}
