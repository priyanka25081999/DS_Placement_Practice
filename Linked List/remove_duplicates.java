// Linked list : Remove duplicates from sorted linked list
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
            return head;
        
        ListNode temp = head;
        
        while(temp.next!=null)
        {
            // if current and next value are same
            // remove next node
            if(temp.val == temp.next.val)
                temp.next=temp.next.next;
            else
                temp=temp.next;
        }
        return head;
    }
}
