// LinkedList : Palindrome Linked List
// Leetcode : https://leetcode.com/problems/palindrome-linked-list/
// Approach-1 - using stack data structures
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
