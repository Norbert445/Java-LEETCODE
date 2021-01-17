package com.company;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> reversed;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        reversed = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(reversed.isEmpty()) {
            shiftStacks();
        }
        return reversed.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(reversed.isEmpty()) {
            shiftStacks();
        }
        return reversed.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty() && reversed.isEmpty();
    }

    public void shiftStacks() {
        while(!stack.isEmpty()) {
            reversed.push(stack.pop());
        }
    }
}
