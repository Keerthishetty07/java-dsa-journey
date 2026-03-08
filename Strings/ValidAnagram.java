/*
Day 12 - Valid Anagram
LeetCode #242

Problem:
Given two strings s and t, return true if t is an anagram of s,
otherwise return false.

An anagram is formed by rearranging the letters of another word
using all the original letters exactly once.

Example:
Input: s = "anagram", t = "nagaram"
Output: true
*/

class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}