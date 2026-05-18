package com.test.interview;

import java.util.Stack;

public class EvaluatePostfixExpr {
    public static int evaluatedResult(String[] input) {
        Stack<Integer> inputStack = new Stack<>();
        for(String token : input) {
            if(token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*") ) {
                int a = inputStack.pop();
                int b = inputStack.pop();
                switch(token) {
                    case "+" :
                        inputStack.push(a+b);
                        break;
                    case "-" :
                        inputStack.push(a-b);
                        break;
                    case "*" :
                        inputStack.push(a*b);
                        break;
                    case "/" :
                        inputStack.push(b/a);
                        break;
                }
            } else
                inputStack.push(Integer.valueOf(token));
        }
        return inputStack.pop();
    }
    public static void main(String[] args) {
        String[] input = {"2", "3", "1", "*", "+", "9", "-"};
        String[] input2 = {"6", "3", "/"};
        System.out.println("Evaluated result: " +evaluatedResult(input));
    }
}
