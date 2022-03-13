// Counting Bits
// First find binary representation of the number and 
// then count the number of 1's from the binary representation.
// https://leetcode.com/problems/counting-bits/

class Solution {
    
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        int cnt;
        
        for(int i=0; i<=n; i++)
        {
            //int binary_no = get_binary(i);
            int temp = i;
            cnt=0;
            
            // find the binary representation of number
            while(temp!=0)
            {
                int rem = temp % 2;
                
                // increament the count if remainder contains 1
                if (rem == 1)
                    cnt++;
                temp = temp / 2;
            }
            
            // store the counter(1's count) value in the array
            arr[i] = cnt;
        }
        
        return arr;
    }
}
