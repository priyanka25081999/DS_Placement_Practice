// DP : Longest Common Subsequence
// Leetcode : https://leetcode.com/problems/longest-common-subsequence/
// Time Complexity: O(N*M) : There are N*M states therefore at max ‘N*M’ new problems will be solved.
// Space Complexity: O(N*M) + O(N+M) : We are using an auxiliary recursion stack space(O(N+M)) 
// In the worst case, we will go till N+M calls at a time and a 2D array (O(N*M)).

// Memorization approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int s1_len = text1.length();
        int s2_len = text2.length();
        int dp[][] = new int[s1_len][s2_len];
        
        for(int rows[]: dp)
            Arrays.fill(rows,-1);
        
        return helper(text1, text2, s1_len-1, s2_len-1, dp);
    }
    
    public int helper(String text1, String text2, int index1, int index2, int dp[][])
    {
        // base case
        if(index1<0 || index2<0)
            return 0;
        
        // check memo table
        if(dp[index1][index2] != -1)
            return dp[index1][index2];
        
        // check if two characters are equal
        // move both increase to left by 1
        if(text1.charAt(index1) == text2.charAt(index2))
            return dp[index1][index2] = 1+helper(text1, text2, index1-1, index2-1, dp);
        
        // check if two characters are not equal
        // Get the max by removing 1 character from one string and keeping the same from another and viz.
        else
            return dp[index1][index2] = 0 + Math.max(helper(text1, text2, index1, index2-1, dp), helper(text1, text2, index1-1, index2, dp));
            
    }
}
