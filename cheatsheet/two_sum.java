// Array : Two Sum
// Leetcode : https://leetcode.com/problems/two-sum/
// Brute force : O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int two_sum[] = new int[2];
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i; j<nums.length; j++)
            {
                int sum = nums[i] + nums[j];
                if(sum == target && i!=j)
                {
                    two_sum[0]=i;
                    two_sum[1]=j;
                    break;
                }
            }
        }
        
        return two_sum;
    }
}

// HashMap approach - O(n)
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int two_sum[] = new int[2];
        
        for(int i=0; i<nums.length; i++)
        {
            // if a key already present in the hashmap, it means we got the pair
            // add this into final array
            // Example : nums[i] = 7. if hmap contains 7 then it will add the pair into final array
            if(hmap.containsKey(nums[i]))
            {
                two_sum[0] = hmap.get(nums[i]);
                two_sum[1] = i;
            }
            else
            {
                // put the difference value into the hashmap
                // Example : nums[i] = 2, target-nums[i] = 9-2=7, i=0. KV={7,0};
                
                hmap.put(target-nums[i], i);
            }
        }
        
        return two_sum;
    }
}
*/
