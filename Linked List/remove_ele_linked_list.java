// Linked list : Remove linked list elements
// https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        
        while(head.next!=null && head.val==val)
            head = head.next;
        
        if(head.val==val && head.next == null)
            return null;
        
        ListNode temp = head;
        
        while(temp.next!=null)
        {
            if(temp.next.val == val)
                temp.next=temp.next.next;
            else
                temp = temp.next;
        }
        
        return head;
    }
}
