package com.practice.Stack;

import java.util.Stack;

public class NextGreaterElement {
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();
        long[] ans = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop();
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
}
