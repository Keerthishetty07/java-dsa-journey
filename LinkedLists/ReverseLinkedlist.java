/*
Day 21 — Reverse Linked List
LeetCode #206

Topic: Linked List
Pattern: Pointer Reversal

Idea:
We reverse the direction of the next pointer for each node.

Steps:
1. Keep track of three pointers:
   prev -> previous node
   curr -> current node
   next -> next node

2. Reverse the link:
   curr.next = prev

3. Move all pointers forward.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }
}