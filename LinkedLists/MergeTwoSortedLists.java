/*
Day 22 — Merge Two Sorted Lists
LeetCode #21

Topic: Linked List
Pattern: Two Pointer Technique

Idea:
Traverse both lists and attach the smaller node each time.
Use a dummy node to simplify handling the head.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}