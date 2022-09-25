// Tree : Find the kth smallest element in a BST
// Leetcode : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Approach-1 : Inorder traversal
// Time complexity : O(nlogn)-for sorting and O(n)-for traversal
// Space complexity : O(n) - storing the nodes value in a list

class Solution {
    
    public void inorder(TreeNode root, ArrayList<Integer> res)
    {
        if(root!=null)
        {
            inorder(root.left, res);
            res.add(root.val);
            inorder(root.right, res);
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
        // inorder traversal
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root, res);
        
        Collections.sort(res);
        return res.get(k-1);
    }
}
