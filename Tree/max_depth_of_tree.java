// Binary tree : Find maximum depth of the binary tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    public int maxDepth(TreeNode root) {
       
        // Base case
        if(root == null)
            return 0;
        
        // check the length of left-subtree
        int left_len = maxDepth(root.left);
        
        // check the length of right-subtree
        int right_len = maxDepth(root.right);
        
        // return the maximum length
        return Math.max(left_len, right_len) + 1;
    }
}
