import java.util.*;

/**
 * Problem: Merge Intervals (LeetCode #56)
 * Topic: Arrays + Sorting
 * Pattern: Interval Merging (Sort + Greedy)
 *
 * Approach:
 * 1. Sort intervals based on start time
 * 2. Traverse and compare with last merged interval
 * 3. Merge if overlapping, otherwise add new interval
 *
 * Time Complexity: O(n log n)  (sorting dominates)
 * Space Complexity: O(n)
 */

public class Day4_MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse intervals
        for (int[] interval : intervals) {

            // If no overlap, add new interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            }
            // Overlap → merge with last interval
            else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    // Example run
    public static void main(String[] args) {

        int[][] intervals = {
                {1,3}, {2,6}, {8,10}, {15,18}
        };

        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }
}
