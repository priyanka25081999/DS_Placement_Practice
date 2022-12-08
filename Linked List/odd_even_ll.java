// LinkedList : Odd Even Linked List - Given the head of a singly linked list, group all the nodes with odd indices together 
// followed by the nodes with even indices, and return the reordered list.
// Leetcode : https://leetcode.com/problems/odd-even-linked-list/description/
// Approach-1 : Iterative way
// Time complexity : O(N), where N is the total number of nodes in the linkedlist
// Space complexity : O(1), we are not using any extra space here

class Solution {
    public ListNode oddEvenList(ListNode head) {
        // base case
        if(head == null || head.next == null || head.next.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head = even;

        while(odd.next!=null && even.next!=null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        // make a link between tail of odd node and head of even node.
        odd.next = even_head;
        return head;
    }
}

// There is an another approach
// We can link even node to the last node by making a new node after last node
// I.e first odd node links to even.next and then even node links to tail.next by creating a new node space
// For this we need to traverse the list once and we can maintain temp pt at the last node
// we stop once the head pointers reaches to the temp pointer.
// To do this, we need to create new node. But, at the end we can make it in O(N) time complexity only and without using any extra data structures.
