// Find the duplicate number
// Leetcode: https://leetcode.com/problems/find-the-duplicate-number/description/
// Hashset approach
// Time complexity : O(N)
// Space complexity : O(N) as we are using additional data structure

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(hset.contains(nums[i]))
                return nums[i];

            hset.add(nums[i]);
        }

        return -1;
    }
}
