package com.practice.Stack;

public class BalanceParanthesis {

    private static boolean isValid(String s) {

        int closing_count = 0;
        int opening_count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                closing_count++;
            } else {
                opening_count++;
            }
            if (closing_count > opening_count) return false;
        }

        if (closing_count == opening_count) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(())"));
        System.out.println(isValid("(()"));
        System.out.println(isValid(")("));
    }
}
