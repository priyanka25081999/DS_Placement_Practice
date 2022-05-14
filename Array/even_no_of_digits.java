// Array : Find numbers with even number of digits
// Leetcode : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int even_no=0;
        for(int i=0; i<nums.length; i++)
        {
            int no = nums[i];
            int count=0;
          
            // count the digits of the number
            while(no!=0)
            {
                int rem = no%10;
                count++;
                no = no/10;
            }
            
            // increase even_no by 1, if count is even
            if(count%2 == 0)
                even_no++;
        }
        
        return even_no;
    }
}
