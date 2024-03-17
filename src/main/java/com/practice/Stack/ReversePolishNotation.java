package com.practice.Stack;

import java.util.Stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
public class ReversePolishNotation {

    public int evaluate(int a, int b, String operator) {
        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("/")) {
            return a / b;
        }
        return a * b;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            if (str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push((evaluate(a, b, str)));
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        //String[] input = {"8", "2", "+", "-", "*", "/", "2", "3"};
        //String[] input = {"8", "2", "+", "-", "*"};
        String[] input = {"2", "1", "+", "3", "*"};
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        int res = reversePolishNotation.evalRPN(input);
        System.out.print(res);
    }
}
