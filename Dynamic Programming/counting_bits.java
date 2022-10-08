// DP : Counting bits
// Leetcode : https://leetcode.com/problems/counting-bits/
// Approach : Brute force
// Time complexity : O(NLogN)
// Space complexxity : O(NLogN)

class Solution {
    
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        int cnt;
        
        for(int i=0; i<=n; i++)
        {
            //int binary_no = get_binary(i);
            int temp = i;
            cnt=0;
            
            while(temp!=0)
            {
                int rem = temp % 2;
                if (rem == 1)
                    cnt++;
                temp = temp / 2;
            }
            
            arr[i] = cnt;
        }
        
        return arr;
    }
}

// Second optimized approach : Dynamic Programming - Memorization
// Time complexity : O(N)
// Space complexity : O(N)

class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        
        for(int i=0; i<=n; i++)
            res[i] = solve(i, res);
        
        return res;
    }
    
    public int solve(int n, int memo_table[])
    {
        if(n==0)
            return 0;
        if(n==0)
            return 1;
        
        if(memo_table[n]!=0)
            return memo_table[n];
        
        if(n%2==0)
        {
            memo_table[n] = solve(n/2, memo_table);
            return solve(n/2, memo_table);
        }
        else
        {
            memo_table[n] = 1+solve(n/2, memo_table);
            return 1+solve(n/2, memo_table);
        }
    }
}
