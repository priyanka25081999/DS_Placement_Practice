// LinkedList : Delete the middle node of a linked list
// Leetcode : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
// Two pointers approach
// Time complexity : O(N)
// Space complexity : O(1), not using any extra space

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // base case
        if (head.next == null)
            return null;

        // here we can introduce prev pt
        ListNode slow=head, fast=head, prev=null;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // remove the middle element using prev
        prev.next = prev.next.next;

        return head;
    }
}
