// Array : Find the kth largest element in an array
// Leetcode : https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

// Second approach : Priority Queue
// A priority queue is a special type of queue in which each element is associated with a priority value. And, elements are served on the basis of their priority. 
// That is, higher priority elements are served first. However, if elements with the same priority occur, they are served according to their order in the queue.

/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : nums)
            pq.add(i);
        
        while(pq.size() > k)
            pq.remove();
        
        // remove the kth largest element
        return pq.remove();
    }
}
*/
