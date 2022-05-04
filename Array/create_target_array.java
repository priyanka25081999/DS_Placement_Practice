// Array : Create a target array in the given order
// https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[] = new int[nums.length];
        ArrayList<Integer> alist = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            // index[i] = index, nums[i] = value
            // It inserts the specified element at the specified position in this list.
            // It shifts the element currently at that position (if any) and any subsequent               
            // elements to the right (will add one to their indices).
            alist.add(index[i], nums[i]);
        }
        
        for(int i=0; i<alist.size(); i++)
        {
            arr[i] = alist.get(i);
        }
        
        return arr;
    }
}
