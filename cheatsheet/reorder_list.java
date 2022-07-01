// Linked list - Reorder list
// Leetcode : https://leetcode.com/problems/reorder-list/

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
    public void reorderList(ListNode head) {
        // count the nodes in the linked list
        int n=0;
        ListNode temp=head;
        Stack<ListNode> st = new Stack<>();
        
        while(temp!=null)
        {
            n++;
            st.push(temp);
            temp = temp.next;
        }
        
        int i=1;
        while(i<=n/2)
        {
            ListNode tail = st.pop();
            ListNode next = head.next;
            
            head.next = tail;
            tail.next = next;
            
            // move head to next node
            head = next;
            i++;
        }
        head.next = null;
    }
}
