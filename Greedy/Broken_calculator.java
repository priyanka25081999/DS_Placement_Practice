// Greedy approach : Broken calculator
// https://leetcode.com/problems/broken-calculator/

class Solution {
    public int brokenCalc(int startValue, int target) {
        
        int cnt=0;
        
        // Start from the target until we get the startValue (opposite way)   
        // Opposite operations than given the problem
        // Example 1 : 
        /*
            startValue = 5, target=8
            startValue is less than target here, target%2 is equal to 0, hence target contains 
            4, Increase the counter by 1. Target is less than startValue now. 
            Hence, cnt = 1 + 5 - 4. cnt=2.
        */
        while(startValue < target)
        {
            if(target%2 == 0)
            {
                // divide the number by 2
                target = target / 2;
            }
            else
            {
                // increase the number by 1
                target = target + 1;
            }
            
            // for each condition, increase the cnt by 1
            cnt++;
        }
        
        // Now subtract the cnt + startValue from target
        cnt = cnt + startValue - target;
        return cnt;
    }
}
