// Array : Shuffle the array
// https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
        int i,k=0;
        
        for(i=0; i<n; i++)
        {
            res[k] = nums[i];
            k+=2;
        }
        
        k=1;
        for(i=n; i<nums.length; i++)
        {
            res[k] = nums[i];
            k+=2;
        }
        return res;
    }
}

/* Another approach

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
        int i,k=0,j;
        
        for(i=0, j=n; i<n && j<nums.length; i++, j++)
        {
            res[k] = nums[i];
            res[k+1] = nums[j];
            k = k+2;
        }
        
        return res;
    }
}

*/
