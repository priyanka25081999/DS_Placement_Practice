// DP : Decode ways
// Leetcode : https://leetcode.com/problems/decode-ways/
// Recursion + Memoization approach
// Time complexity : O(N)
// Space complexity : O(N) + O(N)

class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return helper(s, 0, dp);
    }
    
    public int helper(String s, int index, int dp[])
    {
        if(index==s.length())
            return 1;
        
        // As there is no alphabet having digit zero
        if(s.charAt(index) == '0')
            return 0;
        
        if(dp[index]!=-1)
            return dp[index];
        
        // take one digit
        int take = helper(s, index+1, dp);
        
        // if index is less than string length and if character we are making is less than 27 or less than equal to 26 then take it
        if(index<s.length()-1 && ((s.charAt(index)-'0')*10 + (s.charAt(index+1)-'0')) <= 26)
            take += helper(s, index+2, dp);
            
        return dp[index] = take;
    }
}
