/*
Day 24 — Remove Nth Node From End of List
LeetCode #19

Topic: Linked List
Pattern: Two Pointer Technique

Idea:
Use two pointers (fast & slow).
Move fast pointer n steps ahead.
Then move both pointers until fast reaches end.
Slow will be just before the node to delete.

Use a dummy node to handle edge cases (like removing head).

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove node
        slow.next = slow.next.next;

        return dummy.next;
    }
}