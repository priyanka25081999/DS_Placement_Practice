// Array : Subarray sum equals K
// HashMap approach
// https://leetcode.com/problems/subarray-sum-equals-k/
// Time complexity : O(N)
// Space complexity : O(N), as we are using an extra space to store elements into hashmap

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        int current_sum = 0, total_count = 0;
        hmap.put(0, 1);
        
        for(int i=0; i<nums.length; i++)
        {
            // calculate the current sum 
            current_sum = current_sum + nums[i];
            
            if(hmap.containsKey(current_sum - k))
                total_count = total_count + hmap.get(current_sum-k);
            
            hmap.put(current_sum, hmap.getOrDefault(current_sum, 0)+1);
        }
        
        return total_count;
    }
}
