package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i < len; i++) {
                if (dp[i] && wordDict.contains(s.substring(i, len))) {
                    dp[len] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public boolean wordBreakRecursive(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for (String str : wordDict) {
            set.add(str);
        }
        return dfs(s, set);
    }

    public boolean dfs(String s, Set<String> set) {
        if (s.equals("")) return true;

        for(int i = 1; i  <= s.length(); i++) {
            if(set.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()),set)) {
                return true;
            }
        }
        return false;
    }

}
