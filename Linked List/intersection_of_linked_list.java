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

// Approach-2 : Difference in length (better)
// Find length of both the lists. Find the positive difference of these lengths. Move the dummy pointer of the larger list by difference achieved. 
// This makes our search length reduced to the smaller list length. Move both pointers, each pointing two lists, ahead simultaneously if both do not collide.
// Coding ninja - https://www.codingninjas.com/codestudio/problems/630457?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
// Time complexity - O(2max(length of list1,length of list2))+O(abs(length of list1-length of list2))+O(min(length of list1,length of list2))
// Reason: finding the length of both lists takes max(length of list1, length of list2) because it is found simultaneously for both of them. 
// Moving the head pointer ahead by a difference of them. The next one is for searching.
// Space complexity - O(1) - No extra space is used.

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findIntersection(LinkedListNode<Integer> headA, LinkedListNode<Integer> headB) {
	    int lengthA = 0;
        int lengthB = 0;
    
        for(LinkedListNode<Integer> temp = headA; temp != null; temp = temp.next) {
            lengthA++;
        }

        for(LinkedListNode<Integer> temp = headB; temp != null; temp = temp.next) {
            lengthB++;
        }

        if(lengthA < lengthB) {
            return findIntersection(headB, headA);
        }
        
        // find the length difference
        int steps = lengthA - lengthB;

        LinkedListNode<Integer> temp1 = headA;
        LinkedListNode<Integer> temp2 = headB;

        for(int i = 0; i < steps; i++) {
            temp1 = temp1.next;
        }

        while(temp1 != null) {
            if(temp1 == temp2) 
                return temp1.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return -1;
	}
}

// Approach-3 : Optimized
// Take two dummy nodes for each list. Point each to the head of the lists.
// Iterate over them. If anyone becomes null, point them to the head of the opposite lists and continue iterating until they collide or reach to the last (null) node
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
