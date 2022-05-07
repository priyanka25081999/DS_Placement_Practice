// Array : find the highest altitude
// https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int high_altitude = 0;
        
        for(int i=0; i<gain.length; i++)
        {
            sum = sum + gain[i];
            
            // calculate max, to return highest altitude
            high_altitude = Math.max(high_altitude, sum);
        }
        
        return high_altitude;
    }
}
