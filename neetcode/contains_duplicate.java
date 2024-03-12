// Problem: https://leetcode.com/problems/contains-duplicate/description/
// Approach-1 : Sort the array and check duplicates
// Time Complexity:  O(N*logN), Sorting takes N*logN. Times where N is the length of the array
// Space Complexity: O(1), Since we are not using any extra space. If we are not counting extra space taken by sorting.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }

        return false;
    }
}

// HashSet approach
// HashSet details: https://github.com/priyanka25081999/DS_Placement_Practice/blob/main/my%20notes/hashset.md
// Time complexity : O(N)
// Space complexity : O(N) as we are using additional data structure
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> hset = new HashSet<>();

       for(int i=0; i<nums.length; i++)
       {
        if(hset.contains(nums[i]))
            return true;
        hset.add(nums[i]);
       }

       return false;
    }
}
