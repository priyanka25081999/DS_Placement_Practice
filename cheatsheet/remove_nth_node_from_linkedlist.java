// Linked List : Remove Nth Node From End of List
// Leetcode : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Two pointer approach : linear time - O(n)

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
        
        // move till nth element
        // e.g [1,2,3,4,5] n=2, then fast.val after below loop would be 2.
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
