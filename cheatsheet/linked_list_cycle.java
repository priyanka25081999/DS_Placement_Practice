// Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
// Approach 1 - Two pointers (fast and slow)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            // cycle exists
            if(slow == fast)
                return true;
        }
        
        return false;
    }
}
