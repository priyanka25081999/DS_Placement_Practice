// LinkedList : Reverse Nodes in k-Group
// Leetcode : https://leetcode.com/problems/reverse-nodes-in-k-group/
// Recursion approach
// Time complexity : O(N) - Nested iteration with O((N/k)*k) which makes it equal to O(N).
// Space complexity : O(1) - Extra space is not used

// Approach:
// Find the length of linked list
// Iterate through the linked list until the length of list to be processed is greater than and equal to given k.
// For each iteration, reverse the nodes in k group

class Solution {
    
    // find the length of the linkedlist
    public int length(ListNode head)
    {
        ListNode temp = head;
        int cnt = 0;
        
        while(temp!=null)
        {
            cnt++;
            temp = temp.next;
        }
        
        return cnt;
    }
    
    public ListNode reverse(ListNode head, int k, int len)
    {
        // base case
        if(len < k)
            return head;
        
        ListNode curr = head, prev = null, temp = null;
        int cnt = 0;
        
        while(curr!=null && cnt<k)
        {
            // same logic of normal reverse linkedlist
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            cnt++;
        }
        
        // again move ahead to another group as temp is not reached to the end
        if(temp!=null)
        {
            head.next = reverse(temp, k, len-k);
        }
        
        return prev;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = length(head);
        
        return reverse(head, k, len);
    }
}
