// Tree : Maximum depth of binary tree
// Leetcode : https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Time complexity : Probably O(h) where h is height of the tree

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
    public int maxDepth(TreeNode root) {
        // base case
        if(root == null)
            return 0;
        
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        
        return Math.max(left_depth, right_depth)+1;
    }
}
