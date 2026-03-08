/*
Day 9 - Rotate Array
LeetCode Problem #189

Problem:
Rotate the array to the right by k steps.

Example:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Approach:
1. Reverse the entire array
2. Reverse the first k elements
3. Reverse the remaining elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}