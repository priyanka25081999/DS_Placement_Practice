// LinkedList : Swapping Nodes in a LinkedList
// Fast pointer approach
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
// Also, check swapping_nodes.png 

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head, end = head, fast = head;
        
        // go to kth node from start
        for(int i=1; i<k; i++)
        {   fast = fast.next;
        }
        start = fast;
        
        // go the kth node from end
        while(fast.next!=null)
        {
            fast = fast.next;
            end = end.next;
        }
        
        // swap the node values
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        
        return head;
    }
}
