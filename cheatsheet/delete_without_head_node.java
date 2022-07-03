// Linked List : Delete without head pointer 
// GFG : https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/#

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         // Replace the deleted node with it's next node
         del.data = del.next.data;
         del.next = del.next.next;
    }
}
