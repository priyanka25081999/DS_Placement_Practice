// Array : Number of good pairs.
// Given an array of integers nums, return the number of good pairs. A pair (i, j) is called good if nums[i] == nums[j] and i < j.
// Leetcode - https://leetcode.com/problems/number-of-good-pairs/

// Solution 1 - Brute force approach

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i] == nums[j] && i<j)
                    cnt++;
            }
        }
        
        return cnt;
    }
}

/* 
Solution 2 - HashMap approach
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                int val = hmap.get(nums[i]);
                cnt = cnt + val;
                hmap.put(nums[i], val+1); // increase the value by 1
            }
            else
                hmap.put(nums[i], 1); // Add new entry to hashmap
        } 
        
        return cnt;
    }
}
*/
