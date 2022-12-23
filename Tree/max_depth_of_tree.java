// Binary tree : Find maximum depth of the binary tree
// Leetcode : https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Approach - recursive way (use of recurrence)
// Time complexity : O(N), we have to visit all the nodes of the tree
// Space complexity : O(N), in the worst case (auxiliary space complexity)

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
        // below is the recurrence
        return Math.max(left_len, right_len) + 1;                 
    }
}

// TODO : Do this in level-order traversal way using queue
