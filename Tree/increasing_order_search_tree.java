// Tree : Increasing order search tree
// Leetcode : Recursive solution
// https://leetcode.com/problems/increasing-order-search-tree/

class Solution {
    TreeNode final_tree;
    public TreeNode increasingBST(TreeNode root) {
        BST(root);
        return final_tree;
    }
    
    public void BST(TreeNode root)
    {
        if(root == null)
            return;
        
        BST(root.right);
        // create a new node 
        // TreeNode constructor with 3 parameters : value, left and right
        final_tree = new TreeNode(root.val, null, final_tree);
        BST(root.left);
    }
}

/* 2nd solution : Recursive way 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {       
        return increasingBST(root, null);
    }
    
    public TreeNode increasingBST(TreeNode root, TreeNode parent)
    {
        if(root == null)
            return parent;
        
        // If root is not null, check the left subtree
        TreeNode new_root = increasingBST(root.left, root);
        root.left = null;
        
        // recurse through right subtree
        root.right = increasingBST(root.right, parent);
        return new_root;
    }
}
*/

