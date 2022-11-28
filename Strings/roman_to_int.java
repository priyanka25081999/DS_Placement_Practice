// String : Roman to Integer
// Leetcode : https://leetcode.com/problems/roman-to-integer/
// Approach : HashMap approach
// Time complexity : O(N)
// Space complexity : O(N), as we are using an extra space for hashmap

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        
        char prev = s.charAt(s.length()-1);
        int ans = 0;
        
        for(int i=s.length(); i>0; i--) {
            char curr = s.charAt(i-1);
            
            //System.out.print("curr = "+curr+" prev = "+prev);
            
            if(hmap.get(curr) < hmap.get(prev))
                ans = ans - hmap.get(curr);
            else
                ans = ans + hmap.get(curr);
            
            //System.out.println(" ans = "+ ans);
            prev = curr;
        }
        
        return ans;
    }
}

/* Example:

Input : "MCMXCIV"

Working:
curr = V prev = V ans = 5
curr = I prev = V ans = 4
curr = C prev = I ans = 104
curr = X prev = C ans = 94
curr = M prev = X ans = 1094
curr = C prev = M ans = 994
curr = M prev = C ans = 1994

*/
