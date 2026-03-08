/*
Day 14 - Longest Palindromic Substring
LeetCode #5

Problem:
Given a string s, return the longest palindromic substring in s.

Example:
Input: s = "babad"
Output: "bab"

Approach:
Expand Around Center.
Every character can be the center of a palindrome.
Check for both odd-length and even-length palindromes.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expandFromCenter(s, i, i);       // odd length
            int len2 = expandFromCenter(s, i, i + 1);   // even length

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}