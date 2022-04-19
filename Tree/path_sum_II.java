// Tree : Path sum II
// DFS approach
// https://leetcode.com/problems/path-sum-ii/

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
    // Create a final list
    List<List<Integer>> paths = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return paths;
        
        dfs(root, targetSum, new ArrayList<>());
        
        return paths;
    }
    
    void dfs(TreeNode node, int targetSum, ArrayList<Integer> path)
    {
        // specific case
        if(node == null)
            return;
        
        // add the node into the list
        path.add(node.val);
        // decrease the targetsum by node value
        targetSum = targetSum - node.val;
        
        // add the path to final paths list 
        if(targetSum == 0 && node.right == null && node.left == null)
            paths.add(path);
        
        // call the dfs again for left and right subtree by passing current path values
        // this will append the path
        dfs(node.left, targetSum, new ArrayList<>(path));
        dfs(node.right, targetSum, new ArrayList<>(path));
    }
}
