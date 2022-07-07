// Linked List : Remove Nth Node From End of List
// Leetcode : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
        // fast and slow pointer
        // We can place slow on start position (-1), and place fast on position where is n distance away from head. 
        // Therefore, the distance between left and right will be n+1 eventually.
        ListNode start = new ListNode();
        start.next = head;
        
        ListNode fast = start;
        ListNode slow = start;
        
        for(int i=0; i<n; i++)
        {
            fast = fast.next;
        }
        
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return start.next;
    }
}
