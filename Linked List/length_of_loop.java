// LinkedList : Find the length of loop
// Two pointers solution
// GFG : https://practice.geeksforgeeks.org/problems/find-length-of-loop/1/?page=2&category[]=Linked%20List&sortBy=submissions#
// Time complexity : O(N) - in worst case, if we need to visit all nodes which are involved in the loop
// Space complexity : O(1) - extra space is not required here

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        
        Node fast = head, slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            // It's a loop condition
            if(fast == slow)
            {
                int len = 1;
                while(slow.next!=fast)
                {   slow = slow.next;
                    len++;
                }
                return len;
            }
        }
        // if no loop, return 0
        return 0;
    }
}
