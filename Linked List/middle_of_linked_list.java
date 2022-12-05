// Linked List : Find middle of the linked list
// First approach :  Find the length of linked list, then calculate the middle and return the list from middle node
// Second approach : 2 pointer, make fast and slow pointers, fast moves 2 nodes and slow moves 1 node ahead
// https://leetcode.com/problems/middle-of-the-linked-list/

// First approach
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
    public ListNode middleNode(ListNode head) {
        // find the length of the list
        ListNode temp = head;
        int len = 0;
        
        while(temp!=null)
        {
            len++;
            temp = temp.next;
        }
        
        // find the mid of the list
        int mid = len/2;
        
        // return the list from middle node 
        for(int i=0; i<mid; i++)
        {
            head = head.next;
        }
        
        return head;
    }
}

// Another approach - find mid
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode temp = head;
        
        while(temp!=null)
        {
            cnt++;
            temp = temp.next;
        }
        
        temp=head;
        int mid = cnt/2;
        
        while(temp!=null && mid>0)
        {
            mid--;
            temp = temp.next;
        }
        
        return temp;
    }
}
*/

/* Second approach : Two pointers
This approach is also called as "Tortoise-Hare-Approach" [Efficient]
Space complexity : O(N)
Time complexity : O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}

*/
