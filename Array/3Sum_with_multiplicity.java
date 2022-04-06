// Array : 3Sum with multiplicity 
// https://leetcode.com/problems/3sum-with-multiplicity/

// HashMap approach
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int mod=(int)(1e9+7);
        hm.put(arr[0], 1);
        int ans=0;
        for(int i=1;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]>target) 
                    continue;
                else {
                    int re=target-(arr[i]+arr[j]);
                    if(hm.containsKey(re)) 
                        ans=(ans%mod+hm.get(re)%mod)%mod;
                }
            }
            if(hm.containsKey(arr[i])) 
                hm.put(arr[i], hm.get(arr[i])+1);
            
            else 
                hm.put(arr[i], 1);
        }
        return ans;
    }
}

// Brute force approach (Getting TLE) - WIP
/*
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int count=0;
        int i,j,k;
        
        for(i=0; i<arr.length; i++)
        {
            for(j=i+1; j<arr.length; j++)
            {
                for(k=j+1; k<arr.length; k++)
                {
                    if(i<j && j<k)
                    {
                        if(arr[i] + arr[j]+arr[k] == target)
                            count++;
                    }
                }
            }
        }
        
        return count;
    }
}
*/
