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

// Using HashMap approach
// Time complexity : O(N)
// Space complexity : O(N), as we are using extra map to store the frequency

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        
        for(int i=0; i<nums.length; i++) {
            int freq = hmap.get(nums[i]);
            if(freq==1)
                return nums[i];
        }
        
        return -1;
    }
}

// Let's reduce the space complexity
// Approach-3 : Bit manipulation, XOR operator
// We can XOR all the numbers in the given input, as per XOR properties; 
// All the duplicate number will zero out each other and we will be left with single number.
// XOR Rules:
// Rule 1 : If both bits are 1 then XOR'ed bit will be 0. 
// Rule 2 : If both bits are 0 then XOR'ed bit will be 0. Rule 3
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int no = 0;
        
        for(int i : nums) {
            // duplicate numbers zero out each other
            no = no ^ i;
        }
        
        return no;
    }
}
