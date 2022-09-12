// Linked List :  Remove nth node from linked list
// Two pointer approach
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Time complexity : O(N)
// Space complexity : O(1)

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


// Another Naive approach
// Need to traverse the array 2 times

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
        // base case
        if(head == null || head.next == null)
            return null;
        
        int cnt=0;
        ListNode temp = head;
        
        while(temp!=null)
        {
            cnt++;
            temp = temp.next;
        }
        

        temp=head;
        int pos = cnt-n;
        
        if(pos == 0)
            head = temp.next;
        else
        {
            for(int i=0; i<pos-1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
        }
        
        return head;
    }
}
