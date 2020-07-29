package com.leetcode.simple;

public class S125 {
    /*
    125.验证回文串
    给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

    说明：本题中，我们将空字符串定义为有效的回文串。

    示例 1:

    输入: "A man, a plan, a canal: Panama"
    输出: true
    示例 2:

    输入: "race a car"
    输出: false
     */
    public static void main(String[] args) {
        String s = ".,";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(new StringBuilder(sb).reverse().toString());
    }
}
