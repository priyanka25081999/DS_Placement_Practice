// Array : Find the value equals to index value
// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing )
// GeeksforGeeks (Love Babber series) : https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1/?page=1&curated[]=7&sortBy=submissions#

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == i+1)
                list.add(i+1);
        }
        
        return list;
    }
}
