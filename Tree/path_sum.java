// Tree : Path Sum
// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum
// https://leetcode.com/problems/path-sum/

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        // Base case
        if(root==null)
            return false;
        
        int remaining_sum = targetSum - root.val;
        
        // if left and right are null and remaining sum equals to 0 (target sum)
        // return true
        if(remaining_sum == 0 && root.left == null && root.right == null)
            return true;
        
        // traverse the left subtree
        if(hasPathSum(root.left, remaining_sum))
            return true;
        
        // traverse the right subtree
        if(hasPathSum(root.right, remaining_sum))
            return true;
        
        return false;
    }
}
