// Array-Heap : Top K Frequent Elements
// Leetcode : https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // sort
        Arrays.sort(nums);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int res[] = new int[k];
        
        for(int i=0; i<nums.length; i++)
        {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        
        // now we can create a max heap
        PriorityQueue<Integer> max_heap = new PriorityQueue<>((a,b)->hmap.get(b)-hmap.get(a));
        
        for(int key : hmap.keySet())
            max_heap.add(key);
        
        // retrieve 2 frequent keys
        for(int i=0; i<k; i++)
            res[i] = max_heap.poll();
        
        return res;
    }
}
