// Bit manipulation : Find All Duplicates in an Array
// Leetcode : https://leetcode.com/problems/find-all-duplicates-in-an-array/
// HashMap approach : Getting Time Limit Exceeded (TLE)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            int freq = hmap.get(nums[i]);
            
            if(freq == 2)
            {    
                if(!list1.contains(nums[i]))
                    list1.add(nums[i]);
            }
        }
        
        return list1;
    }
}
