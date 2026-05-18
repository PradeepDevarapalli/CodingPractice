package com.test.interview;

public class NumberPalindrome {
    public static void main(String[] args) {
        int n = 121;
       // System.out.println("is " +n+ " palindrome:" +checkPalindrome(n));
        System.out.println("is " +n+ " palindrome:" +anotherApproach(n));
    }

    public static boolean anotherApproach(int n) {
        String input = String.valueOf(n);

        return new StringBuilder(input).reverse().toString().equals(input);
    }
    public static boolean checkPalindrome(int n) {
        int original = n;
        int reversed = 0;

        boolean isPalindrome = false;

        while(n!=0) {
            int digit = n%10;
            reversed = reversed *10 +digit;
            n/=10;
        }
        if(original == reversed)
            isPalindrome = true;

        return isPalindrome;
    }
}
