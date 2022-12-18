// Tree : Bottom view of Binary Tree
// GFG : https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
// Approach : Silghtly different version of vertical order traversal
// Here, we need to do vertical order traversal and pick the last node only. That is draw the lines vertically, where root line is always mark as 0, 
// left is -1 and right is +1 and so on.
// Time complexity : O(N)
// Space complexity : O(N), as we are using an extra DS for storing

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        
        // base case
        if(root == null)
            return res;
        
        // Map of line number(vertical) and it's respective node value
        Map<Integer, Integer> tmap= new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        
        // make root node veritcal line as 0 and add it to the queue
        root.hd = 0;
        queue.add(root);
        
        while(!queue.isEmpty()) {
            // remove the top node of the queue and add it's childern if any
            Node temp = queue.remove();
            int hd = temp.hd;
            // now, put this entry into the map (hd, nodevalue)
            tmap.put(hd, temp.data);
            
            // add it's left node if any
            if(temp.left!=null) {
                temp.left.hd = hd-1;  // we are moving left side, so negative vertical line no's
                queue.add(temp.left);
            }
            
            // add it's right if any
            if(temp.right!=null) {
                temp.right.hd = hd+1;  // we are moving left side, so positive vertical line no's
                queue.add(temp.right);
            }
        }
        
        // add the map values into the res list
        // Note that, map always stores values in the sorted order like -2,-1,0,1,2 etc.
        for(Map.Entry<Integer, Integer> entry : tmap.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}
