// Linked list : Merge two sorted list
// Leetcode : https://leetcode.com/problems/merge-two-sorted-lists/
// Time complexity : O(N+M) Let N be the number of nodes in list l1 and M be the number of nodes in list l2. 
// We have to iterate through both lists. So, the total time complexity is O(N+M).
// Space complexity : O(N+M) We are creating another linked list that contains the (N+M) number of nodes in the list. So, space complexity is O(N+M).

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // base condition
        if(list1 == null)
            return list2;
        
        if(list2 == null)
            return list1;
       
        ListNode list3 = new ListNode();
        ListNode temp = list3;
        
        while(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                temp.next = list1;
                list1 = list1.next;
            }
            else
            {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        
        // add the remaining list
        temp.next = (list1 == null) ? list2 : list1;
        return list3.next;
    }
}
