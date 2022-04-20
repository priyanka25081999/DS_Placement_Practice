// Array : contains duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/
// HashMap approach

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // create the hashmap
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        { 
            // add the value in hashmap
            Integer j = map.put(nums[i], i);
            
            // check the condition
            if(j!=null && (i-j) <= k)
                return true;
        }
        
        return false;
    }
}
