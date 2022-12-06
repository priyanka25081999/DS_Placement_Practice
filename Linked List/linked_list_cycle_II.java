// LinkedList : Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
// Leetcode : https://leetcode.com/problems/linked-list-cycle-ii/
// Fast and slow pointer approach
// Time complexity : O(N) - Take overall iterations and club them to O(N)
// Space complexity : O(1) - No extra data structure is used.

/*

1. Initially take two pointers, fast and slow. The fast pointer takes two steps ahead while the slow pointer will take a single step ahead for each iteration.
2. We know that if a cycle exists, fast and slow pointers will collide.
3. If the cycle does not exist, the fast pointer will move to NULL
4. Else, when both slow and fast pointer collides, it detects a cycle exists.
5. Take another pointer, say entry. Point to the very first of the linked list.
6. Move the slow and the entry pointer ahead by single steps until they collide. 
7. Once they collide we get the starting node of the linked list.

*/

// using only 2 pointers fast and slow
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
            {
                // it's a loop
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

// Using another pointer "entry"

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next == null) 
           return null;  
        
        ListNode fast = head, slow = head, entry = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
            {
                // it's a loop
                while(slow!=entry)
                {
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }
        return null;
    }
}
