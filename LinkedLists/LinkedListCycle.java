/*
Day 23 — Linked List Cycle
LeetCode #141

Topic: Linked List
Pattern: Fast & Slow Pointers (Floyd’s Cycle Detection)

Idea:
Use two pointers:
- slow moves 1 step
- fast moves 2 steps

If there is a cycle, they will eventually meet.
If fast reaches null, no cycle exists.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}