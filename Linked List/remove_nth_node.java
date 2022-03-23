// Linked List :  Remove nth node from linked list
// Two pointer approach
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        
        // move the fast node till nth position
        for(int i=0; i<n; i++)
        {
            fast = fast.next;
        }
        
        // traverse until we reached n-1 node
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        // remove the nth node from the list
        slow.next = slow.next.next;
        return start.next;
    }
}
