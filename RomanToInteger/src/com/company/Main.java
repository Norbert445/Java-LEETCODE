package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.romanToInt("LXIX"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> roman = new HashMap<>();

        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            if(i + 1 == s.length()) {
                result += roman.get(s.charAt(i));
            }
            else if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))) {
                result -= roman.get(s.charAt(i));
            }
            else {
                result += roman.get(s.charAt(i));
            }
        }
        return result;
    }
}
