/*
Day 17 — Valid Parentheses (LeetCode #20)

Topic: Strings
Approach: Counter Tracking

Problem:
Given a string containing only '(' and ')',
determine if the parentheses are valid.

A string is valid if:
1. Every opening parenthesis '(' has a matching ')'
2. Parentheses close in the correct order.

Approach:
Traverse the string and maintain a counter.
- Increment the counter for '('
- Decrement the counter for ')'
- If the counter becomes negative at any point, return false
- At the end, the counter must be zero for a valid string

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {

    public boolean isValid(String s) {

        int count = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                count++;
            } 
            else if (c == ')') {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}