// LinkedList : Intersection of two linked lists
// Leetcode : https://leetcode.com/problems/intersection-of-two-linked-lists/
// Approach-1 : Brute force method
// Time complexity : O(n*m) - For each node in list 2 entire lists 1 are iterated. 
// Space complexity : O(1) - No extra space is used.

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Start with one of the list
        // and compare it with other list
        
        while(headB!=null)
        {
            // start the 1st list
            // we check headB element with each element of headA
            // start from head node always of headA list
            ListNode temp = headA;
            while(temp!=null)
            {
                // intersection found, nodes are same 
                if(headB == temp)
                    return headB;
                
                temp = temp.next;
            }
            headB = headB.next;
        }
        
        // no intersection found
        return null;
    }
}

// Approach-2 : Optimized
// Take two dummy nodes for each list. Point each to the head of the lists.
// Iterate over them. If anyone becomes null, point them to the head of the opposite lists and continue iterating until they collide.
// Time complexity : O(n)
// Space complexity : O(1)

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA, temp2 = headB;
        
        if(headA == null || headB == null)
            return null;
        
        while(temp1 != temp2)
        {
            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }
        
        return temp1;
        
    }
}
