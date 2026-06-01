package com.test.fidelity;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("The longest palindrome is: " +calculateLongestPalindrome(s));
    }

    private static int calculateLongestPalindrome(String s) {
        int max = 0;

        for(int i=0;i<s.length();i++) {
            int odd = max(s, i, i);
            int even = max(s, i, i+1);

            max = Math.max(max, Math.max(odd, even));
        }
        return max;
    }

    private static int max(String s, int left, int right) {
        while(left>0 && right<s.length()-1 && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        return right-left-1;
    }
}
