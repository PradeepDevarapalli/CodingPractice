package com.test.interview;

import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Input " +input+ " is valid: " +checkParentheses(input));
    }

    private static boolean checkParentheses(String input) {
        Stack<Character> inputChar = new Stack<>();
        for(char c: input.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                inputChar.push(c);
            } else if(c == '}' || c == ']' || c == ')') {
                if(inputChar.isEmpty()) {
                    return false;
                }
                char poppedElement = inputChar.pop();
                if(poppedElement == '}' && c == '{'
                        || poppedElement == ')' && c == '('
                        || c == '[' && poppedElement == ']') {
                    return true;
                }
            }
        }
        return inputChar.isEmpty();
    }
}
