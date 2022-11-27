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

/* Idea -
We can easily see whether it is rotated if goal can be found in (s + s).
For example, with s = "abcde", goal = "cdeab", we have

“abcdeabcde” (s + s)
  “cdeab” (goal)
goal is found in (s + s), so goal is a rotated string of A.
*/
