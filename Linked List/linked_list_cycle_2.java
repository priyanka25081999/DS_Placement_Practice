// Linked List : Find the start node of the cycle in linked list.
// Two pointers approach - Floyd Cycle Algorithm
// https://leetcode.com/problems/linked-list-cycle-ii/

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
    public ListNode detectCycle(ListNode head) {
        // Floyd Cycle Algorithm
        // Traverse linked list using two pointers.
        // Move one pointer(slow_p) by one and another pointer(fast_p) by two.
        // If these pointers meet at the same node then there is a loop. If pointers do not           // meet then linked list doesn’t have a loop.
        
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                // now reset the pointer positions
                // as we want from where the cycle begins
                slow=head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
