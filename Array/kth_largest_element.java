// Array : Find the kth largest element in an array
// Leetcode : https://leetcode.com/problems/kth-largest-element-in-an-array/

// Simple approach
// Sort the array and return the 'arraylength-k'th element
// Let say for sorting it takes O(nlogn) time (in case of merge/quick sort)
// So, total time complexity would be O(nlogn)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Sort the array
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

