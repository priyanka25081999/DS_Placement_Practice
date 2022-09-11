// Linked List : Add two numbers of linked list
// Simple approach
// Time Complexity : O(max(m,n)). Assume that m and n represent the length of l1 and l2 respectively
// the algorithm above iterates at most max(m,n) times.
// Space Complexity : O(max(m,n)). The length of the new list is at most max(m,n)+1.
// Leetcode : https://leetcode.com/problems/add-two-numbers/  (Striver)

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode temp = l3;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry==1)
        {
            int sum = 0;
            if(l1!=null)
            {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            
            if(l2!=null)
            {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            
            sum = sum + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        
        return l3.next;
    }
}
