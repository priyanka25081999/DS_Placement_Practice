// Tree : Construct binary tree from preorder and inorder traversal
// Leetcode : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // create a map to store inorder pairs
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            hmap.put(inorder[i], i);
        
        TreeNode root = buildTreeFunc(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, hmap);
        
        return root;
    }
    
    public TreeNode buildTreeFunc(int[] preorder, int pre_start, int pre_end, int[] inorder, int in_start, int in_end, Map<Integer, Integer> hmap)
    {
        if(pre_start > pre_end || in_start > in_end)
            return null;
        
        // root element
        TreeNode root = new TreeNode(preorder[pre_start]);
        // get the root element position from inorder array
        int in_root = hmap.get(root.val);
        // find the difference between root and start element of inorder
        int num_left_side = in_root - in_start;
        
        // form the left subtree
        // left element should appear before root element hence in_root-1 can be the end
        root.left = buildTreeFunc(preorder, pre_start+1, pre_end+num_left_side, inorder, in_start, in_root-1, hmap);
        
        // form the right subtree
        // right element should appear before root element hence in_root+1 can be the start
        root.right = buildTreeFunc(preorder, pre_start+num_left_side+1, pre_end, inorder, in_root+1, in_end, hmap);
        
        return root;
    }
}
