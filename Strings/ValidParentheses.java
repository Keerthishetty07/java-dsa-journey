/*
Day 17 — Valid Parentheses (LeetCode #20)

Topic: Strings
Approach: Pair elimination using StringBuilder

Problem:
Check if a string containing (), {}, [] is valid.

Approach:
Traverse characters and build a new string.
If the current character forms a valid pair with the last
character in the builder, remove the last character.
Otherwise, append the current character.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class Solution {

    public boolean isValid(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            int len = sb.length();

            if (len > 0) {
                char last = sb.charAt(len - 1);

                if ((last == '(' && c == ')') ||
                    (last == '{' && c == '}') ||
                    (last == '[' && c == ']')) {

                    sb.deleteCharAt(len - 1);
                    continue;
                }
            }

            sb.append(c);
        }

        return sb.length() == 0;
    }
}