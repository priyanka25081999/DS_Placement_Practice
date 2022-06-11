// Array : 3sum
// Leetcode : https://leetcode.com/problems/3sum/
// Brute force method - O(n3*long(n))

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        if(n<3)
            return ans;
        
        for(int i=0; i<n-2; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    List<Integer> list = new ArrayList<>();
                    
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        
                        Collections.sort(list);
                        
                        if(!ans.contains(list))
                            ans.add(list);
                    }
                }
            }
        }
        
        return ans;
    }
}

// Right now getting time limit exceeded exception
