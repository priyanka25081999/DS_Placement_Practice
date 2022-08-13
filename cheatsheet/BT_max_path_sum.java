// Tree : Binary tree maximum path sum
// Leetcode : https://leetcode.com/problems/binary-tree-maximum-path-sum/
// DFS approach : O(n) time complexity
// Reference : https://www.youtube.com/watch?v=Hr5cWUld4vU

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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    
    public int helper(TreeNode root)
    {
        // base case
        if(root == null)
             return 0;
        
        // find the sum of left subtree
        int left_sum = Math.max(helper(root.left), 0);
        // find the sum of right subtree
        int right_sum = Math.max(helper(root.right), 0);
        
        // return the max element sum (i.e only one max path sum) to the root from subtree
        // find the sum at root with left and right subtree
        // root itself, root + left + right
        max = Math.max(root.val+left_sum+right_sum, max);
        
        // what to return, a branch with max value, contain the root node itself
        return root.val + Math.max(left_sum, right_sum);
    }
}
