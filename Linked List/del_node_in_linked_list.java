// Linked List : Delete give node in a linked list
// Leetcode : https://leetcode.com/problems/delete-node-in-a-linked-list/
// Time complexity : O(1) - Constant
// Space complexity : O(1) - No extra space/data structure is used.

/*
Approach:
The approach is to copy the next node’s value in the deleted node. Then, link node to next of next node. 
This does not delete that node but indirectly it removes that node from the linked list.
*/

class Solution {
    public void deleteNode(ListNode node) {
        
        if(node.next!=null)
        {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
