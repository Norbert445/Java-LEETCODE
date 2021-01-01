package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String S) {
        int i;
        String result="";

        Stack<Character> stack = new Stack<>();

        stack.push('0');

        for (i = 0; i < S.length(); i++) {
            if (stack.lastElement() == S.charAt(i)) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        for(i=1;i<stack.size();i++) {
            result+=(stack.get(i));
        }
        return result;
    }
}
