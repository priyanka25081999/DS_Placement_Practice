// Tree : Subtree of another tree
// Leetcode : https://leetcode.com/problems/subtree-of-another-tree/
// Recursive solution - use logic of SameTree problem (https://github.com/priyanka25081999/DS_Placement_Practice/blob/main/cheatsheet/same_tree.java)

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // base case
        if(root == null)
            return false;
        
        // check if tree and subtree are same
        if(isSameTree(root, subRoot))
            return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p == null && q == null)
            return true;
        
        if(p == null || q == null || p.val!=q.val)
            return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
