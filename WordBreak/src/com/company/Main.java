package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int len = 1; len <= s.length(); len++) {
            for(int i = 0; i < len; i++) {
                if(dp[i] && wordDict.contains(s.substring(i,len))) {
                    dp[len] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
