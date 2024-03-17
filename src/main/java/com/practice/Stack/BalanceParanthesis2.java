package com.practice.Stack;

import java.util.Stack;

public class BalanceParanthesis2 {

    //https://leetcode.com/problems/valid-parentheses/description/
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                else if (ch == ')' && stack.peek() == '(') stack.pop();
                else if (ch == ']' && stack.peek() == '[') stack.pop();
                else if (ch == '}' && stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("(])"));
    }
}
