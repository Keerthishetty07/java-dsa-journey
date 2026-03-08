/*
Day 16 - Reverse Words in a String
LeetCode #151

Problem:
Given a string s, reverse the order of the words.

Rules:
1. Remove leading and trailing spaces.
2. Reduce multiple spaces between words to a single space.
3. Return the words in reverse order.
*/

class Solution {

    public String reverseWords(String s) {

        // Remove extra spaces at start and end
        s = s.trim();

        // Split words using one or more spaces
        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        // Traverse from last word to first
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}