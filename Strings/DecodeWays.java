/*
Day 19 — Decode Ways
LeetCode #91

Topic: Strings / Dynamic Programming
Pattern: DP with previous state tracking

Idea:
Digits map to letters:
1 -> A, 2 -> B, ..., 26 -> Z

At each position we check:
1-digit decode (1–9)
2-digit decode (10–26)

dp[i] represents number of ways to decode up to index i.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class Solution {

    public int numDecodings(String s) {

        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}