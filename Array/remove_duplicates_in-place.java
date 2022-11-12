// Array : Remove Duplicates from Sorted Array
// Leetcode : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach-1 : HashSet
// Time complexity : O(NLogN) + O(N) ---> O(nlogn) for sorting the collection and O(n) for the iteration
// Space complexity: O(N) ---> We are storing an elements in hashset additionally takes a space

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
                hset.add(nums[i]);
        }
        
        ArrayList<Integer> arr = new ArrayList<>(hset);
        Collections.sort(arr);
        
        for(int i=0; i<hset.size(); i++)
            nums[i] = arr.get(i);
        
        return arr.size();
    }
}

// Approach-2 : Two pointers
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j])
            {
                i++;
                // nums[i] directly contains value of nums[j] as they are unequal
                // it may possible i and j stays are same position and i gets jth value and then j moves to next for the next iteration
                nums[i] = nums[j];
            }
        }
        
        return i+1;
    }
}
