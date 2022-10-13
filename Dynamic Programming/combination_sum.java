// DP : Combination sum
// Leetcode : https://leetcode.com/problems/combination-sum/
// Recursive approach
// Time Complexity: O(2^t * k) where t is the target, k is the average length
// Reason: Assume if you were not allowed to pick a single element multiple times, every element will have a couple of options: 
// pick or not pick which is 2^n different recursion calls, also assuming that the average length of every combination generated is k. 
// (to put length k data structure into another data structure)
// Why not (2^n) but (2^t) (where n is the size of an array)?
// Assume that there is 1 and the target you want to reach is 10 so 10 times you can “pick or not pick” an element.
// Space Complexity: O(k*x), k is the average length and x is the no. of combinations

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> final_list = new ArrayList<>();
        List<Integer> dummy_list = new ArrayList<>();
        
        helper(candidates, final_list, new ArrayList<>(), target, 0);
        return final_list;
    }
    
    public void helper(int candidates[], List<List<Integer>> final_list, List<Integer> dummy_list, int target, int index)
    {
        // base case
        if(index==candidates.length)
        {
            if(target==0)
            {  
                final_list.add(new ArrayList<>(dummy_list));
            }
            
            return;
        }
                
        // we are picking the element
        if(candidates[index]<=target)
        {
            dummy_list.add(candidates[index]);
            helper(candidates, final_list, dummy_list, target-candidates[index], index);
            
            // remove/pop the last element during backtracking
            dummy_list.remove(dummy_list.size()-1);
        }
        
        helper(candidates, final_list, dummy_list, target, index+1);
    }
}
