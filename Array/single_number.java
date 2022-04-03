// Array : Find single element from an array
// Set data structure : Java HashSet always contains unqiue elements
// https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        // declare a set
        Set<Integer> single_number_set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++)
        {
            // if element not present in set, add it
            if(!single_number_set.contains(nums[i]))
                single_number_set.add(nums[i]);
            // Remove element, if duplicate
            else 
                single_number_set.remove(nums[i]);
        }
        
        // return the single number from set
        return single_number_set.iterator().next();
    }
}
