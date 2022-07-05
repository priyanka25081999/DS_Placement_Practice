// Linked List : Sort the linked list of 0s, 1s and 2s
// GFG : https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
// Time Complexity: O(n) where n is the number of nodes in the linked list. 
// Space Complexity: O(1)

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // Create an array to store the count of 0s, 1s and 2s
        int cnt[] = {0,0,0};
        Node temp = head;
        
        while(temp!=null)
        {
            // add the count 
            cnt[temp.data]++;
            temp = temp.next;
        }
        
        int i=0;
        temp = head;
        
        while(temp!=null)
        {
            // if count of an element is zero in the array then move ahead
            if(cnt[i] == 0)
               i++;
            else
            {
                // decreament the count by 1 in the array, replace the node value with the array element and move ahead
                temp.data = i;
                cnt[i]--;
                temp = temp.next;
            }
        }
        
        return head;
    }
}
