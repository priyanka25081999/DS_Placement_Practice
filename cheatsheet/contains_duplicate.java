// Array : Contains Duplicate
// Approach-1 : Linear method 
// Time complexity - O(nlogn) (performed sorting, assumed merge/quick sort)
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

/* 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // first approach
        // sort the array and compare the elements with each other
        // if we found anyone duplicate then return true, else false
        
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
*/

// Approach-2 : HashMap
// Time complexity - O(n) (traverse the array once)
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
