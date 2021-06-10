package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack("", result, 0, 0, n);

        return result;
    }

    private void backtrack(String current, List<String> result, int open, int close, int max) {
        if(current.length() == max * 2) {
            result.add(current);
            return;
        }
        if(open < max) backtrack(current + "(",result,open + 1,close,max);
        if(close < open) backtrack(current + ")",result,open,close + 1,max);
    }

    /*public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generateAll(new char[2*n], 0, result);

        return result;
    }

    private void generateAll(char[] current, int pos, List<String> result) {

        if(pos == current.length) {
            if(valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    private boolean valid(char[] parantheses) {
        int valid = 0;
        for(char c : parantheses) {
            if(c == '(') {
                valid++;
            } else {
                valid--;
            }
            if(valid < 0) return false;
        }
        return valid == 0;
    }*/
}
