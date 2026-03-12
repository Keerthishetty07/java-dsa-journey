/*
Day 20 — Count and Say
LeetCode #38

Topic: Strings
Pattern: Sequence Construction / Run-Length Encoding

Idea:
Start with "1".
For each iteration, read the previous string and describe it:
count the number of repeating digits and append count + digit.

Example:
1 -> "11"  (one 1)
11 -> "21" (two 1s)
21 -> "1211" (one 2, one 1)

Time Complexity: O(n * length of string)
Space Complexity: O(n)
*/

public class Solution {

    public String countAndSay(int n) {

        String result = "1";

        for (int i = 2; i <= n; i++) {

            StringBuilder current = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {

                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    current.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }

            current.append(count).append(result.charAt(result.length() - 1));
            result = current.toString();
        }

        return result;
    }
}