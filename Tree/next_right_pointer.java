// Tree : Populating next right pointers in each node
// Recursion approach
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // base case
        if(root==null)
           return null;
        
        connectNodes(root.left, root.right);
        return root;
    }
    
    public void connectNodes(Node node1, Node node2)
    {
        if(node1 == null || node2 == null)
            return;
        
        // add next node as node2
        node1.next = node2;
        
        // connect two nodes of different branches
        connectNodes(node1.left, node1.right);
        connectNodes(node2.left, node2.right);
        connectNodes(node1.right, node2.left); 
    }
}
