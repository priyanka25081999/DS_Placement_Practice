// Linked List : Remove Duplicates from Sorted List II
// Hashmap approach
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        ListNode temp = head;
        
        // count the frequencies of each node and store it in hashmap
        while(temp!=null)
        {
            hmap.put(temp.val, hmap.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        
        temp = head;
        ListNode final_list = new ListNode();
        ListNode nn = final_list;
        
        while(temp!=null)
        {
            int freq = hmap.get(temp.val);
            // if the frequency is one
            // create a node in another list
            if(freq == 1)
            {
                ListNode new_node = new ListNode(temp.val);
                nn.next = new_node;
                nn=new_node;
            }    
            temp = temp.next;
        }
        
        // return the new list
        return final_list.next;
    }
}
