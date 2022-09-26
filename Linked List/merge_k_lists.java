// LinkedList : Merge K sorted lists
// Leetcode : https://leetcode.com/problems/merge-k-sorted-lists/
// Time complexity : O(K*N) where “K” is the number of linked lists in the array and “N” is the number of nodes
// Space complexity : O(1) Since we are not using any extra space.

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // similar to merge two sorted linked list
        ListNode res = new ListNode(0);
        
        for(ListNode list : lists)
            res.next=merge(res.next, list);  
        
        return res.next;
    }
    
    public ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                temp.next = l1;
                l1=l1.next;
            }
            else
            {
                temp.next = l2;
                l2=l2.next;
            }
            
            temp=temp.next;
        }
        
        temp.next = l1!=null ? l1 : l2;
        
        return res.next;
    }
}

// Optimized approach is also there - Divide and Conquer (Merge sort)
// Link - https://takeuforward.org/data-structure/merge-k-sorted-arrays/ (Solution-2)
