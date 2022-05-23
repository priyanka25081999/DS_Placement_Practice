// Array : Remove duplicates from sorted array
// Leetcode : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Linear Search approach - O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[i-1])
                nums[k++] = nums[i];
        }
        return k;
    }
}
