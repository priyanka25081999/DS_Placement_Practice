// String : Rotate String
// Leetcode : https://leetcode.com/problems/rotate-string/
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public boolean rotateString(String s, String goal) {
        // if both string lengths are same and
        // if goal string presents in the s string then return true
        
        return (s.length() == goal.length() && (s+s).contains(goal));
    }
}
