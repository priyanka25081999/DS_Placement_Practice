// Linked List : Given a linked list of 0s, 1s and 2s, sort it.
// GFG : https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=given-a-linked-list-of-0s-1s-and-2s-sort-it
// Approach : Storing frequency of 0/1/2 into the another data structures (array here)
// Time complexity : O(2*N) = O(N), we are traversing the list twice here
// Space complexity : O(3) = constant, we are using an extra data structure (array here) to store the freq of 0/1/2.

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int cnt[] = {0,0,0};
        Node temp = head;
        
        while(temp!=null) {
            cnt[temp.data]++;
            temp = temp.next;
        }
        
        int i=0;
        temp = head;
        while(temp!=null) {
            
            // It means the number (either 0/1/2 is not present)
            if(cnt[i] == 0)
                i++;
            else {
                // place the value of i into the nodes' data
                temp.data = i;
                // decreament the frequency
                cnt[i]--;
                temp = temp.next;
            }
        }
        
        return head;
    }
}
