// Copy list with random pointer
// Link - https://leetcode.com/problems/copy-list-with-random-pointer/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;
        HashMap<Node, Node> hmap = new HashMap<>();

        while(current != null) {
            hmap.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        while(current != null) {
            hmap.get(current).next = hmap.get(current.next);
            hmap.get(current).random = hmap.get(current.random);
            current = current.next;
        }

        return hmap.get(head);
    }
}
