// Problem: https://leetcode.com/problems/top-k-frequent-elements/
// Hashmap approach
// create a hashmap and store the count of array element
// Now, sort the hashmap values using priority queue
// Finally add keys to the hashmap and return the top K keys

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int res[] = new int[k];

        for (int i=0; i<nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }

        // sort by hmap values
        // creates a max heap (PriorityQueue) of integers where the elements are ordered based on their values in the hmap HashMap, 
        // with the highest value at the top of the heap.
        PriorityQueue<Integer> max_heap = new PriorityQueue<>((a,b)->hmap.get(b)-hmap.get(a));

        // add keys to heap
        for(int key: hmap.keySet()) {
            max_heap.add(key);
        }

        // return top k keys
        for(int i=0; i<k; i++) {
            res[i] = max_heap.poll();
        }

        return res;
    }
}
