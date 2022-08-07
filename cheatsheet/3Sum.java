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
// Approach-2 : Using HashSet (Brute force method - Getting Time Limit Exceeded)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> final_list = new HashSet<>();
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length-1; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> int_list = new ArrayList<>();

                        int_list.add(nums[i]);
                        int_list.add(nums[j]);
                        int_list.add(nums[k]);
                        Collections.sort(int_list);
                        final_list.add(int_list);
                    }
                }
            }
        }
        
        return new ArrayList<>(final_list);
    }
}



