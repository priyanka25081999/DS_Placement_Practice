// Tree : Find the diameter of the Binary Tree
// Leetcode : https://leetcode.com/problems/diameter-of-binary-tree/description/
// Approach : Recursive approach and reusing the code of finding ht of the binary tree
// Time complexity : O(N)
// Space complexity : O(1) Extra Space + O(H) Recursion Stack space (Where “H”  is the height of binary tree )  

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        // Find the left and right height of each node and then sum left and right height, we will get the diameter
        // We are using here the logic of finding height of the binary tree with slight change
        int diameter[] = new int[1];
        helper(root, diameter);
        return diameter[0];
    }

    public int helper(TreeNode root, int[] diameter) {
        if(root == null)
            return 0;
        
        int left_ht = helper(root.left, diameter);
        int right_ht = helper(root.right, diameter);

        diameter[0] = Math.max(left_ht+right_ht, diameter[0]);
        return 1+Math.max(left_ht, right_ht); // to get the ht of each node
    }
}
