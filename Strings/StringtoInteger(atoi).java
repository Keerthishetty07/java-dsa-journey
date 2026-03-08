/*
Day 15 - String to Integer (atoi)
LeetCode #8

Problem:
Implement the myAtoi(string s) function which converts a string to a
32-bit signed integer.

Rules:
1. Ignore leading whitespace.
2. Check for optional '+' or '-' sign.
3. Read digits until a non-digit appears.
4. Clamp the value within the 32-bit integer range.

Range:
[-2^31, 2^31 - 1]
*/

class Solution {

    public int myAtoi(String s) {

        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // 4. Handle overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}