// Linked List : Merge two sorted lists
// https://leetcode.com/problems/merge-two-sorted-lists/

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
        
        if(list1==null)
            return list2;
        
        if(list2==null)
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
            temp=temp.next;
        }
        
        // Add the remaining list
        temp.next = (list1 == null) ? list2 : list1;
        return list3.next;
    }
}
