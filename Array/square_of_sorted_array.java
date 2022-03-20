// Array : Squares of a sorted array
// https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int j=0;
        
        for(int no : nums)
        {
            // calculate the square and store in the result array
            res[j++] = no*no;
        }
        
        // Sort the result array
        Arrays.sort(res);
        return res;
    }
}
