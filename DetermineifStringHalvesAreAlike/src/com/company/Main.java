package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.halvesAreAlike("AbCdEfGh"));
    }

    public Boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int ans = 0;
        int mid = s.length() / 2;

        for(int i = 0,j = mid; i < s.length() / 2; i++,j++) {
            if(vowels.indexOf(s.charAt(i)) >= 0) {
                ans++;
            }
            if(vowels.indexOf(s.charAt(j)) >= 0) {
                ans--;
            }
        }

        return ans == 0;
    }
}
