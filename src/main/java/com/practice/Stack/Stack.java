package com.practice.Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> arr;
    int len;

    public Stack() {
        arr = new ArrayList<>();
        len = 0;
    }

    public void push(int ele) {
        arr.add(ele);
        len++;
    }

    public int pop() {
        if (isEmpty()) return -1;
        int ele = arr.get(len - 1);
        arr.remove(len - 1);
        len--;
        return ele;
    }

    public int top() {
        if (!isEmpty()) return arr.get(len - 1);
        return -1;
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr.get(len - 1);
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.clear();
        System.out.println(stack.pop());
    }
}
