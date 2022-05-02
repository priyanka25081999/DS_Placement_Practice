// Array : Kids With the Greatest Number of Candies
// Return a boolean array result of length n, where result[i] is true if, 
// after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        
        for(int i=0; i<candies.length; i++)
        {
            int sum = candies[i] + extraCandies;
            
            // Arrays.stream(candies).max().getAsInt() -  returns the greatest candies
            // Example: [2,3,5,1,3], extraCandies = 3, above statement returns 5.
            if(sum >= Arrays.stream(candies).max().getAsInt())
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}
