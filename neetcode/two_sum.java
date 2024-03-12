// Problem: https://leetcode.com/problems/two-sum/
// Time Complexity: O(n)
// Space Complexity: O(n), length of the nums array

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap to store element(nums value) and index pairs
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            // if hashmap contains the target-nums[i] key then 
            // return the index of target-nums[i] and i
            if (hmap.containsKey(target-nums[i]))
                return new int[] {hmap.get(target-nums[i]), i};

            // if element pair is not exists in the hashmap then add/put it
            hmap.put(nums[i], i);
        }

        // worst case if target sum is not found then return null
        return null;
    }
}
