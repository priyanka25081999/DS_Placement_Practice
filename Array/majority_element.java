// Array : Find majority element
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// https://leetcode.com/problems/majority-element/

// First solution
// Very simple method
class Solution {
    public int majorityElement(int[] nums) {    
        // Sort the array
        Arrays.sort(nums);
        // Majority element should present at middle position of an array
        return nums[nums.length/2];
    }
}

// Second solution
// Using Hashmap
/* class Solution {
     public int majorityElement(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // declare the hashmap
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        { 
            // add the element with frequency
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        
        int i;
        for(i=0; i<nums.length; i++)
        {   // compare frequency, 
            // if frequency greater than n/2, return the element
            int val = hmap.get(nums[i]);
            if(val > (nums.length/2))
                break;
        }
        
        return nums[i];
    }
}
*/
