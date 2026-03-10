/*
Day 18 — Implement strStr() / Find the Index of the First Occurrence in a String
LeetCode #28

Topic: Strings
Pattern: Substring Search (Brute Force)

Idea:
We check every possible starting index in the main string (haystack).
For each position, we compare characters with the target string (needle).
If all characters match, we return that starting index.

Time Complexity: O(n * m)
Space Complexity: O(1)
*/

public class Solution {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Traverse each possible starting index
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters of needle with haystack
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched, return the starting index
            if (j == m) {
                return i;
            }
        }

        // If needle is not found in haystack
        return -1;
    }
}