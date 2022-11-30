// String : Count number of substrings
// GFG : https://practice.geeksforgeeks.org/problems/count-number-of-substrings4528/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-number-of-substrings
// Approach : HashMap approach
// Time complexity : O(N)
// Space complexity : O(N), as we are using an extra space for hashmap

class Solution
{
    public static boolean isValid(String s, int k) {
        // base case
        if(s.length() < k)
            return false;
            
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(!hmap.containsKey(ch))
                hmap.put(ch, i);
        }
        
        if(hmap.size() == k)
            return true;
        
        return false;
    }
    
    long substrCount (String S, int K) {
        // your code here
        long ans = 0;
        
        for(int i=0; i<S.length(); i++) {
            for(int j=i+K; j<=S.length(); j++) {
                if(isValid(S.substring(i, j), K))
                    ans++;
            }
        }
        
        return ans;
    }
}
