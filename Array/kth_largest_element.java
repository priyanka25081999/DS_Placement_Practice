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

// Second approach - Priority Queue
// Total time complexity - O(nlogn)
/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // add array elements into priority queue
        for(int i : nums)
            pq.add(i);
        
        // Remove an element if queue size is greater than k
        while(pq.size() > k)
            pq.remove();
        
        // remove the kth largest element.
        return pq.remove();
    }
}
*/
