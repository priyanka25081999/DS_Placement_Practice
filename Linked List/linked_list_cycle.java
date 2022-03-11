// Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
// Fast and slow pointer solution

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
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            // Cycle exists
            if(fast == slow)
                return true;
        }
        
        return false;
    }
}
