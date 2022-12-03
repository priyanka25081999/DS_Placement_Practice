// String : Sum of Beauty of all substrings
// Leetcode : https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
// Time complexity : O(N^2), we are using 2 for loops to get substrings
// Space complexity : O(N) where N=26, as we are using an array to store the frequency of 26 alphabets (characters)

class Solution {
    public int beautySum(String s) {
        int sum = getSubstring(s);
        return sum;
    }
    
    int getBeautySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int cnt : arr) {
            if(cnt > 0) {
                max = Math.max(max, cnt);
                min = Math.min(min, cnt);
            }
        }
        
        return max-min;
    }
    
    int getSubstring(String s) {
        int sum = 0;
        
        // start at each index
        for(int i=0; i<s.length()-1; i++) {
            int freq[] = new int[26];
            char ch = s.charAt(i);
            freq[ch-'a']++;
            
            // keep incrementing the length of substring, add in map and calculate beauty based on updated map. here i+j - substring
            for(int j=1; i+j<s.length(); j++) {
                // substring
                ch = s.charAt(i+j);
                freq[ch-'a']++;
                
                // get the beauty sum of all substrings
                int beautysum = getBeautySum(freq);
                if(beautysum > 0)
                    sum = sum + beautysum;
            }
        }
        
        return sum;
    }
}
