package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for(char c : s.toCharArray()) {
            if(c != ')') {
                stack.push(c);
            } else {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    queue.add(stack.pop());
                }

                stack.pop();

                while(!queue.isEmpty()) {
                    stack.push(queue.poll());
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(char c : stack) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
