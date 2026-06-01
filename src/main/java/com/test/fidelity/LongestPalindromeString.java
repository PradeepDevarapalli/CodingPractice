package com.test.fidelity;

public class LongestPalindromeString {
    public static void main(String[] args) {
        String s = "abaaba";
        String result = calculateLongestSubString(s);
        System.out.println("Longest substring:" +result);
        System.out.println("Longest substring length:"+result.length());
    }

    private static String calculateLongestSubString(String s) {
        String longest = "";
        for(int i=0; i<s.length(); i++) {
            String even = expand(s, i ,i+1);
            String odd = expand(s, i ,i);

            if(even.length() > longest.length())
                longest = even;

            if(odd.length() > longest.length())
                longest = odd;
        }
        return longest;
    }

    private static String expand(String s, int left, int right) {
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        return s.substring(left+1, right);
    }
}
