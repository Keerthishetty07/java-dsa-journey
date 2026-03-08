/*
Day 10 - Missing Number
LeetCode Problem #268

Problem:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example:
Input: nums = [3,0,1]
Output: 2

Approach:
Use the sum formula for first n natural numbers.

Expected Sum = n * (n + 1) / 2
Actual Sum = sum of elements in array

Missing Number = Expected Sum - Actual Sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}