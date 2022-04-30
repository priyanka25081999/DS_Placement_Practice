// Array : Check if two arrays are equal or not 
// GeeksForGeeks - https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/?page=1&curated[]=1&curated[]=7&sortBy=submissions#

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<N; i++)
        {
            if(A[i] != B[i])
               return false;
        }
        return true;
    }
}
