/**
 * Problem: Maximum Subarray (LeetCode #53)
 * Topic: Arrays / Dynamic Programming
 * Pattern: Kadane's Algorithm (Running Sum + State Reset)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Insight:
 * Maintain a running sum. If extending the previous subarray reduces the sum,
 * restart from the current element instead.
 */

public class Day3_MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend the current subarray or start fresh
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Track the best subarray sum seen so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}

// Example Dry Run:
// nums = [-2,1,-3,4,-1,2,1,-5,4]
// Maximum subarray = [4,-1,2,1] → sum = 6