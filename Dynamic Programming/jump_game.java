// DP : Jump Game
// Leetcode : https://leetcode.com/problems/jump-game/
// Simple approach : Brute force, visit the elements of an array at least once with some slight modification in the logic

class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        
        for(int i=0; i<=max_reach; i++)
        {
            max_reach = Math.max(max_reach, i+nums[i]);
            if(max_reach>=nums.length-1)
                return true;
        }
        
        return false;
    }
}
