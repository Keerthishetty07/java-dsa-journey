/*
Day 11 - Longest Substring Without Repeating Characters
LeetCode #3

Problem:
Given a string s, find the length of the longest substring
without repeating characters.

Example:
Input: s = "abcabcbb"
Output: 3
Explanation: "abc" is the longest substring.

Approach:
Use Sliding Window with HashSet.
Expand the window until a duplicate appears.
Remove characters from the left until the duplicate is removed.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}