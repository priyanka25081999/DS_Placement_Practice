// Tree: Count Good Nodes in Binary Tree
// Leetcode: https://leetcode.com/problems/count-good-nodes-in-binary-tree/
// Recursive solution

class Solution {
    public int goodNodes(TreeNode root) {
        return func_rec(root, Integer.MIN_VALUE);
    }
    
    public int func_rec(TreeNode child, int max)
    {
        // base case for child nodes
        if(child==null)
          return 0;

        int cnt=0;
        if(child.val >= max)
           cnt++;

        // traverse left subtree
        int left = func_rec(child.left, Math.max(max, child.val));

        // traverse right subtree
        int right = func_rec(child.right, Math.max(max, child.val));

        return cnt+left+right;
    }
}
