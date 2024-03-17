package com.practice.Stack;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/description/
public class MinStack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int minEle = Math.min(val, minStack.peek());
            minStack.push(minEle);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if (!stack.isEmpty()) return stack.peek();
        return -1;
    }

    public int getMin() {
        if (!minStack.isEmpty()) return minStack.peek();
        return -1;
    }
}


