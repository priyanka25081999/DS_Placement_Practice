// LinkedList : Palindrome Linked List
// Leetcode : https://leetcode.com/problems/palindrome-linked-list/
// Approach-1 - using stack data structures or we can also use arraylist datastructure and then divide the arraylist in middle and compare both side elements of arraylist
// Time complexity - O(N) - Iterating through the list to store elements in the array.
// Space complexity - O(N) - Using a stack to store the list elements for further checking.

// Push all elements to stack
// Iterate over the list and pop the element from stack one by one
// Compare the element of list with popped element

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st = new Stack<>();
        
        while(temp!=null)
        {
            st.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null)
        {
            if(st.pop() != temp.val)
                return false;
            temp = temp.next;
        }
        return true;
    }
}

// Approach-2 : reduced space complexity
// find the middle of linked list
// reverse the second half of the linkedlist
// start the pointer from first and middle 
// compare the elements
// Time complexity : O(N/2) + O(N/2) + O(N/2) = O(N)
// O(N/2) for finding the middle element, reversing the list from the middle element, and traversing again to find palindrome respectively.
// Space complexity : O(1) - Extra data structure is not used

class Solution {
    
    // reverse the linked list
    public ListNode reverse(ListNode curr)
    {
        ListNode prev = null, next = null;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        // base case
        if(head==null || head.next==null) 
            return true;
        
        ListNode fast = head, slow = head, temp = head;
        // find the middle
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // reverse the linkedlist from middle node
        slow.next = reverse(slow.next);
        slow = slow.next;
        
        // compare the elements
        while(slow!=null)
        {
            if(temp.val != slow.val)
                return false;
            slow = slow.next;
            temp = temp.next;
        }
        return true;
    }
}
