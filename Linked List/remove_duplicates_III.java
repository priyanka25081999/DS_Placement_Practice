// Linked List - Remove duplicates from an unsorted linked list
// GeeksforGeeks : HashSet Data structure
// https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1/?page=1&category[]=Linked%20List&sortBy=submissions#

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         // HashSet is a collection of unique data. 
         // If you try to put an object in a HashSet and that object is already present, 
         // the HashSet will ignore it
         HashSet<Integer> hset = new HashSet<>();
         Node current = head, prev = null;
         
         while(current!=null)
         {
             // if hashset contains the current element, then move ahead
             if(hset.contains(current.data))
             {
                 prev.next = current.next;
             }
             else
             {
                 // if hashset doesn't contain the current element, then add the element and proceed.
                 hset.add(current.data);
                 prev = current;
             }
             
             current = current.next;
         }
         
         return head;
    }
}
