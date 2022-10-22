// Array - Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/
// Approach-1 : Sort the array and check duplicates
// Time Complexity:  O(N*logN), Sorting takes N*logN. Times where N is the length of the array
// Space Complexity: O(1), Since we are not using any extra space. If we are not counting extra space taken by sorting.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}

// HashSet approach
// Time complexity : O(N)
// Space complexity : O(N) as we are using additional data structure

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet
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

// HashMap approach
// Time complexity : O(N)
// Space complexity : O(N) as we are using additional data structure

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            int cnt = hmap.get(nums[i]);
            
            if(cnt > 1)
                return true;
        }
        return false;
    }
}
