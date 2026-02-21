// Problem: Two Sum (LeetCode #1)
// Platform: LeetCode
// Approach: HashMap complement technique
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
