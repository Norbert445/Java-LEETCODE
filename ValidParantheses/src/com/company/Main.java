package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
