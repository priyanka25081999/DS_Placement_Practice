// Array : Two sum
// https://leetcode.com/problems/two-sum/
// Time complexity : O(N^2)
// Space complexity : O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(i!=j && nums[i]+nums[j] == target)
                {    ans[0] = i;
                     ans[1] = j;
                }
            }
        }
        
        return ans;
        
    }
}

// Approach-2 : Two pointers
// Time complexity : O(NLogN)
// Space complexity : O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        
        // copy data from original array to dummy array
        int [] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[i]=nums[i];
        }
        
        // sort the array
        Arrays.sort(nums);
        
        int[] ans = new int[2];
        while(left < right){
            if(nums[left]+nums[right] < target){
                left++;
            }
            if(nums[left]+nums[right] > target){
                right--;
            }
            if(nums[left]+nums[right] == target){
                break;
            }
        }
        
        // get the value of elements
        int leftValue = nums[left];
        int rightValue = nums[right];   
        
        // get the actual indices
        for(int i = 0;  i < temp.length; i++){
            if(temp[i] == leftValue){
                ans[0] = i;
                break;
            }
            
        }
        for(int i = temp.length-1;  i >=0; i--){
            
            if(temp[i] == rightValue){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}

// Approach-3 : HashMap - Efficient solution
// Time complexity : O(N)
// Space complexity : O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap to store element(nums value) and index pairs
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            // if hashmap contains the target-nums[i] key then 
            // return the index of target-nums[i] and i
            if(hmap.containsKey(target-nums[i]))
                return new int[] { hmap.get(target-nums[i]), i};
            
            // if element pair is not exists in the hashmap then add/put it
            hmap.put(nums[i], i);
        }
        
        // worst case if target sum is not found then return null
        return null;
    }
}

